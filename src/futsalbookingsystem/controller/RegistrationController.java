/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futsalbookingsystem.controller;

import futsalbookingsystem.model.UserData;
import futsalbookingsystem.view.LoginView;
import futsalbookingsystem.view.RegistrationView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class RegistrationController {
//    object for view you want to control
    private RegistrationView registrationView= new RegistrationView();
//    pass the view to Constructor
    public RegistrationController(RegistrationView registerView){
//        initialize the view
        this.registrationView=registerView;
        this.registrationView.registerUser(new RegistrationUser());
    }
    public void open(){
        this.registrationView.setVisible(true);
        
    }
    public void close(){
        this.registrationView.dispose();
        

      

        
    }
    class RegistrationUser implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           String name= registrationView.getNameTextField().getText();
           String email= registrationView.getEmailTextField().getText();
           String phonenumber = registrationView.getPhoneTextField().getText();
           String password= String.valueOf(registrationView.getPasswordField().getPassword());
           String confirmPassword = String.valueOf(registrationView.getConfirmPasswordField().getPassword());
           if (name.isEmpty()||name.equals("   Enter your full name")||email.isEmpty()||phonenumber.isEmpty()||phonenumber.equals("   Enter your phone number")||password.isEmpty()||confirmPassword.isEmpty()){
               JOptionPane.showMessageDialog(registrationView,"Fill in all the fields");
           } else if (!password.equals(confirmPassword)){
               JOptionPane.showMessageDialog(registrationView,"Passwords do not match");
               
           }else {
               UserData user = new UserData(name.strip(),email.strip(),phonenumber.strip(),password.strip());
               UserDao userDao = new UserDao();
               boolean result = userDao.registration(user);
               if (result){
                   JOptionPane.showMessageDialog(registrationView, "Registered Successfully");
                   LoginView loginView = new LoginView();
                   LoginController loginController = new LoginController(loginView);
                   loginController.open();
                   

                   
               }else{
                   JOptionPane.showMessageDialog(registrationView,"Failed to Register");
               }
           }
           if (!email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
    JOptionPane.showMessageDialog(registrationView, "Invalid email format.");
    return;
}
           
        }
        
    }
    
}