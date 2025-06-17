package futsalbookingsystem.controller;

import futsalbookingsystem.model.UserData;
import javax.swing.JOptionPane;
import futsalbookingsystem.view.ChangeKnownPasswordView;

public class ChangePasswordController {

    private ChangeKnownPasswordView view;

    public ChangePasswordController(ChangeKnownPasswordView view) {
        this.view = view;
        initController();
    }

    private void initController() {
        view.getChangeButton().addActionListener(e -> changePassword());
    }

    private void changePassword() {
        String oldPass = new String(view.getOldPasswordField().getPassword());
        String newPass = new String(view.getNewPasswordField().getPassword());
        String confirmPass = new String(view.getConfirmPasswordField().getPassword());

        UserData user = UserData.getCurrentUser();

        if (user == null) {
            JOptionPane.showMessageDialog(view, "No user is currently logged in.");
            return;
        }

        if (!oldPass.equals(user.getPassword())) {
            JOptionPane.showMessageDialog(view, "Old password is incorrect.");
            return;
        }

        if (newPass.isEmpty() || confirmPass.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Password fields cannot be empty.");
            return;
        }

        if (!newPass.equals(confirmPass)) {
            JOptionPane.showMessageDialog(view, "New password and confirmation do not match.");
            return;
        }

        user.setPassword(newPass);
        JOptionPane.showMessageDialog(view, "Password changed successfully.");
        view.dispose();
    }
}
