/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dnfapp;

import java.awt.Color;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Frans
 */
public class CreateAccountPage extends javax.swing.JFrame {

    private HashMap<String, User> userlist = new HashMap<String, User>();
    private HashMap<String, String> usedEmail = new HashMap<String, String>();
    private HashMap<String, Integer> VALID_DOMAIN = new HashMap<String, Integer>();
    private HashMap<String, Package> DeliveryList = new HashMap<String, Package>();
    private HashMap<String, Kurir> ListKurir = new HashMap<String, Kurir>();

    /**
     * Creates new form CreateAccountPage
     */
    public CreateAccountPage() {
        initComponents();
        GenerateList();
    }

    //situational, for compatibility issues.
    public CreateAccountPage(HashMap<String, User> userlist, HashMap<String, String> usedEmail) {
        initComponents();
        GenerateList();
        this.userlist = userlist;
        this.usedEmail=usedEmail;
    }
    
    //situational, for compatibility issues.
    public CreateAccountPage(HashMap<String, User> userlist, HashMap<String, String> usedEmail, HashMap<String, Package> DeliveryList) {
        initComponents();
        GenerateList();
        this.userlist = userlist;
        this.usedEmail=usedEmail;
        this.DeliveryList=DeliveryList;
    }
    
    //main cons
    public CreateAccountPage(HashMap<String, User> userlist, HashMap<String, String> usedEmail, HashMap<String, Package> DeliveryList, HashMap<String, Kurir> ListKurir) {
        initComponents();
        GenerateList();
        this.userlist = userlist;
        this.usedEmail=usedEmail;
        this.DeliveryList=DeliveryList;
        this.ListKurir=ListKurir;
    }
    
    //generate email list, to add use put method to VALID_DOMAIN HashMap. Put Method requires String(domain name) and Integer(domain name str length)
    private void GenerateList(){
        VALID_DOMAIN.put("gmail.com", 10);
        VALID_DOMAIN.put("yahoo.com", 10);
        VALID_DOMAIN.put("outlook.com", 12);
        VALID_DOMAIN.put("hotmail.com", 12);
        VALID_DOMAIN.put("live.com", 9);
        VALID_DOMAIN.put("aol.com", 8);
        VALID_DOMAIN.put("icloud.com", 11);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegUsernameField = new javax.swing.JTextField();
        RegEmailField = new javax.swing.JTextField();
        RegPassField = new javax.swing.JPasswordField();
        ConfirmPassField = new javax.swing.JPasswordField();
        CancelButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        Background_Frame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegUsernameField.setBackground(new java.awt.Color(62, 97, 155));
        RegUsernameField.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        RegUsernameField.setForeground(new java.awt.Color(255, 255, 255));
        RegUsernameField.setText("Username");
        RegUsernameField.setBorder(null);
        RegUsernameField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        RegUsernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RegUsernameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RegUsernameFieldFocusLost(evt);
            }
        });
        RegUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegUsernameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(RegUsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 322, 20));

        RegEmailField.setBackground(new java.awt.Color(62, 97, 155));
        RegEmailField.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        RegEmailField.setForeground(new java.awt.Color(255, 255, 255));
        RegEmailField.setText("E-Mail");
        RegEmailField.setBorder(null);
        RegEmailField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        RegEmailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RegEmailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RegEmailFieldFocusLost(evt);
            }
        });
        RegEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegEmailFieldActionPerformed(evt);
            }
        });
        getContentPane().add(RegEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 322, 20));

        RegPassField.setBackground(new java.awt.Color(62, 97, 155));
        RegPassField.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        RegPassField.setForeground(new java.awt.Color(255, 255, 255));
        RegPassField.setBorder(null);
        RegPassField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        RegPassField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RegPassFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RegPassFieldFocusLost(evt);
            }
        });
        RegPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegPassFieldActionPerformed(evt);
            }
        });
        getContentPane().add(RegPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 325, 322, 20));

        ConfirmPassField.setBackground(new java.awt.Color(62, 97, 155));
        ConfirmPassField.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        ConfirmPassField.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmPassField.setBorder(null);
        ConfirmPassField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        ConfirmPassField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ConfirmPassFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ConfirmPassFieldFocusLost(evt);
            }
        });
        ConfirmPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPassFieldActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 378, 322, 20));

        CancelButton.setBackground(new java.awt.Color(62, 97, 155));
        CancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_2.png"))); // NOI18N
        CancelButton.setBorder(null);
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 440, 180, 40));

        SubmitButton.setBackground(new java.awt.Color(62, 97, 155));
        SubmitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_0.png"))); // NOI18N
        SubmitButton.setBorder(null);
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 180, 40));

        Background_Frame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Create_Acc.png"))); // NOI18N
        getContentPane().add(Background_Frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -230, -1, 1170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegPassFieldActionPerformed

    }//GEN-LAST:event_RegPassFieldActionPerformed

    private void ConfirmPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPassFieldActionPerformed

    }//GEN-LAST:event_ConfirmPassFieldActionPerformed

    private void RegUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegUsernameFieldActionPerformed

    }//GEN-LAST:event_RegUsernameFieldActionPerformed

    private void RegUsernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegUsernameFieldFocusGained
        if (RegUsernameField.getText().equals("Username")) {
            RegUsernameField.setText("");
            RegUsernameField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_RegUsernameFieldFocusGained

    private void RegUsernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegUsernameFieldFocusLost
        if (RegUsernameField.getText().equals("")) {
            RegUsernameField.setText("Username");
            RegUsernameField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_RegUsernameFieldFocusLost

    private void RegEmailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegEmailFieldFocusGained
        if (RegEmailField.getText().equals("E-Mail")) {
            RegEmailField.setText("");
            RegEmailField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_RegEmailFieldFocusGained

    private void RegEmailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegEmailFieldFocusLost
        if (RegEmailField.getText().equals("")) {
            RegEmailField.setText("E-Mail");
            RegEmailField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_RegEmailFieldFocusLost

    private void RegPassFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegPassFieldFocusGained
        RegPassField.setEchoChar('*');
        String password = String.valueOf(RegPassField.getPassword());

        if (password.toLowerCase().equals("password")) {
            RegPassField.setText("");
            RegPassField.setForeground(Color.black);
        }

    }//GEN-LAST:event_RegPassFieldFocusGained

    private void RegPassFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegPassFieldFocusLost
        String password = String.valueOf(RegPassField.getPassword());
//
        if (password.toLowerCase().equals("password") || password.toLowerCase().equals("")) {
            RegPassField.setText("Password");
            RegPassField.setEchoChar((char) 0);
            RegPassField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_RegPassFieldFocusLost

    private void ConfirmPassFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ConfirmPassFieldFocusGained
        ConfirmPassField.setEchoChar('*');
        String password = String.valueOf(ConfirmPassField.getPassword());

        if (password.toLowerCase().equals("confirm password")) {
            ConfirmPassField.setText("");
            ConfirmPassField.setForeground(Color.black);
        }
    }//GEN-LAST:event_ConfirmPassFieldFocusGained

    private void ConfirmPassFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ConfirmPassFieldFocusLost
        String password = String.valueOf(ConfirmPassField.getPassword());
//
        if (password.toLowerCase().equals("password") || password.toLowerCase().equals("")) {
            ConfirmPassField.setText("Confirm Password");
            ConfirmPassField.setEchoChar((char) 0);
            ConfirmPassField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_ConfirmPassFieldFocusLost

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        String newUsername = RegUsernameField.getText();
        String newEmail = RegEmailField.getText();
        String newPass = String.valueOf(RegPassField.getPassword());
        String ConfirmPass = String.valueOf(ConfirmPassField.getPassword());

        if (newUsername.equals("Username")) {
            JOptionPane.showMessageDialog(null, "Username diisi terlebih dahulu!");
        } 
        else {
            if (newEmail.equals("E-Mail")||newEmail.equals("")) {
                JOptionPane.showMessageDialog(null, "E-Mail diisi terlebih dahulu!");
            } 
            else {
                Integer mailLen = newEmail.length();
                String[] parts = new String[2];
                boolean EmailUsed = false;
                if(usedEmail.containsKey(newEmail)){
                    EmailUsed = true;
                }
                if(newEmail.contains("@")&&!EmailUsed){
                    parts = newEmail.split("@");
                    if (VALID_DOMAIN.containsKey(parts[1])){
                        if (ConfirmPass.equals(newPass) && !(newPass.equals(""))) {
                            boolean exist = false;
                            if (userlist.containsKey(newUsername)) {
                                exist = true;
                            }
                            if (!exist) {
                                User newUser = new User(newUsername, newPass, newEmail);
                                userlist.put(newUsername, newUser);
                                usedEmail.put(newEmail, newUsername);
                                LoginMenu LM = new LoginMenu(userlist,usedEmail);
                                dispose();
                                LM.setVisible(true);
                                LM.pack();
                                LM.setLocationRelativeTo(null);
                                LM.setDefaultCloseOperation(LoginMenu.EXIT_ON_CLOSE);
                                JOptionPane.showMessageDialog(null, "Berhasil daftar!");
                            } 
                            else {
                                JOptionPane.showMessageDialog(null, "Username telah dipakai!");
                            }
                        } 
                        else if (newPass.equals("")) {
                            JOptionPane.showMessageDialog(null, "Password belum diisi!");
                        } 
                        else {
                            JOptionPane.showMessageDialog(null, "Password dan Confirm Password harus sama!");
                        }
                    }
                }
                else if(EmailUsed){
                    JOptionPane.showMessageDialog(null, "Alamat E-mail tersebut sudah digunakan!");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Format E-mail yang dimasukkan salah!");
                }
            }
        }

    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
        int userAmount = userlist.size();
        if (userAmount == 0) {
            LoginMenu LM = new LoginMenu();
            dispose();
            LM.setVisible(true);
            LM.pack();
            LM.setResizable(false);
            LM.setLocationRelativeTo(null);
            LM.setDefaultCloseOperation(LoginMenu.EXIT_ON_CLOSE);
        } else if (userAmount > 0) {
            LoginMenu LM = new LoginMenu(userlist,usedEmail);
            dispose();
            LM.setVisible(true);
            LM.pack();
            LM.setResizable(false);
            LM.setLocationRelativeTo(null);
            LM.setDefaultCloseOperation(LoginMenu.EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void RegEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegEmailFieldActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccountPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccountPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccountPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccountPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccountPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background_Frame;
    private javax.swing.JButton CancelButton;
    private javax.swing.JPasswordField ConfirmPassField;
    private javax.swing.JTextField RegEmailField;
    private javax.swing.JPasswordField RegPassField;
    private javax.swing.JTextField RegUsernameField;
    private javax.swing.JButton SubmitButton;
    // End of variables declaration//GEN-END:variables
}
