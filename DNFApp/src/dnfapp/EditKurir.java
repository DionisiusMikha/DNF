/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dnfapp;

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author Frans
 */
public class EditKurir extends javax.swing.JFrame {

    private HashMap<String, User> userlist = new HashMap<String, User>();
    private HashMap<String, String> usedEmail = new HashMap<String, String>();
    private HashMap<String, Package> DeliveryList = new HashMap<String, Package>();
    private HashMap<String, Kurir> ListKurir = new HashMap<String, Kurir>();
    private ArrayList<Kurir> ARRKurir = new ArrayList<Kurir>();
    
    public EditKurir() {
        initComponents();
    }
    
    public EditKurir(HashMap<String, User> userlist, HashMap<String, Package> DeliveryList, HashMap<String, Kurir> ListKurir, HashMap<String, String> usedEmail, ArrayList<Kurir> KurirARRList, int objIndex){
        initComponents();
        this.userlist = userlist;
        this.ListKurir=ListKurir;
        this.usedEmail=usedEmail;
        this.DeliveryList=DeliveryList;
        this.ARRKurir=KurirARRList;
        Kurir TargetOBJECT = ARRKurir.get(objIndex);
        NameEditField.setText(TargetOBJECT.getNama());
        UsernameEditField.setText(TargetOBJECT.getUsername());
        PasswordEditField.setText(TargetOBJECT.getPassword());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameEditField = new javax.swing.JTextField();
        UsernameEditField = new javax.swing.JTextField();
        PasswordEditField = new javax.swing.JTextField();
        KeluarButton = new javax.swing.JButton();
        BG_EditKurir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameEditField.setBackground(new java.awt.Color(62, 97, 155));
        NameEditField.setBorder(null);
        NameEditField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameEditFieldActionPerformed(evt);
            }
        });
        getContentPane().add(NameEditField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 212, 380, 30));

        UsernameEditField.setBackground(new java.awt.Color(62, 97, 155));
        UsernameEditField.setBorder(null);
        UsernameEditField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameEditFieldActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameEditField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 281, 380, 30));

        PasswordEditField.setBackground(new java.awt.Color(62, 97, 155));
        PasswordEditField.setBorder(null);
        PasswordEditField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordEditFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordEditField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 380, 30));

        KeluarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon_5_minisize.png"))); // NOI18N
        KeluarButton.setBorder(null);
        KeluarButton.setContentAreaFilled(false);
        KeluarButton.setDefaultCapable(false);
        getContentPane().add(KeluarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 585, 90, 90));

        BG_EditKurir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Profile_Kurir.png"))); // NOI18N
        getContentPane().add(BG_EditKurir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameEditFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameEditFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameEditFieldActionPerformed

    private void UsernameEditFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameEditFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameEditFieldActionPerformed

    private void PasswordEditFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordEditFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordEditFieldActionPerformed

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
            java.util.logging.Logger.getLogger(EditKurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditKurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditKurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditKurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditKurir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG_EditKurir;
    private javax.swing.JButton KeluarButton;
    private javax.swing.JTextField NameEditField;
    private javax.swing.JTextField PasswordEditField;
    private javax.swing.JTextField UsernameEditField;
    // End of variables declaration//GEN-END:variables
}
