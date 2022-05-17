/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dnfapp;

import java.awt.Color;
import java.util.HashMap;
import javax.swing.JFrame;

/**
 *
 * @author Frans
 */
public class LoginMenu extends javax.swing.JFrame {

    private HashMap<String, User> userlist = new HashMap<String, User>();

    /**
     * Creates new form LoginMenu
     */
    public LoginMenu() {
        initComponents();
    }

    public LoginMenu(HashMap<String, User> userlist) {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CreateAccButton = new javax.swing.JButton();
        SignInButton = new javax.swing.JButton();
        usernamefield = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CreateAccButton.setBackground(new java.awt.Color(30, 105, 255));
        CreateAccButton.setForeground(new java.awt.Color(30, 120, 152));
        CreateAccButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_1.png"))); // NOI18N
        CreateAccButton.setBorder(null);
        CreateAccButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CreateAccButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 710, 240, 70));

        SignInButton.setBackground(new java.awt.Color(30, 105, 255));
        SignInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_2.png"))); // NOI18N
        SignInButton.setBorder(null);
        SignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SignInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 700, 230, 90));

        usernamefield.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        usernamefield.setForeground(new java.awt.Color(102, 102, 102));
        usernamefield.setText("Enter Username");
        usernamefield.setBorder(null);
        usernamefield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernamefieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernamefieldFocusLost(evt);
            }
        });
        usernamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamefieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 430, 430, 40));

        PasswordField.setBorder(null);
        PasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusLost(evt);
            }
        });
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 519, 440, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login_Menu.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 1100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateAccButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccButtonActionPerformed
        int userAmount = userlist.size();
        if (userAmount == 0) {
            CreateAccountPage CAP = new CreateAccountPage();
            dispose();          //dispose of current JFrame. This is used to make performance better.
            CAP.setVisible(true);
            CAP.pack();
            CAP.setLocationRelativeTo(null);
            CAP.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
        } else {
            CreateAccountPage CAP = new CreateAccountPage(userlist);
            dispose();          //dispose of current JFrame. This is used to make performance better.
            CAP.setVisible(true);
            CAP.pack();
            CAP.setLocationRelativeTo(null);
            CAP.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_CreateAccButtonActionPerformed

    private void SignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonActionPerformed
        boolean Verify = true;
        String logUsername = usernamefield.getText();
        String logPass = String.valueOf(PasswordField.getPassword());
        if (userlist.containsKey(logUsername)) {
            User designated = userlist.get(logUsername);
            String passCheck = designated.getPassword();
            if (!passCheck.equals(logPass)) {
                Verify = false;
            }
        } else {
            Verify = false;
        }
        if (!Verify) {

        } else {

        }
    }//GEN-LAST:event_SignInButtonActionPerformed

    private void usernamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamefieldActionPerformed

    private void usernamefieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernamefieldFocusGained
        if (usernamefield.getText().equals("Enter Username")) {
            usernamefield.setText("");
            usernamefield.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_usernamefieldFocusGained

    private void usernamefieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernamefieldFocusLost
        if (usernamefield.getText().equals("")) {
            usernamefield.setText("Enter Username");
            usernamefield.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_usernamefieldFocusLost

    private void PasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusGained
        PasswordField.setEchoChar('*');
        String password = String.valueOf(PasswordField.getPassword());

        if(password.toLowerCase().equals("password"))
        {
            PasswordField.setText("");
            PasswordField.setForeground(Color.black);
        }
    }//GEN-LAST:event_PasswordFieldFocusGained

    private void PasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusLost
        String password = String.valueOf(PasswordField.getPassword());

        if(password.toLowerCase().equals("password") || password.toLowerCase().equals("") )
        {
            PasswordField.setText("Password");
            PasswordField.setEchoChar((char)0);
            PasswordField.setForeground(new Color(153, 153, 153));
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
            java.util.logging.Logger.getLogger(LoginMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateAccButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton SignInButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField usernamefield;
    // End of variables declaration//GEN-END:variables
}
