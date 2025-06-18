package futsalbookingsystem.model;

public class ChangePassword {

    /**
     * Validates the password change attempt.
     *
     * @param oldPasswordInput The old password entered by the user.
     * @param newPassword The new password entered by the user.
     * @param confirmPassword The confirmation of the new password.
     * @param actualOldPassword The actual old password stored for the user.
     * @return null if validation passes, otherwise an error message.
     */
    public static String validatePasswordChange(
            String oldPasswordInput,
            String newPassword,
            String confirmPassword,
            String actualOldPassword
    ) {
        if (!oldPasswordInput.equals(actualOldPassword)) {
            return "Old password is incorrect.";
        }
        if (newPassword == null || newPassword.isBlank() ||
            confirmPassword == null || confirmPassword.isBlank()) {
            return "Password fields cannot be empty.";
        }
        if (!newPassword.equals(confirmPassword)) {
            return "New password and confirmation do not match.";
        }
        if (newPassword.length() < 6) {
            return "New password must be at least 6 characters long.";
        }
        // Add more validation as needed
        return null; // No error, validation passed
    }
}
