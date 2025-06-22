package futsalbookingsystem.view;

import futsalbookingsystem.dao.TeamDao;
import futsalbookingsystem.dao.TeamDao;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.*;

public class TeamRegistrationDialog extends JDialog {
    private JTextField teamNameField;
    private JSpinner memberCountSpinner;
    private JLabel logoLabel;
    private JButton uploadButton;
    private JComboBox<String> paymentStatusCombo;
    private JButton saveButton;
    private String userEmail;
    private String logoPath;

    public TeamRegistrationDialog(JFrame parent, String userEmail) {
        super(parent, "Team Registration", true);
        this.userEmail = userEmail;
        setSize(400, 300);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Team Name Field
        add(new JLabel("Team Name:"));
        teamNameField = new JTextField(20);
        add(teamNameField);

        // Member Count
        add(new JLabel("Number of Members:"));
        memberCountSpinner = new JSpinner(new SpinnerNumberModel(5, 1, 20, 1));
        add(memberCountSpinner);

        // Logo Upload
        add(new JLabel("Team Logo:"));
        JPanel logoPanel = new JPanel();
        uploadButton = new JButton("Upload Logo");
        logoLabel = new JLabel("No image selected");
        logoPanel.add(uploadButton);
        logoPanel.add(logoLabel);
        add(logoPanel);

        // Payment Status
        add(new JLabel("Payment Status:"));
        paymentStatusCombo = new JComboBox<>(new String[]{"Unpaid", "Paid"});
        add(paymentStatusCombo);

        // Save Button
        saveButton = new JButton("Register Team");
        add(saveButton);

        // Event Handlers
        uploadButton.addActionListener(this::uploadLogo);
        saveButton.addActionListener(this::saveTeam);

        setLocationRelativeTo(parent);
    }

    private void uploadLogo(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image Files", "jpg", "png", "gif"));
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            logoPath = file.getAbsolutePath();
            logoLabel.setText(file.getName());
            
            // Display scaled image preview
            ImageIcon icon = new ImageIcon(logoPath);
            Image img = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            logoLabel.setIcon(new ImageIcon(img));
        }
    }

    private void saveTeam(ActionEvent e) {
        String teamName = teamNameField.getText().trim();
        int memberCount = (Integer) memberCountSpinner.getValue();
        String paymentStatus = (String) paymentStatusCombo.getSelectedItem();

        if (teamName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Team name cannot be empty!");
            return;
        }

        TeamDao teamDao = new TeamDao();
        boolean success = teamDao.registerTeam(
            teamName, 
            memberCount, 
            logoPath, 
            paymentStatus, 
            userEmail
        );

        if (success) {
            JOptionPane.showMessageDialog(this, "Team registered successfully!");
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Registration failed. Please try again.");
        }
    }
}
