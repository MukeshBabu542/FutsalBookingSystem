/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futsalbookingsystem.controller;

import futsalbookingsystem.model.UserData;
import futsalbookingsystem.view.ChangePasswordView;
import futsalbookingsystem.view.LoginView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */

public class ChangePassController {
    private final ChangePasswordView view;
    private final UserData currentUser;

    public ChangePassController(ChangePasswordView view, UserData user) {
        this.view = view;
        this.currentUser = user;

        this.view.getChangeButton().addActionListener(new ChangePasswordAction());
    }

    class ChangePasswordAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String oldPassword = String.valueOf(view.getOldPasswordField().getPassword()).trim();
            String newPassword = String.valueOf(view.getNewPasswordField().getPassword()).trim();
            String confirmPassword = String.valueOf(view.getConfirmPasswordField().getPassword()).trim();

            if (oldPassword.isEmpty() || newPassword.isEmpty() || confirmPassword.isEmpty()
                || oldPassword.equals("Enter your old password")
                || newPassword.equals("Enter your new password")
                || confirmPassword.equals("Confirm your new password")) {
                JOptionPane.showMessageDialog(view, "Please fill in all fields.");
                return;
            }

            if (!newPassword.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(view, "New passwords do not match.");
                return;
            }

            boolean changed = currentUser.changePassword(oldPassword, newPassword);
            if (changed) {
                JOptionPane.showMessageDialog(view, "Password changed successfully.");
                new LoginView().setVisible(true);
                view.dispose();
            } else {
                JOptionPane.showMessageDialog(view, "Old password is incorrect.");
            }
        }
    }
}
