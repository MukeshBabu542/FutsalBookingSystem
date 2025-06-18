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
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class LoginController {
    private LoginView view;
    public LoginController(LoginView view){
        this.view = view;
        LoginUser loginUser = new LoginUser();
        this.view.loginUser(loginUser);
        
        
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
            String email = view.getEmailTextField().getText();
            String password = String.valueOf(view.getPasswordField().getPassword());
            if (email.isEmpty()||password.isEmpty()){
                JOptionPane.showMessageDialog(view,"Fill in all the fields");
            } else {
               LoginRequest loginReq = new LoginRequest(email,password);
               UserDao userDao = new UserDao();
               UserData user = userDao.Login(loginReq);
               if(user==null){
                   JOptionPane.showMessageDialog(view,"Login failed");
                   
               }else{
                   DashboardView dashboardView = new DashboardView(user.getEmail());
                   DashboardController dashboardController = new DashboardController(dashboardView,user);
                   dashboardController.open();
                   close();
               }
            }
        }
    }
    
}