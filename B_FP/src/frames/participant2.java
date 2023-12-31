/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;
import java.awt.Graphics;
import java.awt.print.PrinterException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterJob;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



public class participant2 extends javax.swing.JFrame {
 String filename = null;
 byte[] prt_img;
     private static final int MAX_IMAGE_WIDTH = 120;
    private static final int MAX_IMAGE_HEIGHT = 160;
 
    public participant2() {
        initComponents();
        ShowI();
    }
    
Connection Con = null;
Statement St = null, St1 = null;
ResultSet Rs = null, Rs1 = null;

public void Connect_DB() {
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gst_act", "root", "");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Impossible de se connecter à la BASE DE DONNÉES.");
    }
}

private void ShowI() {
    try {
        Connect_DB();
        St = Con.createStatement();
        Rs = St.executeQuery("SELECT * FROM participant");
        jTable1.setModel(DbUtils.resultSetToTableModel(Rs));
        Con.close();
    } catch (Exception e) {
        // Handle exception
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        prenom = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        numc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        mail = new javax.swing.JTextField();
        jadd = new javax.swing.JButton();
        jedit = new javax.swing.JButton();
        jdelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        img = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Print2 = new javax.swing.JButton();
        lbl_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Participant");

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 140, 30));

        prenom.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jPanel1.add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 140, 30));

        age.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 50, 30));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nom :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 50, 30));

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Prenom :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 80, 30));

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homme", "Femme" }));
        sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexActionPerformed(evt);
            }
        });
        jPanel1.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 140, 30));

        jLabel7.setBackground(new java.awt.Color(0, 153, 153));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Telephone :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 100, 30));

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Age :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 60, 30));

        phone.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 140, 30));

        jLabel6.setBackground(new java.awt.Color(0, 153, 153));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Numero de La carte:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 30));

        numc.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        numc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numcActionPerformed(evt);
            }
        });
        jPanel1.add(numc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 140, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 970, 200));

        mail.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });
        jPanel1.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 210, 30));

        jadd.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus.png"))); // NOI18N
        jadd.setText("Ajouter");
        jadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddActionPerformed(evt);
            }
        });
        jPanel1.add(jadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 130, 40));

        jedit.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/compose.png"))); // NOI18N
        jedit.setText("Modifier");
        jedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeditActionPerformed(evt);
            }
        });
        jPanel1.add(jedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 130, 40));

        jdelete.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        jdelete.setText("Supprimer");
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, -1, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/prt.png"))); // NOI18N
        jLabel5.setText("Les participants");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 240, 70));

        jLabel12.setBackground(new java.awt.Color(0, 153, 153));
        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Email :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 70, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ans.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 153, 153));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("sexe :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 60, 30));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-image.png"))); // NOI18N
        img.setText("La photo:");
        img.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMouseClicked(evt);
            }
        });
        img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgActionPerformed(evt);
            }
        });
        jPanel1.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 120, 30));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        back.setText("Menu");
        back.setBackground(new java.awt.Color(0, 153, 153));
        back.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        back.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("La liste des Participants");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 970, -1));

        Print2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Print2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/printer.png"))); // NOI18N
        Print2.setText("Imprimer");
        Print2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print2ActionPerformed(evt);
            }
        });
        jPanel1.add(Print2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, 130, 40));

        lbl_img.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lbl_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 120, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 997, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 997, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailActionPerformed

    private void numcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numcActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteActionPerformed
int index = jTable1.getSelectedRow();
    if (index == -1) {
        JOptionPane.showMessageDialog(this, "Veuillez sélectionner un participant à supprimer.");
        return;
    }

    int dialogResult = JOptionPane.showConfirmDialog(null, "Êtes-vous sûr de vouloir supprimer cet participant ?", "Attention", JOptionPane.YES_NO_OPTION);
    if (dialogResult == JOptionPane.YES_OPTION) {{
            Connect_DB();
            try {
                PreparedStatement Pst = Con.prepareStatement("DELETE FROM `participant` WHERE Id_prt = ?");
                Pst.setString(1,Key);
                int row = Pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Participant supprimée avec succès !");
                Con.close();
                ShowI();              
                
                numc.setText("");
                name.setText("");
                prenom.setText("");
                age.setText("");
                phone.setText("");
               sex.setSelectedIndex(-1);
                mail.setText("");
                lbl_img.setIcon(null);
               

            } catch (SQLException ex) {
            }
        }
        
    } 
    }//GEN-LAST:event_jdeleteActionPerformed

    private void sexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexActionPerformed


    private void jaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddActionPerformed

               DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
 if(numc.getText().isEmpty() || name.getText().isEmpty() || prenom.getText().isEmpty() || phone.getText().isEmpty() || age.getText().isEmpty() || sex.getSelectedItem() == null|| phone.getText().isEmpty()|| mail.getText().isEmpty() )
                 JOptionPane.showMessageDialog(null, "Veuillez entrer vos informations!");
 else{
     Connect_DB();
            try {
                PreparedStatement Pst = Con.prepareStatement("INSERT INTO participant (`Num_cp`, `Nom_prt`, `Pre_prt`, `Age_prt`,`Sx_prt`,`Tel_prt`,`Mail_prt`,`Photo_prt`) VALUES (?,?,?,?,?,?,?,?)");
                Pst.setString(1, numc.getText());
                Pst.setString(2, name.getText());
                Pst.setString(3, prenom.getText());
                Pst.setInt(4, Integer.parseInt(age.getText()));
                Pst.setString(5, sex.getSelectedItem().toString());
                Pst.setInt(6, Integer.parseInt(phone.getText()));
                Pst.setString(7,mail.getText());
                Pst.setBytes(8, prt_img); // Assuming 'prt_img' contains the image data as a byte array


                JOptionPane.showMessageDialog(null, "Participant ajoutée avec succès !");

                int row = Pst.executeUpdate();
                Con.close();
                
                ShowI();
                
                numc.setText("");
                name.setText("");
                prenom.setText("");
                age.setText("");
                phone.setText("");
                sex.setSelectedIndex(-1);
                mail.setText("");
                lbl_img.setIcon(null);
               
               

                
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Erreur de base de données");
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Format de nombre incorrect");
}
           }

 





        // TODO add your handling code here:
    }//GEN-LAST:event_jaddActionPerformed
String Key = null;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int myIndex = jTable1.getSelectedRow();
    Key = model.getValueAt(myIndex, 0).toString();
    numc.setText(model.getValueAt(myIndex, 1).toString());
    name.setText(model.getValueAt(myIndex, 2).toString());
    prenom.setText(model.getValueAt(myIndex, 3).toString());
    age.setText(model.getValueAt(myIndex, 4).toString());
    String sexValue = model.getValueAt(myIndex, 5).toString();
    int sexIndex = -1;
    for (int i = 0; i < sex.getItemCount(); i++) {
        if (sexValue.equals(sex.getItemAt(i).toString())) {
            sexIndex = i;
            break;
        }
    }
    sex.setSelectedIndex(sexIndex);
    phone.setText(model.getValueAt(myIndex, 6).toString());
    mail.setText(model.getValueAt(myIndex, 7).toString());

    // Set the image from the database
    byte[] imageData = (byte[]) model.getValueAt(myIndex, 8);
    if (imageData != null) {
        ImageIcon imageIcon = new ImageIcon(imageData);
        lbl_img.setIcon(imageIcon);
        prt_img = imageData; // Assign the image data to the prt_img variable
    } else {
        lbl_img.setIcon(null);
        prt_img = null; // Reset the prt_img variable if no image data is available
    }

   
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeditActionPerformed
           int index = jTable1.getSelectedRow();
   if (index == -1) {
        JOptionPane.showMessageDialog(this, "Veuillez sélectionner un participant à modifier.");
        }else {
            Connect_DB();
            try {
                PreparedStatement Pst = Con.prepareStatement("UPDATE `participant` SET Num_cp=? ,Nom_prt=? ,Pre_prt=?, Age_prt=?, Sx_prt=?,  Tel_prt=?, Mail_prt=? , Photo_prt=?  WHERE Id_prt=? ");
                Pst.setString(1, numc.getText());
                Pst.setString(2, name.getText());
                Pst.setString(3, prenom.getText());
                Pst.setInt(4, Integer.parseInt(age.getText()));
                Pst.setString(5, sex.getSelectedItem().toString());
                Pst.setInt(6, Integer.parseInt(phone.getText()));
                Pst.setString(7,mail.getText());
                Pst.setBytes(8, prt_img);

                Pst.setString(9, Key);
                
                JOptionPane.showMessageDialog(null, "Particiapant modifiée avec succès !");

                int row = Pst.executeUpdate();
                Con.close();
               ShowI();
                
                numc.setText("");
                name.setText("");
                prenom.setText("");
                age.setText("");
                phone.setText("");
                sex.setSelectedIndex(-1);
                mail.setText("");
                lbl_img.setIcon(null);
                
               
                ///////////////////////////////////////////////// PROBLEM........
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Erreur de base de données");
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Format de nombre incorrect");
}


        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jeditActionPerformed

    private void imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgActionPerformed
      JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        if (f != null) {
            filename = f.getAbsolutePath();
            try {
                // Resize the image to a maximum width and height
                ImageIcon originalImageIcon = new ImageIcon(filename);
                Image originalImage = originalImageIcon.getImage();
                Image resizedImage = originalImage.getScaledInstance(MAX_IMAGE_WIDTH, MAX_IMAGE_HEIGHT, Image.SCALE_SMOOTH);
                ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
                lbl_img.setIcon(resizedImageIcon);
                
                // Convert the resized image to a byte array
                File resizedImgFile = new File(filename);
                ImageIO.write(toBufferedImage(resizedImage), "png", resizedImgFile);
                FileInputStream fis = new FileInputStream(resizedImgFile);
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                int readNum;
                while ((readNum = fis.read(buf)) != -1) {
                    bos.write(buf, 0, readNum);
                }
                prt_img = bos.toByteArray();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e);
            }}




        
// TODO add your handling code here:
    }//GEN-LAST:event_imgActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
Menu2 menuu = new Menu2();
menuu.setVisible(true);
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void Print2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print2ActionPerformed
        try {
        // Create a new PrinterJob
        PrinterJob job = PrinterJob.getPrinterJob();

        // Set the Printable object
        job.setPrintable(new Printable() {
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if (pageIndex > 0) {
                    return NO_SUCH_PAGE;
                }

                // Create a Graphics2D object
                Graphics2D g2d = (Graphics2D) graphics;

                // Set the rendering hints for better print quality
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

                // Set the printable area within the page
                int x = (int) pageFormat.getImageableX();
                int y = (int) pageFormat.getImageableY();
                int width = (int) pageFormat.getImageableWidth();
                int height = (int) pageFormat.getImageableHeight();

                // Draw the participant card content using Graphics2D methods (e.g., drawString, drawRect, etc.)
                // Example:
                g2d.drawString("Carte Participant", x + 100, y + 50);
                g2d.drawString("----------------------", x + 100, y + 60);
                g2d.drawString("Numéro de la carte: " + numc.getText(), x + 100, y + 100);
                g2d.drawString("Nom: " + name.getText(), x + 100, y + 120);
                g2d.drawString("Prénom: " + prenom.getText(), x + 100, y + 140);
                g2d.drawString("Âge: " + age.getText(), x + 100, y + 160);
                g2d.drawString("Sexe: " + sex.getSelectedItem().toString(), x + 100, y + 180);
                g2d.drawString("Téléphone: " + phone.getText(), x + 100, y + 200);
                g2d.drawString("Email: " + mail.getText(), x + 100, y + 220);
                // Add more content as needed

                // Draw the participant's picture
                byte[] imageData = prt_img; // Assuming 'prt_img' contains the image data as a byte array
                if (imageData != null) {
                    try {
                        // Load the image from the byte array
                        Image image = ImageIO.read(new ByteArrayInputStream(imageData));
                        if (image != null) {
                            int imageWidth = 80; // Adjust the width as needed
                            int imageHeight = 100; // Adjust the height as needed
                            int imageX = x + 350; // Adjust the X position as needed
                            int imageY = y + 120; // Adjust the Y position as needed
                            g2d.drawImage(image, imageX, imageY, imageWidth, imageHeight, null);
                        }
                    } catch (IOException e) {
                    }
                }

                return PAGE_EXISTS;
            }
        });

        // Show the print dialog to the user
        if (job.printDialog()) {
            // Print the document
            job.print();
        }
    } catch (PrinterException e) {
        JOptionPane.showMessageDialog(null, "Error while printing: " + e.getMessage());
    }

    }//GEN-LAST:event_Print2ActionPerformed

    private void imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMouseClicked


        // TODO add your handling code here:
    }//GEN-LAST:event_imgMouseClicked

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
            java.util.logging.Logger.getLogger(participant2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(participant2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(participant2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(participant2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new participant2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Print2;
    private javax.swing.JTextField age;
    private javax.swing.JButton back;
    private javax.swing.JButton img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jadd;
    private javax.swing.JButton jdelete;
    private javax.swing.JButton jedit;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField name;
    private javax.swing.JTextField numc;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField prenom;
    private javax.swing.JComboBox<String> sex;
    // End of variables declaration//GEN-END:variables

private static BufferedImage toBufferedImage(Image image) {
        if (image instanceof BufferedImage) {
            return (BufferedImage) image;
        }

        // Create a buffered image with transparency
        BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);

        // Draw the image onto the buffered image
        Graphics2D g2d = bufferedImage.createGraphics();
        g2d.drawImage(image, 0, 0, null);
        g2d.dispose();

        return bufferedImage;
    }

}


