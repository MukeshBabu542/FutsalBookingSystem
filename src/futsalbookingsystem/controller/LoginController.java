/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futsalbookingsystem.controller;

import futsalbookingsystem.dao.UserDao;
import futsalbookingsystem.model.LoginRequest;
import futsalbookingsystem.model.UserData;
import futsalbookingsystem.view.DashboardView;
import futsalbookingsystem.view.LoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import futsalbookingsystem.controller.email.SMTPMailSender;
import futsalbookingsystem.dao.UserDao;
import futsalbookingsystem.model.LoginRequest;
import futsalbookingsystem.model.ResetPasswordRequest;
import futsalbookingsystem.model.UserData;
//import futsalbookingsystem.view.DashboardTabbedView;
//import futsalbookingsystem.view.DashboardView;
import futsalbookingsystem.view.LoginView;
import futsalbookingsystem.view.RegistrationView;

/**
 *
 * @author sangyakoirala
 */
public class LoginController {
    private LoginView view;
//    UserDao userDao= new UserDao();

    public LoginController(LoginView view){
        this.view=view;
        LoginUser loginUser = new LoginUser();
        this.view.loginUser(loginUser); 
//        this.view.forgotPassword(new ResetPassword());
//        this.view.registrationNav(new RegistrationNav());
//        this.view.loginUser(new LoginUser());

    }
    public void open(){
        view.setVisible(true);
    }
    public void close(){
        view.dispose();
    }
    class LoginUser implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String email=view.getEmailTextField().getText();
            String password = String.valueOf(view.getPasswordField().getPassword());
            if (email.isEmpty()||password.isEmpty()){
                JOptionPane.showMessageDialog(view, "Fill in all the fields");
            } else {
               LoginRequest loginReq = new LoginRequest(email,password);
               UserDao userDao = new UserDao();
               UserData user = userDao.Login(loginReq);
               if(user==null){
                   JOptionPane.showMessageDialog(view,"Login failed");
                   
               }else{
                   DashboardView dashboardView = new DashboardView();
                   DashboardController dashboardController = new DashboardController(dashboardView,user);
                   dashboardController.open();
                   close();
               }
            }
        }
        
    }
    class ResetPassword implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            String email= JOptionPane.showInputDialog(view,"Enter your email");
            if(email.trim().isEmpty()){
                JOptionPane.showMessageDialog(view, "Email field was empty");
            } else{
                UserDao userDao= new UserDao();
                boolean emailExists = userDao.checkEmail(email);
                if (!emailExists){
                    JOptionPane.showMessageDialog(view, "User does not exist");
                } else {
                    String otp ="321456";
                    String title="Reset Password Verification";
                    String body="The otp to reset your password is "+otp;
                    boolean emailSent = SMTPMailSender.sendMail(email,title,body);
                    if (!emailSent){
                        JOptionPane.showMessageDialog(view,"Failed to send otp. Try again later.");
                    } else {
                        String receivedOtp= JOptionPane.showInputDialog(view,"Enter the otp");
                        if (receivedOtp.trim().isEmpty() || !otp.equals(receivedOtp) ){
                            JOptionPane.showMessageDialog(view,"Invalid otp");
                        } else{
                            String newPassword= JOptionPane.showInputDialog(view,"Enter the new password");
                            if(newPassword.trim().isEmpty()){
                                JOptionPane.showMessageDialog(view,"Password field was empty");
                            } else{
                                ResetPasswordRequest reset = new ResetPasswordRequest(email,newPassword);
                                boolean passwordChanged = false;
//                                boolean passwordChanged= userDao.resetPassword(reset);
                                if(!passwordChanged){
                                    JOptionPane.showMessageDialog(view, "Failed to reset password");
                                } else {
                                    JOptionPane.showMessageDialog(view, "Password has been changed");
                                }
                            }
                        }
                    }
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    class RegisterNavigation implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            RegistrationView registerView = new RegistrationView();
            RegistrationController registerController = new RegistrationController(registerView);
            registerController.open();
            close();
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
}



//import futsalbookingsystem.dao.UserDao;
//import futsalbookingsystem.model.LoginRequest;
//import futsalbookingsystem.model.UserData;
//import futsalbookingsystem.view.LoginView;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JOptionPane;
//
//
///**
// *
// * @author lenovo
// */
//public class LoginController {
//    private LoginView view;
//    public LoginController(LoginView view){
//        this.view = view;
//        LoginUser loginUser = new LoginUser();
//        this.view.loginUser(loginUser);
//        
//        
//    }
//    public void open(){
//        view.setVisible(true);
//    }
//    public void close(){
//        view.dispose();
//    }
//    class LoginUser implements ActionListener{
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            String email = view.getEmailTextField().getText();
//            String password = String.valueOf(view.getPasswordField().getPassword());
//            if (email.isEmpty()||password.isEmpty()){
//                JOptionPane.showMessageDialog(view,"Fill in all the fields");
//            } else {
//               LoginRequest loginReq = new LoginRequest(email,password);
//               UserDao userDao = new UserDao();
//               UserData user = userDao.login(loginReq);
//               if(user==null){
//                   JOptionPane.showMessageDialog(view,"Login failed");
//                   
////               }else{
////                   DashboardView dashboardView = new DashboardView();
////                   DashboardController dashboardController = new DashboardController(dashboardView,user);
////                   dashboardController.open();
////                   close();
//               }
//            }
//        }
//    }
//    
//}