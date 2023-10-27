package frames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Login extends javax.swing.JFrame {
   
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
    
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

    public void Connect_DB(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cnx","root", "");
            } catch (SQLException Ex){
            JOptionPane.showMessageDialog(null, "Impossible de se connecter à la BASE DE DONNÉES.");
            }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Usertxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Passtxt = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connexion");

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Connectez-vous !");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 250, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 600, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user_icon.png"))); // NOI18N
        jLabel2.setText("Nom d'utilisateur");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 220, 40));

        Usertxt.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Usertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsertxtActionPerformed(evt);
            }
        });
        jPanel1.add(Usertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 240, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password_icon.png"))); // NOI18N
        jLabel3.setText("Mot de passe");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 210, 40));

        Passtxt.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jPanel1.add(Passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 240, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login_page.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 270, 280));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setkGradientFocus(1200);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 51, 102));

        login.setBackground(new java.awt.Color(211, 211, 211));
        login.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/enter.png"))); // NOI18N
        login.setText("Connexion");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(337, Short.MAX_VALUE)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        if (Usertxt.getText().isEmpty() || Passtxt.getText().isEmpty())
            JOptionPane.showMessageDialog(null, "Veuillez entrer vos informations!");
        else {
            
        try {
            Connect_DB();
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gst_act", "root", "");
            
            // Prepared statement for selecting user by username and password
            ps = con.prepareStatement("SELECT * FROM admin WHERE unom = ? AND upass = ?");
            ps.setString(1, Usertxt.getText()); // Replace with actual username
            ps.setString(2, Passtxt.getText()); // Replace with actual password
            
            // Executing prepared statement
            rs = ps.executeQuery();
            
            // If result set contains at least one row, the user and password are correct
            if (rs.next()) {

                Menu2 menuu = new Menu2();
                menuu.setVisible(true);
                this.dispose();
            
            } else {
                JOptionPane.showMessageDialog(null, " Nom d'utilisateur ou mot de passe invalide. Veuillez réessayer.");
            }
            
        } catch (SQLException e) {
        } 
        }
        
    }//GEN-LAST:event_loginActionPerformed

    private void UsertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsertxtActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Passtxt;
    private javax.swing.JTextField Usertxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables


}
