/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dnfapp;

import java.awt.Color;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Frans
 */
public class LoginMenu extends javax.swing.JFrame implements Serializeation{

    private HashMap<String, User> userlist = new HashMap<String, User>();
    private HashMap<String, String> usedEmail = new HashMap<String, String>();
    private HashMap<String, Package> DeliveryList = new HashMap<String, Package>();
    private HashMap<String, Kurir> ListKurir = new HashMap<String, Kurir>();
    private boolean ShowPass;

    /**
     * Creates new form LoginMenu
     */
    public LoginMenu() {
        initComponents();
        LoginBG.requestFocus();
        this.ShowPass = false;
    }
    
    public void regen(ArrayList<User> container){
        for(int i =0;i<container.size();i++){
            this.userlist.put(container.get(i).getUsername(), container.get(i));
        }
    }

    //initial constructor, used to generate admin account.
    public LoginMenu(boolean generate) {
        if (generate) {
            initComponents();
            LoginBG.requestFocus();
            this.userlist=Serializeation.loadUser();
            this.usedEmail=Serializeation.loadEmail();
            this.ListKurir=Serializeation.loadKurir();
            this.DeliveryList=Serializeation.loadPackage();
            User admin = new User("admin", "admin", "CustomerService@DNF.co.id"); //generate admin user.
            User a = new User("a","a","a@gmail.com"); //generate test unit user.
            userlist.put("admin", admin);
            userlist.put("a", a);
            usedEmail.put("CustomerService@DNF.co.id", "CustomerService@DNF.co.id");
            usedEmail.put("a@gmail.com","a@gmail.com");
            Package TestPackage = new Others("a","a","a","a","a","a",1,false,false,false,false,false);
            DeliveryList.put("a", TestPackage);
            System.out.println(DeliveryList);
            System.out.println(userlist);
            System.out.println(usedEmail);
            this.ShowPass = false;
            
        }
        System.out.println(usedEmail);
    }

    //situational, for compatibility issues.
    public LoginMenu(HashMap<String, User> userlist, HashMap<String, String> usedEmail) {
        initComponents();
        LoginBG.requestFocus();
        this.userlist = userlist;
        this.usedEmail = usedEmail;
        this.ShowPass = false;
        System.out.println(usedEmail);
    }

    //situational, for compatibility issues.
    public LoginMenu(HashMap<String, User> userlist, HashMap<String, String> usedEmail, HashMap<String, Package> DeliveryList) {
        initComponents();
        LoginBG.requestFocus();
        this.userlist = userlist;
        this.usedEmail = usedEmail;
        this.DeliveryList = DeliveryList;
        this.ShowPass = false;
        System.out.println(usedEmail);
    }

    //main cons
    public LoginMenu(HashMap<String, User> userlist, HashMap<String, String> usedEmail, HashMap<String, Package> DeliveryList, HashMap<String, Kurir> ListKurir) {
        initComponents();
        LoginBG.requestFocus();
        this.userlist = userlist;
        this.usedEmail = usedEmail;
        this.DeliveryList = DeliveryList;
        this.ListKurir = ListKurir;
        this.ShowPass = false;
        System.out.println(usedEmail);
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
        ShowPassButton = new javax.swing.JButton();
        LoginBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CreateAccButton.setBackground(new java.awt.Color(62, 97, 155));
        CreateAccButton.setForeground(new java.awt.Color(30, 120, 152));
        CreateAccButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_0.png"))); // NOI18N
        CreateAccButton.setBorder(null);
        CreateAccButton.setBorderPainted(false);
        CreateAccButton.setContentAreaFilled(false);
        CreateAccButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CreateAccButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 180, 40));

        SignInButton.setBackground(new java.awt.Color(62, 97, 155));
        SignInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_1.png"))); // NOI18N
        SignInButton.setBorder(null);
        SignInButton.setBorderPainted(false);
        SignInButton.setContentAreaFilled(false);
        SignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SignInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 430, 180, 40));

        usernamefield.setBackground(new java.awt.Color(62, 97, 155));
        usernamefield.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        usernamefield.setForeground(new java.awt.Color(255, 255, 255));
        usernamefield.setText("Enter Username");
        usernamefield.setCaretColor(new Color(255,255,255));
        usernamefield.setBorder(null);
        usernamefield.setDisabledTextColor(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(usernamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 263, 320, 20));

        PasswordField.setBackground(new java.awt.Color(62, 97, 155));
        PasswordField.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(255, 255, 255));
        PasswordField.setText("Password");
        PasswordField.setEchoChar((char) 0);
        PasswordField.setForeground(new Color(255,255,255));
        PasswordField.setCaretColor(new Color(255,255,255));
        PasswordField.setBorder(null);
        PasswordField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        PasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusLost(evt);
            }
        });
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 335, 280, 20));

        ShowPassButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye_crossed.png"))); // NOI18N
        ShowPassButton.setBorderPainted(false);
        ShowPassButton.setContentAreaFilled(false);
        ShowPassButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowPassButtonMouseClicked(evt);
            }
        });
        ShowPassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ShowPassButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 328, -1, 30));

        LoginBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login_Menu.png"))); // NOI18N
        getContentPane().add(LoginBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

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
            CreateAccountPage CAP = new CreateAccountPage(userlist, usedEmail);
            dispose();          //dispose of current JFrame. This is used to make performance better.
            CAP.setVisible(true);
            CAP.pack();
            CAP.setLocationRelativeTo(null);
            CAP.setResizable(false);
            CAP.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_CreateAccButtonActionPerformed

    private void SignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonActionPerformed
        User loggedAs;
        Kurir loggedAsKurir;
        String logUsername = usernamefield.getText();
        String logPass = String.valueOf(PasswordField.getPassword());
        if(userlist.containsKey(logUsername)){
            if(logUsername.equalsIgnoreCase("admin")&&logPass.equalsIgnoreCase("admin")){
                AdminMenu adminMenu = new AdminMenu(userlist, DeliveryList, ListKurir, usedEmail);
                adminMenu.setVisible(true);
                dispose();
                adminMenu.pack();
                adminMenu.setLocationRelativeTo(null);
                adminMenu.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
                adminMenu.setResizable(false);
            }
            else{
                String userPass = userlist.get(logUsername).getPassword();
                loggedAs = userlist.get(logUsername);
                if(userPass.equals(logPass)){
                    UserMainMenu UserMenu = new UserMainMenu(userlist, usedEmail, DeliveryList,ListKurir,loggedAs);
                    dispose();
                    UserMenu.setVisible(true);
                    UserMenu.pack();
                    UserMenu.setLocationRelativeTo(null);
                    UserMenu.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
                    UserMenu.setResizable(false);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Password salah!", "DNF App", 2);
                }
            }
        }
        else if(ListKurir.containsKey(logUsername)){
            String userPass = ListKurir.get(logUsername).getPassword();
            loggedAsKurir = ListKurir.get(logUsername);
            if(userPass.equals(logPass)){
                KurirMainMenu KurirMenu = new KurirMainMenu(userlist, usedEmail, DeliveryList,ListKurir,loggedAsKurir);
                dispose();
                KurirMenu.setVisible(true);
                KurirMenu.pack();
                KurirMenu.setLocationRelativeTo(null);
                KurirMenu.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
                KurirMenu.setResizable(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Password salah!", "DNF App", 2);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Username tidak ditemukan!", "DNF App", 2);
        }
    }//GEN-LAST:event_SignInButtonActionPerformed

    private void usernamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamefieldActionPerformed

    private void usernamefieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernamefieldFocusGained
        if (usernamefield.getText().equals("Enter Username")) {
            usernamefield.setText("");
            usernamefield.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_usernamefieldFocusGained

    private void usernamefieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernamefieldFocusLost
        if (usernamefield.getText().equals("")) {
            usernamefield.setText("Enter Username");
            usernamefield.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_usernamefieldFocusLost

    private void PasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusGained
        if (!ShowPass) {
            PasswordField.setEchoChar('*');
            String password = String.valueOf(PasswordField.getPassword());
            if (password.toLowerCase().equals("password")) {
                PasswordField.setText("");
                PasswordField.setForeground(new Color(255, 255, 255));
            }
        }
    }//GEN-LAST:event_PasswordFieldFocusGained

    private void PasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusLost
        if (!ShowPass) {
            String password = String.valueOf(PasswordField.getPassword());
            if (password.toLowerCase().equals("password") || password.toLowerCase().equals("")) {
                PasswordField.setText("Password");
                PasswordField.setEchoChar((char) 0);
                PasswordField.setForeground(new Color(255, 255, 255));
            }
        }
    }//GEN-LAST:event_PasswordFieldFocusLost

    private void ShowPassButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowPassButtonMouseClicked
        if (this.ShowPass == true) {
            this.ShowPass = false;
            this.ShowPassButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye_crossed.png")));
        } else {
            this.ShowPass = true;
            ShowPassButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye.png")));
        }
        switchSee();
    }//GEN-LAST:event_ShowPassButtonMouseClicked

    private void ShowPassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowPassButtonActionPerformed

    private void switchSee() {
        String currentString = String.valueOf(this.PasswordField.getPassword());
        if (this.ShowPass == false) {
            PasswordField.setEchoChar('*');
            String password = String.valueOf(PasswordField.getPassword());
            if (password.toLowerCase().equals("password") || password.toLowerCase().equals("")) {
                PasswordField.setText("Password");
                PasswordField.setEchoChar((char) 0);
                PasswordField.setForeground(new Color(255, 255, 255));
            }

        } else {
            if (currentString.equalsIgnoreCase("password")) {
                PasswordField.setText("");
            }
            PasswordField.setEchoChar((char) 0);
        }
    }

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
    private javax.swing.JLabel LoginBG;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton ShowPassButton;
    private javax.swing.JButton SignInButton;
    private javax.swing.JTextField usernamefield;
    // End of variables declaration//GEN-END:variables
}
