/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package futsalbookingsystem.view;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import futsalbookingsystem.dao.UserDao;
import java.awt.Image;

/**
 *
 * @author HP
 */
import javax.swing.*;
import java.awt.*;


public class BookingView extends javax.swing.JFrame {
    private String userEmail;

    /**
     * Creates new form BookingView
     */
    public BookingView(String userEmail) {
        this.userEmail = userEmail;
        initComponents(); 

        UserDao dao = new UserDao();
        String imagePath = dao.getUserPhotoPath(userEmail);
        if (imagePath != null) {
            File imgFile = new File(imagePath);
            if (imgFile.exists()) {
                ImageIcon icon = new ImageIcon(imgFile.getAbsolutePath());
                Image img = icon.getImage().getScaledInstance(jLabel51.getWidth(), jLabel51.getHeight(), Image.SCALE_SMOOTH);
                jLabel51.setIcon(new ImageIcon(img));
            }
        }

        jLabel23.setOpaque(true);
        jLabel23.setBackground(java.awt.Color.RED);
        
        jLabel24.setOpaque(true);
        jLabel24.setBackground(java.awt.Color.RED);

        jLabel25.setOpaque(true);
        jLabel25.setBackground(java.awt.Color.RED);

        jLabel26.setOpaque(true);
        jLabel26.setBackground(java.awt.Color.RED);

        jLabel27.setOpaque(true);
        jLabel27.setBackground(java.awt.Color.RED);

        jLabel28.setOpaque(true);
        jLabel28.setBackground(java.awt.Color.RED);

        jLabel29.setOpaque(true);
        jLabel29.setBackground(java.awt.Color.RED);

        jLabel30.setOpaque(true);
        jLabel30.setBackground(java.awt.Color.RED);

        jLabel31.setOpaque(true);
        jLabel31.setBackground(java.awt.Color.RED);

        jLabel32.setOpaque(true);
        jLabel32.setBackground(java.awt.Color.RED);

        jLabel33.setOpaque(true);
        jLabel33.setBackground(java.awt.Color.RED);

        jLabel34.setOpaque(true);
        jLabel34.setBackground(java.awt.Color.RED);

        jLabel35.setOpaque(true);
        jLabel35.setBackground(java.awt.Color.RED);

        jLabel36.setOpaque(true);
        jLabel36.setBackground(java.awt.Color.RED);

        jLabel37.setOpaque(true);
        jLabel37.setBackground(java.awt.Color.RED);

        jLabel38.setOpaque(true);
        jLabel38.setBackground(java.awt.Color.RED);

        jLabel39.setOpaque(true);
        jLabel39.setBackground(java.awt.Color.RED);

        jLabel40.setOpaque(true);
        jLabel40.setBackground(java.awt.Color.RED);

        jLabel52.setOpaque(true);
        jLabel52.setBackground(java.awt.Color.RED);

        jLabel53.setOpaque(true);
        jLabel53.setBackground(java.awt.Color.RED);

        jLabel54.setOpaque(true);
        jLabel54.setBackground(java.awt.Color.RED);

        jLabel55.setOpaque(true);
        jLabel55.setBackground(java.awt.Color.RED);

        jLabel56.setOpaque(true);
        jLabel56.setBackground(java.awt.Color.RED);

        jLabel57.setOpaque(true);
        jLabel57.setBackground(java.awt.Color.RED);

        jLabel58.setOpaque(true);
        jLabel58.setBackground(java.awt.Color.RED);

        jLabel59.setOpaque(true);
        jLabel59.setBackground(java.awt.Color.RED);

        jLabel60.setOpaque(true);
        jLabel60.setBackground(java.awt.Color.RED);

        jLabel61.setOpaque(true);
        jLabel61.setBackground(java.awt.Color.RED);

        jLabel62.setOpaque(true);
        jLabel62.setBackground(java.awt.Color.RED);

        jLabel63.setOpaque(true);
        jLabel63.setBackground(java.awt.Color.RED);

        jLabel64.setOpaque(true);
        jLabel64.setBackground(java.awt.Color.RED);

        jLabel65.setOpaque(true);
        jLabel65.setBackground(java.awt.Color.RED);

        jLabel66.setOpaque(true);
        jLabel66.setBackground(java.awt.Color.RED);

        jLabel67.setOpaque(true);
        jLabel67.setBackground(java.awt.Color.RED);

        jLabel68.setOpaque(true);
        jLabel68.setBackground(java.awt.Color.RED);

        jLabel69.setOpaque(true);
        jLabel69.setBackground(java.awt.Color.RED);

        jLabel70.setOpaque(true);
        jLabel70.setBackground(java.awt.Color.RED);

        jLabel71.setOpaque(true);
        jLabel71.setBackground(java.awt.Color.RED);

        jLabel72.setOpaque(true);
        jLabel72.setBackground(java.awt.Color.RED);

        jLabel73.setOpaque(true);
        jLabel73.setBackground(java.awt.Color.RED);

        jLabel74.setOpaque(true);
        jLabel74.setBackground(java.awt.Color.RED);

        jLabel75.setOpaque(true);
        jLabel75.setBackground(java.awt.Color.RED);

        jLabel76.setOpaque(true);
        jLabel76.setBackground(java.awt.Color.RED);

        jLabel77.setOpaque(true);
        jLabel77.setBackground(java.awt.Color.RED);

        jLabel78.setOpaque(true);
        jLabel78.setBackground(java.awt.Color.RED);

        jLabel79.setOpaque(true);
        jLabel79.setBackground(java.awt.Color.RED);

        jLabel80.setOpaque(true);
        jLabel80.setBackground(java.awt.Color.RED);

        jLabel81.setOpaque(true);
        jLabel81.setBackground(java.awt.Color.RED);

        jLabel82.setOpaque(true);
        jLabel82.setBackground(java.awt.Color.RED);

        jLabel83.setOpaque(true);
        jLabel83.setBackground(java.awt.Color.RED);

        jLabel84.setOpaque(true);
        jLabel84.setBackground(java.awt.Color.RED);

        jLabel85.setOpaque(true);
        jLabel85.setBackground(java.awt.Color.RED);

        jLabel86.setOpaque(true);
        jLabel86.setBackground(java.awt.Color.RED);

        jLabel87.setOpaque(true);
        jLabel87.setBackground(java.awt.Color.RED);

        jLabel88.setOpaque(true);
        jLabel88.setBackground(java.awt.Color.RED);

        jLabel89.setOpaque(true);
        jLabel89.setBackground(java.awt.Color.RED);

        jLabel90.setOpaque(true);
        jLabel90.setBackground(java.awt.Color.RED);

        jLabel91.setOpaque(true);
        jLabel91.setBackground(java.awt.Color.RED);

        jLabel92.setOpaque(true);
        jLabel92.setBackground(java.awt.Color.RED);

        jLabel93.setOpaque(true);
        jLabel93.setBackground(java.awt.Color.RED);

        jLabel94.setOpaque(true);
        jLabel94.setBackground(java.awt.Color.RED);

        jLabel95.setOpaque(true);
        jLabel95.setBackground(java.awt.Color.RED);

        jLabel96.setOpaque(true);
        jLabel96.setBackground(java.awt.Color.RED);

        jLabel97.setOpaque(true);
        jLabel97.setBackground(java.awt.Color.RED);

        jLabel98.setOpaque(true);
        jLabel98.setBackground(java.awt.Color.RED);

        jLabel99.setOpaque(true);
        jLabel99.setBackground(java.awt.Color.RED);

        jLabel100.setOpaque(true);
        jLabel100.setBackground(java.awt.Color.RED);

        jLabel101.setOpaque(true);
        jLabel101.setBackground(java.awt.Color.RED);

        jLabel102.setOpaque(true);
        jLabel102.setBackground(java.awt.Color.RED);

        jLabel103.setOpaque(true);
        jLabel103.setBackground(java.awt.Color.RED);

        jLabel104.setOpaque(true);
        jLabel104.setBackground(java.awt.Color.RED);

        jLabel105.setOpaque(true);
        jLabel105.setBackground(java.awt.Color.RED);

        jLabel106.setOpaque(true);
        jLabel106.setBackground(java.awt.Color.RED);

        jLabel107.setOpaque(true);
        jLabel107.setBackground(java.awt.Color.RED);

        jLabel108.setOpaque(true);
        jLabel108.setBackground(java.awt.Color.RED);

        jLabel109.setOpaque(true);
        jLabel109.setBackground(java.awt.Color.RED);

        jLabel110.setOpaque(true);
        jLabel110.setBackground(java.awt.Color.RED);

        jLabel111.setOpaque(true);
        jLabel111.setBackground(java.awt.Color.RED);

        jLabel112.setOpaque(true);
        jLabel112.setBackground(java.awt.Color.RED);

        jLabel113.setOpaque(true);
        jLabel113.setBackground(java.awt.Color.RED);

        jLabel114.setOpaque(true);
        jLabel114.setBackground(java.awt.Color.RED);

        jLabel115.setOpaque(true);
        jLabel115.setBackground(java.awt.Color.RED);

        jLabel116.setOpaque(true);
        jLabel116.setBackground(java.awt.Color.RED);

        jLabel117.setOpaque(true);
        jLabel117.setBackground(java.awt.Color.RED);

        

        // Initialize the controller
        new futsalbookingsystem.controller.BookingController(this, userEmail);

        
    }
    
    public javax.swing.JLabel getJLabel23(){
        return jLabel23;
    }
    public javax.swing.JLabel getJLabel24() {
        return jLabel24;
    }
    public javax.swing.JLabel getJLabel25() {
        return jLabel25;
    }

    public javax.swing.JLabel getJLabel26() {
        return jLabel26;
    }

    public javax.swing.JLabel getJLabel27() {
        return jLabel27;
    }

    public javax.swing.JLabel getJLabel28() {
        return jLabel28;
    }

    public javax.swing.JLabel getJLabel29() {
        return jLabel29;
    }

    public javax.swing.JLabel getJLabel30() {
        return jLabel30;
    }

    public javax.swing.JLabel getJLabel31() {
        return jLabel31;
    }

    public javax.swing.JLabel getJLabel32() {
        return jLabel32;
    }

    public javax.swing.JLabel getJLabel33() {
        return jLabel33;
    }

    public javax.swing.JLabel getJLabel34() {
        return jLabel34;
    }

    public javax.swing.JLabel getJLabel35() {
        return jLabel35;
    }

    public javax.swing.JLabel getJLabel36() {
        return jLabel36;
    }

    public javax.swing.JLabel getJLabel37() {
        return jLabel37;
    }

    public javax.swing.JLabel getJLabel38() {
        return jLabel38;
    }

    public javax.swing.JLabel getJLabel39() {
        return jLabel39;
    }

    public javax.swing.JLabel getJLabel40() {
        return jLabel40;
    }
    public javax.swing.JLabel getJLabel52() {
        return jLabel52;
    }

    public javax.swing.JLabel getJLabel53() {
        return jLabel53;
    }

    public javax.swing.JLabel getJLabel54() {
        return jLabel54;
    }

    public javax.swing.JLabel getJLabel55() {
        return jLabel55;
    }

    public javax.swing.JLabel getJLabel56() {
        return jLabel56;
    }

    public javax.swing.JLabel getJLabel57() {
        return jLabel57;
    }

    public javax.swing.JLabel getJLabel58() {
        return jLabel58;
    }

    public javax.swing.JLabel getJLabel59() {
        return jLabel59;
    }

    public javax.swing.JLabel getJLabel60() {
        return jLabel60;
    }

    public javax.swing.JLabel getJLabel61() {
        return jLabel61;
    }

    public javax.swing.JLabel getJLabel62() {
        return jLabel62;
    }

    public javax.swing.JLabel getJLabel63() {
        return jLabel63;
    }

    public javax.swing.JLabel getJLabel64() {
        return jLabel64;
    }

    public javax.swing.JLabel getJLabel65() {
        return jLabel65;
    }

    public javax.swing.JLabel getJLabel66() {
        return jLabel66;
    }

    public javax.swing.JLabel getJLabel67() {
        return jLabel67;
    }

    public javax.swing.JLabel getJLabel68() {
        return jLabel68;
    }

    public javax.swing.JLabel getJLabel69() {
        return jLabel69;
    }

    public javax.swing.JLabel getJLabel70() {
        return jLabel70;
    }

    public javax.swing.JLabel getJLabel71() {
        return jLabel71;
    }

    public javax.swing.JLabel getJLabel72() {
        return jLabel72;
    }

    public javax.swing.JLabel getJLabel73() {
        return jLabel73;
    }

    public javax.swing.JLabel getJLabel74() {
        return jLabel74;
    }

    public javax.swing.JLabel getJLabel75() {
        return jLabel75;
    }

    public javax.swing.JLabel getJLabel76() {
        return jLabel76;
    }

    public javax.swing.JLabel getJLabel77() {
        return jLabel77;
    }

    public javax.swing.JLabel getJLabel78() {
        return jLabel78;
    }

    public javax.swing.JLabel getJLabel79() {
        return jLabel79;
    }

    public javax.swing.JLabel getJLabel80() {
        return jLabel80;
    }

    public javax.swing.JLabel getJLabel81() {
        return jLabel81;
    }

    public javax.swing.JLabel getJLabel82() {
        return jLabel82;
    }

    public javax.swing.JLabel getJLabel83() {
        return jLabel83;
    }

    public javax.swing.JLabel getJLabel84() {
        return jLabel84;
    }

    public javax.swing.JLabel getJLabel85() {
        return jLabel85;
    }

    public javax.swing.JLabel getJLabel86() {
        return jLabel86;
    }

    public javax.swing.JLabel getJLabel87() {
        return jLabel87;
    }

    public javax.swing.JLabel getJLabel88() {
        return jLabel88;
    }

    public javax.swing.JLabel getJLabel89() {
        return jLabel89;
    }

    public javax.swing.JLabel getJLabel90() {
        return jLabel90;
    }

    public javax.swing.JLabel getJLabel91() {
        return jLabel91;
    }

    public javax.swing.JLabel getJLabel92() {
        return jLabel92;
    }

    public javax.swing.JLabel getJLabel93() {
        return jLabel93;
    }

    public javax.swing.JLabel getJLabel94() {
        return jLabel94;
    }

    public javax.swing.JLabel getJLabel95() {
        return jLabel95;
    }

    public javax.swing.JLabel getJLabel96() {
        return jLabel96;
    }

    public javax.swing.JLabel getJLabel97() {
        return jLabel97;
    }

    public javax.swing.JLabel getJLabel98() {
        return jLabel98;
    }

    public javax.swing.JLabel getJLabel99() {
        return jLabel99;
    }

    public javax.swing.JLabel getJLabel100() {
        return jLabel100;
    }

    public javax.swing.JLabel getJLabel101() {
        return jLabel101;
    }

    public javax.swing.JLabel getJLabel102() {
        return jLabel102;
    }

    public javax.swing.JLabel getJLabel103() {
        return jLabel103;
    }

    public javax.swing.JLabel getJLabel104() {
        return jLabel104;
    }

    public javax.swing.JLabel getJLabel105() {
        return jLabel105;
    }

    public javax.swing.JLabel getJLabel106() {
        return jLabel106;
    }

    public javax.swing.JLabel getJLabel107() {
        return jLabel107;
    }

    public javax.swing.JLabel getJLabel108() {
        return jLabel108;
    }

    public javax.swing.JLabel getJLabel109() {
        return jLabel109;
    }

    public javax.swing.JLabel getJLabel110() {
        return jLabel110;
    }

    public javax.swing.JLabel getJLabel111() {
        return jLabel111;
    }

    public javax.swing.JLabel getJLabel112() {
        return jLabel112;
    }

    public javax.swing.JLabel getJLabel113() {
        return jLabel113;
    }

    public javax.swing.JLabel getJLabel114() {
        return jLabel114;
    }

    public javax.swing.JLabel getJLabel115() {
        return jLabel115;
    }

    public javax.swing.JLabel getJLabel116() {
        return jLabel116;
    }

    public javax.swing.JLabel getJLabel117() {
        return jLabel117;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner2 = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nutgmegz");

        jButton1.setBackground(new java.awt.Color(217, 217, 217));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setText("Dashboard");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(217, 217, 217));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setText("Event");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(217, 217, 217));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton5.setText("Booking-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(217, 217, 217));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setText("History");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(217, 217, 217));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setText("Setting");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel51.setBackground(new java.awt.Color(0, 0, 0));
        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(56, 56, 56))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 570));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Sunday");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("8 a.m.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 5, 95, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("9 a.m.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 35, 95, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("10 a.m.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 65, 95, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("11 a.m.");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 95, 95, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("12 p.m.");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 125, 95, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("1 p.m.");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 155, 95, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("2 p.m.");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 185, 95, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("3 p.m.");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 215, 95, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("4 p.m.");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 245, 95, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("5 p.m.");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 275, 95, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("6 p.m");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 305, 95, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("7 p.m.");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 335, 95, -1));

        jTextField11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 8, 5, 360));

        jTextField12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 5, 360));

        jTextField13.setBackground(new java.awt.Color(0, 0, 0));
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 5, 360));

        jTextField14.setBackground(new java.awt.Color(0, 0, 0));
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 5, 360));

        jTextField15.setBackground(new java.awt.Color(0, 0, 0));
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 5, 360));

        jTextField16.setBackground(new java.awt.Color(0, 0, 0));
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 5, 360));

        jTextField17.setBackground(new java.awt.Color(0, 0, 0));
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 5, 360));

        jTextField18.setBackground(new java.awt.Color(0, 0, 0));
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 5, 360));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("8-9");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 5, 75, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("8-9");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 5, 75, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("8-9");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 5, 75, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("8-9");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 5, 75, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("8-9");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 5, 75, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("8-9");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 5, 75, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("9-10");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 35, 75, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("10-11");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 65, 75, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("11-12");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 95, 75, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("12-1");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 125, 75, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("1-2");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 155, 75, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("2-3");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 185, 75, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("3-4");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 215, 75, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("5-6");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 275, 75, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("8-9");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 5, 75, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("6-7");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 305, 75, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("7-8");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 335, 75, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("4-5");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 245, 75, -1));

        jTextField19.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 8, 5, 360));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("9-10");
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 35, 75, -1));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("10-11");
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 65, 75, -1));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("11-12");
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 95, 75, -1));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("12-1");
        jPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 125, 75, -1));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("1-2");
        jPanel1.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 155, 75, -1));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("2-3");
        jPanel1.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 185, 75, -1));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("3-4");
        jPanel1.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 215, 75, -1));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("4-5");
        jPanel1.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 245, 75, -1));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("5-6");
        jPanel1.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 275, 75, -1));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("6-7");
        jPanel1.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 305, 75, -1));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("7-8");
        jPanel1.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 335, 75, -1));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("7-8");
        jPanel1.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 335, 75, -1));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("6-7");
        jPanel1.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 305, 75, -1));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("5-6");
        jPanel1.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 275, 75, -1));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("4-5");
        jPanel1.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 245, 75, -1));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("3-4");
        jPanel1.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 215, 75, -1));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("2-3");
        jPanel1.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 185, 75, -1));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("1-2");
        jPanel1.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 155, 75, -1));

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("12-1");
        jPanel1.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 125, 75, -1));

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("11-12");
        jPanel1.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 95, 75, -1));

        jLabel72.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("10-11");
        jPanel1.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 65, 75, -1));

        jLabel73.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("9-10");
        jPanel1.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 35, 75, -1));

        jLabel74.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("7-8");
        jPanel1.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 335, 75, -1));

        jLabel75.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("6-7");
        jPanel1.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 305, 75, -1));

        jLabel76.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("5-6");
        jPanel1.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 275, 75, -1));

        jLabel77.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("4-5");
        jPanel1.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 245, 75, -1));

        jLabel78.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("3-4");
        jPanel1.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 215, 75, -1));

        jLabel79.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("2-3");
        jPanel1.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 185, 75, -1));

        jLabel80.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("1-2");
        jPanel1.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 155, 75, -1));

        jLabel81.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("12-1");
        jPanel1.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 125, 75, -1));

        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("11-12");
        jPanel1.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 95, 75, -1));

        jLabel83.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("10-11");
        jPanel1.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 65, 75, -1));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("9-10");
        jPanel1.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 35, 75, -1));

        jLabel85.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("9-10");
        jPanel1.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 35, 75, -1));

        jLabel86.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("10-11");
        jPanel1.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 65, 75, -1));

        jLabel87.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("11-12");
        jPanel1.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 95, 75, -1));

        jLabel88.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("12-1");
        jPanel1.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 125, 75, -1));

        jLabel89.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("1-2");
        jPanel1.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 155, 75, -1));

        jLabel90.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("2-3");
        jPanel1.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 185, 75, -1));

        jLabel91.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("3-4");
        jPanel1.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 215, 75, -1));

        jLabel92.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("4-5");
        jPanel1.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 245, 75, -1));

        jLabel93.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("5-6");
        jPanel1.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 275, 75, -1));

        jLabel94.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("6-7");
        jPanel1.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 305, 75, -1));

        jLabel95.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("7-8");
        jPanel1.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 335, 75, -1));

        jLabel96.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("9-10");
        jPanel1.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 35, 75, -1));

        jLabel97.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("10-11");
        jPanel1.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 65, 75, -1));

        jLabel98.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setText("11-12");
        jPanel1.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 95, 75, -1));

        jLabel99.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("12-1");
        jPanel1.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 125, 75, -1));

        jLabel100.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("1-2");
        jPanel1.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 155, 75, -1));

        jLabel101.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("2-3");
        jPanel1.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 185, 75, -1));

        jLabel102.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("3-4");
        jPanel1.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 215, 75, -1));

        jLabel103.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("4-5");
        jPanel1.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 245, 75, -1));

        jLabel104.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setText("5-6");
        jPanel1.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 275, 75, -1));

        jLabel105.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setText("6-7");
        jPanel1.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 305, 75, -1));

        jLabel106.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("7-8");
        jPanel1.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 335, 75, -1));

        jLabel107.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setText("9-10");
        jPanel1.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 35, 75, -1));

        jLabel108.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("10-11");
        jPanel1.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 65, 75, -1));

        jLabel109.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel109.setText("11-12");
        jPanel1.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 95, 75, -1));

        jLabel110.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel110.setText("12-1");
        jPanel1.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 125, 75, -1));

        jLabel111.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("1-2");
        jPanel1.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 155, 75, -1));

        jLabel112.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel112.setText("2-3");
        jPanel1.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 185, 75, -1));

        jLabel113.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel113.setText("3-4");
        jPanel1.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 215, 75, -1));

        jLabel114.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel114.setText("4-5");
        jPanel1.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 245, 75, -1));

        jLabel115.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setText("5-6");
        jPanel1.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 275, 75, -1));

        jLabel116.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel116.setText("6-7");
        jPanel1.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 305, 75, -1));

        jLabel117.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel117.setText("7-8");
        jPanel1.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 335, 75, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 740, 380));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Monday");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Tuesday");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Wednesday");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Thursday");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 150, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Friday");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Saturday");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        jLabel6.setText("Booking");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 20, -1));

        jTextField2.setBackground(new java.awt.Color(0, 204, 0));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 20, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setText("Not Booked");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setText("Booked");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setText("1200");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, -1, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setText("8 a.m. - 4 p.m. ");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, -1, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setText("4 p.m. - 7 p.m. ");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, -1, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setText("1000");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, -1, -1));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setText("1200");
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, -1, -1));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setText("Price");
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, -1, -1));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setText("8 a.m. - 10 a.m. ");
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, -1, -1));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setText("Time");
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/futsalbookingsystem/imagepicker/Background.png"))); // NOI18N
        jLabel1.setText("asda");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DashboardView dashboardView = new DashboardView(userEmail);
        dashboardView.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        EventView eventView = new EventView(userEmail);
        eventView.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        AboutView historyView = new AboutView(userEmail);
        historyView.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        SettingView settingView = new SettingView(userEmail);
        settingView.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingView("user@example.com").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
