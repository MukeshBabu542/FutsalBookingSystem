package futsalbookingsystem.view;


import java.awt.Color;
import java.awt.event.ActionListener;

public class RegistrationView extends javax.swing.JFrame {

    public RegistrationView() {
        initComponents();
    }
   

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        signinButton = new javax.swing.JButton();
        nameTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        confirmpasswordField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jTextField5.setText("jTextField5");

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registration");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 310, 70));

        signinButton.setBackground(new java.awt.Color(217, 217, 217));
        signinButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        signinButton.setText("Sign in");
        signinButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(signinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 200, 40));

        nameTextField.setBackground(new java.awt.Color(217, 217, 217));
        nameTextField.setText("   Enter your full name");
        nameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        nameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusLost(evt);
            }
        });
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 300, 40));

        phoneTextField.setBackground(new java.awt.Color(217, 217, 217));
        phoneTextField.setText("   Phone Number");
        phoneTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        phoneTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneTextFieldFocusLost(evt);
            }
        });
        getContentPane().add(phoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 300, 40));

        emailTextField.setBackground(new java.awt.Color(217, 217, 217));
        emailTextField.setText("   Enter your email");
        emailTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        emailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusLost(evt);
            }
        });
        getContentPane().add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 300, 40));

        passwordField.setBackground(new java.awt.Color(217, 217, 217));
        passwordField.setText("Enter your password");
        passwordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 300, 40));

        confirmpasswordField.setBackground(new java.awt.Color(217, 217, 217));
        confirmpasswordField.setText("Confirm your password");
        confirmpasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        confirmpasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmpasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmpasswordFieldFocusLost(evt);
            }
        });
        confirmpasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(confirmpasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 300, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Registration-Icon.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Enter your full name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Enter your phone number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Confirm Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Create a Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Enter your email");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 256, -1, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/futsalbookingsystem/imagepicker/Background.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusGained
        // TODO add your handling code here:
        if (nameTextField.getText().equals("   Enter your full name"))
        {
            nameTextField.setText("   ");
            nameTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_nameTextFieldFocusGained

    private void nameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusLost
        // TODO add your handling code here:
        if (nameTextField.getText().trim().isEmpty())
        {            
            nameTextField.setText("   Enter your full name");
            nameTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nameTextFieldFocusLost

    private void phoneTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneTextFieldFocusGained
        // TODO add your handling code here:
        if (phoneTextField.getText().equals("   Phone Number"))
        {
            phoneTextField.setText("   ");
            nameTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_phoneTextFieldFocusGained

    private void phoneTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneTextFieldFocusLost
        // TODO add your handling code here:
        if (phoneTextField.getText().trim().isEmpty())
        {            
            phoneTextField.setText("   Phone Number");
            phoneTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_phoneTextFieldFocusLost

    private void emailTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusGained
        // TODO add your handling code here:
        if (emailTextField.getText().equals("   Enter your email"))
        {
            emailTextField.setText("   ");
            emailTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_emailTextFieldFocusGained

    private void emailTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusLost
        // TODO add your handling code here:
        if (emailTextField.getText().trim().isEmpty())
        {            
            emailTextField.setText("   Enter your email");
            emailTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_emailTextFieldFocusLost

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {
        String password = new String(passwordField.getPassword());
        if (password.equals("Enter your password")) {
            passwordField.setText("");
            passwordField.setForeground(new Color(0, 0, 0));
            passwordField.setEchoChar('*'); // Show password characters
        }
    }

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {
        String password = new String(passwordField.getPassword());
        if (password.trim().isEmpty()) {
            passwordField.setText("Enter your password");
            passwordField.setForeground(Color.BLACK);
            passwordField.setEchoChar((char) 0); // Hide password chars for placeholder
        }
    }
                                           


    private void confirmpasswordFieldFocusGained(java.awt.event.FocusEvent evt) {
        String confirmPassword = new String(confirmpasswordField.getPassword());
        if (confirmPassword.equals("Confirm your password")) {
            confirmpasswordField.setText("");
            confirmpasswordField.setForeground(new Color(0, 0, 0));
            confirmpasswordField.setEchoChar('*');
        }
}

    private void confirmpasswordFieldFocusLost(java.awt.event.FocusEvent evt) {
        String confirmPassword = new String(confirmpasswordField.getPassword());
            if (confirmPassword.trim().isEmpty()) {
                confirmpasswordField.setText("Confirm your password");
                confirmpasswordField.setForeground(Color.BLACK);
                confirmpasswordField.setEchoChar((char) 0);
            }
}

    private void confirmpasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpasswordFieldActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmpasswordField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton signinButton;
    // End of variables declaration//GEN-END:variables
public javax.swing.JTextField getNameTextField(){
        return nameTextField;
    }
    public javax.swing.JTextField getEmailTextField(){
        return emailTextField;
    }
    public javax.swing.JPasswordField getPasswordField(){
        return passwordField;
    }
       public javax.swing.JPasswordField getConfirmPasswordField(){
        return confirmpasswordField;
    }
    public javax.swing.JTextField getPhoneTextField(){
        return phoneTextField;
    }   
   // to add action listener to the button
    public void registerUser(ActionListener listener){
        signinButton.addActionListener(listener);
        
    }
}
