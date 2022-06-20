/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dnfapp;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;


/**
 *
 * @author Frans
 */
public class UserEditProfilePage extends javax.swing.JFrame {

    //Data to pass into next JFrame
    private HashMap<String, User> userlist = new HashMap<String, User>();
    private HashMap<String, Package> DeliveryList = new HashMap<String, Package>();
    private HashMap<String, String> usedEmail = new HashMap<String, String>();
    private HashMap<String, Kurir> ListKurir = new HashMap<String, Kurir>();
    
    //Used Data
    private User Target;
    private String email;
    private String username;
    private String password;
    private HashMap<String, Integer> VALID_DOMAIN = new HashMap<String, Integer>();
    
    public UserEditProfilePage() {
        initComponents();
    }
    
    public UserEditProfilePage(HashMap<String, User> userlist, HashMap<String, String> usedEmail, HashMap<String, Package> DeliveryList, HashMap<String, Kurir> ListKurir, User Target) {
        initComponents();
        this.userlist=userlist;
        this.usedEmail=usedEmail;
        this.DeliveryList=DeliveryList;
        this.ListKurir=ListKurir;
        this.Target=Target;
        this.email = Target.getEmail();
        this.username = Target.getUsername();
        this.password = Target.getPassword();
        EmailField.setText(email);
        UsernameField.setText(username);
        PasswordField.setText(password);
        GenerateList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Keluar = new javax.swing.JButton();
        UsernameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        EditButton = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Keluar.setBorderPainted(false);
        Keluar.setContentAreaFilled(false);
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 620, 100, 100));

        UsernameField.setBackground(new java.awt.Color(237, 238, 254));
        UsernameField.setFont(new java.awt.Font("Fira Sans", 0, 23)); // NOI18N
        UsernameField.setForeground(new java.awt.Color(76, 76, 76));
        UsernameField.setBorder(null);
        UsernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameFieldFocusLost(evt);
            }
        });
        getContentPane().add(UsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 302, 260, 30));

        EmailField.setBackground(new java.awt.Color(237, 238, 254));
        EmailField.setFont(new java.awt.Font("Fira Sans", 0, 23)); // NOI18N
        EmailField.setForeground(new java.awt.Color(76, 76, 76));
        EmailField.setBorder(null);
        EmailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailFieldFocusLost(evt);
            }
        });
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });
        getContentPane().add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 228, 300, 30));

        EditButton.setBorderPainted(false);
        EditButton.setContentAreaFilled(false);
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 504, 140, 35));

        PasswordField.setBackground(new java.awt.Color(237, 238, 254));
        PasswordField.setForeground(new java.awt.Color(76, 76, 76));
        PasswordField.setBorder(null);
        PasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusLost(evt);
            }
        });
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 375, 270, 30));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Layout/User_Layout_EditProfile.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenerateList() {
        VALID_DOMAIN.put("gmail.com", 10);
        VALID_DOMAIN.put("yahoo.com", 10);
        VALID_DOMAIN.put("outlook.com", 12);
        VALID_DOMAIN.put("hotmail.com", 12);
        VALID_DOMAIN.put("live.com", 9);
        VALID_DOMAIN.put("aol.com", 8);
        VALID_DOMAIN.put("icloud.com", 11);
//        this.ShowPass = false;
//        this.ShowConfirm = false;
//        this.setResizable(false);
    }
    
    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        //get Text to temp String var
        String tempUsername = UsernameField.getText();
        String tempEmail =EmailField.getText();
        String tempPassword = new String(PasswordField.getPassword());
        boolean tempChecker = false;
        //Email Check.
        if(VALID_DOMAIN.containsKey(tempEmail)){
            tempChecker = true;
        }
        
        if(tempChecker){
            if(!this.username.equals(tempUsername)||!this.email.equalsIgnoreCase(tempEmail)||this.password.equals(tempPassword)){
                this.Target.setEmail(tempEmail);
                this.Target.setPassword(tempPassword);
                this.Target.setUsername(tempUsername);
                JOptionPane.showMessageDialog(null, "Profile has been updated!", "DNF App", 1);
                UserMainMenu UserMenu = new UserMainMenu(userlist, usedEmail, DeliveryList,ListKurir,Target);
                dispose();
                UserMenu.setVisible(true);
                UserMenu.pack();
                UserMenu.setLocationRelativeTo(null);
                UserMenu.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
                UserMenu.setResizable(false);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Masukkan alamat email yang valid!", "DNF App", 2);
        }
        
    }//GEN-LAST:event_EditButtonActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        UserMainMenu UserMenu = new UserMainMenu(userlist, usedEmail, DeliveryList,ListKurir,Target);
        dispose();
        UserMenu.setVisible(true);
        UserMenu.pack();
        UserMenu.setLocationRelativeTo(null);
        UserMenu.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
        UserMenu.setResizable(false);
    }//GEN-LAST:event_KeluarActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void EmailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFieldFocusGained
        if(EmailField.getText().equals(email)){
            EmailField.setText("");
        }
    }//GEN-LAST:event_EmailFieldFocusGained

    private void EmailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFieldFocusLost
        if(EmailField.getText().equals("")){
            EmailField.setText(email);
        }
    }//GEN-LAST:event_EmailFieldFocusLost

    private void UsernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFieldFocusGained
        if(UsernameField.getText().equals(username)){
            UsernameField.setText("");
        }
    }//GEN-LAST:event_UsernameFieldFocusGained

    private void UsernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFieldFocusLost
        if(UsernameField.getText().equals("")){
            UsernameField.setText(username);
        }
    }//GEN-LAST:event_UsernameFieldFocusLost

    private void PasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusGained
        if(new String(PasswordField.getPassword()).equals(password)){
            PasswordField.setText("");
        }
    }//GEN-LAST:event_PasswordFieldFocusGained

    private void PasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusLost
        if(new String(PasswordField.getPassword()).equals("")){
            PasswordField.setText(password);
        }
    }//GEN-LAST:event_PasswordFieldFocusLost

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
            java.util.logging.Logger.getLogger(UserEditProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserEditProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserEditProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserEditProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserEditProfilePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField EmailField;
    private javax.swing.JButton Keluar;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField UsernameField;
    // End of variables declaration//GEN-END:variables
}