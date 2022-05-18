/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dnfapp;

import java.awt.Color;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Frans
 */
public class LoginMenu extends javax.swing.JFrame {

    private HashMap<String, User> userlist = new HashMap<String, User>();
    private HashMap<String, String> usedEmail = new HashMap<String, String>();  
    private HashMap<String, Package> DeliveryList = new HashMap<String, Package>();
    private HashMap<String, Kurir> ListKurir = new HashMap<String, Kurir>();

    /**
     * Creates new form LoginMenu
     */
    public LoginMenu() {
        initComponents();
    }
    
    //initial constructor, used to generate admin account.
    public LoginMenu(boolean generate){
        if(generate){
            initComponents();
            User admin = new User("admin","41874665168","CustomerService@DNF.co.id");
            userlist.put("admin", admin);
        }
    }

    //situational, for compatibility issues.
    public LoginMenu(HashMap<String, User> userlist, HashMap<String, String> usedEmail) {
        initComponents();
        this.userlist = userlist;
        this.usedEmail=usedEmail;
    }
    
    //situational, for compatibility issues.
    public LoginMenu(HashMap<String, User> userlist, HashMap<String, String> usedEmail, HashMap<String, Package> DeliveryList) {
        initComponents();
        this.userlist = userlist;
        this.usedEmail=usedEmail;
        this.DeliveryList=DeliveryList;
    }
    
    //main cons
    public LoginMenu(HashMap<String, User> userlist, HashMap<String, String> usedEmail, HashMap<String, Package> DeliveryList, HashMap<String, Kurir> ListKurir) {
        initComponents();
        this.userlist = userlist;
        this.usedEmail=usedEmail;
        this.DeliveryList=DeliveryList;
        this.ListKurir=ListKurir;
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
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CreateAccButton.setBackground(new java.awt.Color(45, 104, 201));
        CreateAccButton.setForeground(new java.awt.Color(30, 120, 152));
        CreateAccButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_1.png"))); // NOI18N
        CreateAccButton.setBorder(null);
        CreateAccButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CreateAccButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 180, 40));

        SignInButton.setBackground(new java.awt.Color(45, 104, 201));
        SignInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_2.png"))); // NOI18N
        SignInButton.setBorder(null);
        SignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SignInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 470, 180, 40));

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
        getContentPane().add(usernamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, 320, 20));

        PasswordField.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        PasswordField.setBorder(null);
        PasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusLost(evt);
            }
        });
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 320, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login_Menu.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -190, -1, 1100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateAccButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccButtonActionPerformed
        int userAmount = userlist.size();
        if (userAmount == 0) {
            CreateAccountPage CAP = new CreateAccountPage();
            dispose();          //dispose of current JFrame. This is used to make performance better.
            CAP.setVisible(true);
            CAP.pack();
            CAP.setResizable(false);
            CAP.setLocationRelativeTo(null);
            CAP.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
        } else {
            CreateAccountPage CAP = new CreateAccountPage(userlist,usedEmail);
            dispose();          //dispose of current JFrame. This is used to make performance better.
            CAP.setVisible(true);
            CAP.pack();
            CAP.setLocationRelativeTo(null);
            CAP.setResizable(false);
            CAP.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_CreateAccButtonActionPerformed

    private void SignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonActionPerformed
        boolean verifyUsername = true;
        boolean verifyPassword = true;
        String logUsername = usernamefield.getText();
        String logPass = String.valueOf(PasswordField.getPassword());
        if (userlist.containsKey(logUsername)) {
            User yangLogin = userlist.get(logUsername);
            String passCheck = yangLogin.getPassword();
            if (!passCheck.equals(logPass)) {
                verifyPassword = false;
            }
        } 
        else {
            verifyUsername = false;
        }
        if (!verifyUsername) {
            JOptionPane.showMessageDialog(null, "Username tidak ditemukan!");
        } 
        if(!verifyPassword){
            JOptionPane.showMessageDialog(null, "Password salah!");
        }
        
        if(verifyUsername && verifyPassword){
            //berhasil login
            if(logUsername.equals("admin")){
                AdminMenu adminMenu = new AdminMenu();
                dispose();
                adminMenu.setVisible(true);
                adminMenu.pack();
                adminMenu.setLocationRelativeTo(null);
                adminMenu.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
                adminMenu.setResizable(false);
            }
            else{
                UserMainMenu UserMenu = new UserMainMenu(userlist,usedEmail);
                dispose();
                UserMenu.setVisible(true);
                UserMenu.pack();
                UserMenu.setLocationRelativeTo(null);
                UserMenu.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
                UserMenu.setResizable(false);
            }
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

        if (password.toLowerCase().equals("password")) {
            PasswordField.setText("");
            PasswordField.setForeground(Color.black);
        }
    }//GEN-LAST:event_PasswordFieldFocusGained

    private void PasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusLost
        String password = String.valueOf(PasswordField.getPassword());

        if (password.toLowerCase().equals("password") || password.toLowerCase().equals("")) {
            PasswordField.setText("Password");
            PasswordField.setEchoChar((char) 0);
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
