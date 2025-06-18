package futsalbookingsystem.controller;

import futsalbookingsystem.model.UserData;
import javax.swing.JOptionPane;
import futsalbookingsystem.view.ChangeKnownPasswordView;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class ChangePasswordController {

    private final ChangeKnownPasswordView view;

    public ChangePasswordController(ChangeKnownPasswordView view) {
        this.view = view;
        initializeController();
    }

    private void initializeController() {
        // Get the change button from view and add action listener
        JButton btnChange = (JButton) view.getChangeButton();
        btnChange.addActionListener(e -> changePassword());
    }

    private void changePassword() {
        // Retrieve password fields from view
        JPasswordField oldPassField = (JPasswordField) view.getOldPasswordField();
        JPasswordField newPassField = (JPasswordField) view.getNewPasswordField();
        JPasswordField confirmPassField = (JPasswordField) view.getConfirmPasswordField();

        // Convert password fields to strings
        String oldPassword = new String(oldPassField.getPassword());
        String newPassword = new String(newPassField.getPassword());
        String confirmPassword = new String(confirmPassField.getPassword());

        // Get currently logged-in user
        UserData currentUser = UserData.getCurrentUser();

        // Validation checks
        if (currentUser == null) {
            JOptionPane.showMessageDialog(view, 
                "No user logged in. Please login first.", 
                "Authentication Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!currentUser.getPassword().equals(oldPassword)) {
            JOptionPane.showMessageDialog(view, 
                "Old password is incorrect", 
                "Validation Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (newPassword.isBlank() || confirmPassword.isBlank()) {
            JOptionPane.showMessageDialog(view, 
                "New password fields cannot be empty", 
                "Validation Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!newPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(view, 
                "New password and confirmation do not match", 
                "Validation Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Update password and show success
        currentUser.setPassword(newPassword);
        JOptionPane.showMessageDialog(view, 
            "Password changed successfully!", 
            "Success", 
            JOptionPane.INFORMATION_MESSAGE);
        
        view.dispose(); // Close the password change window
    }
}
