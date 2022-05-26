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
    private String CurrentNama;
    private String CurrentUsername;
    private String CurrentPassword;
    private Kurir TargetOBJECT;
    
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
        this.TargetOBJECT = ARRKurir.get(objIndex);
        this.CurrentNama=TargetOBJECT.getNama();
        this.CurrentUsername=TargetOBJECT.getUsername();
        this.CurrentPassword=TargetOBJECT.getPassword();
        NameEditField.setText(CurrentNama);
        UsernameEditField.setText(CurrentUsername);
        PasswordEditField.setText(CurrentPassword);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameEditField = new javax.swing.JTextField();
        UsernameEditField = new javax.swing.JTextField();
        PasswordEditField = new javax.swing.JTextField();
        InputButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        BG_EditKurir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameEditField.setBackground(new java.awt.Color(62, 97, 155));
        NameEditField.setBorder(null);
        NameEditField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NameEditFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NameEditFieldFocusLost(evt);
            }
        });
        NameEditField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameEditFieldActionPerformed(evt);
            }
        });
        getContentPane().add(NameEditField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 212, 380, 30));

        UsernameEditField.setBackground(new java.awt.Color(62, 97, 155));
        UsernameEditField.setBorder(null);
        UsernameEditField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameEditFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameEditFieldFocusLost(evt);
            }
        });
        UsernameEditField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameEditFieldActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameEditField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 281, 380, 30));

        PasswordEditField.setBackground(new java.awt.Color(62, 97, 155));
        PasswordEditField.setBorder(null);
        PasswordEditField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordEditFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordEditFieldFocusLost(evt);
            }
        });
        PasswordEditField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordEditFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordEditField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 380, 30));

        InputButton.setText("Input(PlaceHolder)");
        InputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputButtonActionPerformed(evt);
            }
        });
        getContentPane().add(InputButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, -1, -1));

        CancelButton.setText("CancelBtn(PlaceHolder)");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, -1, -1));

        BG_EditKurir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Profile_Kurir.png"))); // NOI18N
        getContentPane().add(BG_EditKurir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameEditFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameEditFieldActionPerformed
        
    }//GEN-LAST:event_NameEditFieldActionPerformed

    private void UsernameEditFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameEditFieldActionPerformed
        
    }//GEN-LAST:event_UsernameEditFieldActionPerformed

    private void PasswordEditFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordEditFieldActionPerformed
        
    }//GEN-LAST:event_PasswordEditFieldActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        SeeListKurir SLM = new SeeListKurir(userlist, usedEmail, DeliveryList, ListKurir);
        dispose();
        SLM.setVisible(true);
        SLM.pack();
        SLM.setLocationRelativeTo(null);
        SLM.setDefaultCloseOperation(EditKurir.EXIT_ON_CLOSE);
        SLM.setResizable(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void InputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputButtonActionPerformed
        String newUsername,newPassword,newName;
        newUsername=UsernameEditField.getText();
        newPassword=PasswordEditField.getText();
        newName=NameEditField.getText();

        if(!newUsername.equals(CurrentUsername)||!newName.equals(CurrentNama)||!newPassword.equals(CurrentPassword)){
            Kurir EditedObj = new Kurir(newName,newUsername,newPassword);
            ListKurir.remove(CurrentUsername);
            ListKurir.put(newUsername,EditedObj);
        }
        
        SeeListKurir SLK = new SeeListKurir(userlist,usedEmail,DeliveryList,ListKurir);
        dispose();
        SLK.setVisible(true);
        SLK.pack();
        SLK.setResizable(false);
        SLK.setLocationRelativeTo(null);
        SLK.setDefaultCloseOperation(AdminMenu.EXIT_ON_CLOSE);
    }//GEN-LAST:event_InputButtonActionPerformed

    private void NameEditFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameEditFieldFocusGained
//        if(NameEditField.getText().equalsIgnoreCase(CurrentNama)){
//            NameEditField.setText("");
//        }
    }//GEN-LAST:event_NameEditFieldFocusGained

    private void NameEditFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameEditFieldFocusLost
        if(NameEditField.getText().equalsIgnoreCase("")){
            NameEditField.setText(CurrentNama);
        }
    }//GEN-LAST:event_NameEditFieldFocusLost

    private void UsernameEditFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameEditFieldFocusGained
//        if(UsernameEditField.getText().equalsIgnoreCase(CurrentUsername)){
//            UsernameEditField.setText("");
//        }
    }//GEN-LAST:event_UsernameEditFieldFocusGained

    private void UsernameEditFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameEditFieldFocusLost
        if(UsernameEditField.getText().equals("")){
            UsernameEditField.setText(CurrentUsername);
        }
    }//GEN-LAST:event_UsernameEditFieldFocusLost

    private void PasswordEditFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordEditFieldFocusGained
        
    }//GEN-LAST:event_PasswordEditFieldFocusGained

    private void PasswordEditFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordEditFieldFocusLost
        
    }//GEN-LAST:event_PasswordEditFieldFocusLost

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
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton InputButton;
    private javax.swing.JTextField NameEditField;
    private javax.swing.JTextField PasswordEditField;
    private javax.swing.JTextField UsernameEditField;
    // End of variables declaration//GEN-END:variables
}
