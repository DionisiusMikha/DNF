/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dnfapp;

import java.util.HashMap;

/**
 *
 * @author Frans
 */
public class AdminMenu extends javax.swing.JFrame {

    private HashMap<String, User> userlist = new HashMap<String, User>();
    private HashMap<String, Package> DeliveryList = new HashMap<String, Package>();
    private HashMap<String, String> usedEmail = new HashMap<String, String>();
    private HashMap<String, Kurir> ListKurir = new HashMap<String, Kurir>();

    public AdminMenu() {
        initComponents();
    }

    public AdminMenu(HashMap<String, User> userlist, HashMap<String, Package> DeliveryList, HashMap<String, Kurir> ListKurir, HashMap<String, String> usedEmail) {
        initComponents();
        this.userlist = userlist;
        this.DeliveryList = DeliveryList;
        this.ListKurir = ListKurir;
        this.usedEmail = usedEmail;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisKurirButton = new javax.swing.JButton();
        MasukanPengirimanButton = new javax.swing.JButton();
        HapusPengirimanButton = new javax.swing.JButton();
        DaftarKurirButton = new javax.swing.JButton();
        ListPengirimanButton = new javax.swing.JButton();
        LogOutButton = new javax.swing.JButton();
        ListSemuaUserButton = new javax.swing.JButton();
        AdminMenuBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegisKurirButton.setBackground(new java.awt.Color(233, 233, 255));
        RegisKurirButton.setForeground(new java.awt.Color(37, 150, 190));
        RegisKurirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon_0.png"))); // NOI18N
        RegisKurirButton.setBorder(null);
        RegisKurirButton.setBorderPainted(false);
        RegisKurirButton.setContentAreaFilled(false);
        RegisKurirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisKurirButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RegisKurirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        MasukanPengirimanButton.setBackground(new java.awt.Color(233, 233, 255));
        MasukanPengirimanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon_1.png"))); // NOI18N
        MasukanPengirimanButton.setBorder(null);
        MasukanPengirimanButton.setBorderPainted(false);
        MasukanPengirimanButton.setContentAreaFilled(false);
        MasukanPengirimanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasukanPengirimanButtonActionPerformed(evt);
            }
        });
        getContentPane().add(MasukanPengirimanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        HapusPengirimanButton.setBackground(new java.awt.Color(233, 233, 255));
        HapusPengirimanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon_2.png"))); // NOI18N
        HapusPengirimanButton.setBorder(null);
        HapusPengirimanButton.setBorderPainted(false);
        HapusPengirimanButton.setContentAreaFilled(false);
        HapusPengirimanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusPengirimanButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HapusPengirimanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 440, -1, -1));

        DaftarKurirButton.setBackground(new java.awt.Color(233, 233, 255));
        DaftarKurirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon_3.png"))); // NOI18N
        DaftarKurirButton.setBorder(null);
        DaftarKurirButton.setBorderPainted(false);
        DaftarKurirButton.setContentAreaFilled(false);
        DaftarKurirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarKurirButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DaftarKurirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 170, -1));

        ListPengirimanButton.setBackground(new java.awt.Color(233, 233, 255));
        ListPengirimanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon_4.png"))); // NOI18N
        ListPengirimanButton.setBorder(null);
        ListPengirimanButton.setBorderPainted(false);
        ListPengirimanButton.setContentAreaFilled(false);
        ListPengirimanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListPengirimanButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ListPengirimanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, -1, -1));

        LogOutButton.setBackground(new java.awt.Color(192, 196, 220));
        LogOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon_5.png"))); // NOI18N
        LogOutButton.setBorder(null);
        LogOutButton.setBorderPainted(false);
        LogOutButton.setContentAreaFilled(false);
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1106, 560, -1, -1));

        ListSemuaUserButton.setBackground(new java.awt.Color(233, 233, 255));
        ListSemuaUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon_6.png"))); // NOI18N
        ListSemuaUserButton.setActionCommand("jButton1");
        ListSemuaUserButton.setBorder(null);
        ListSemuaUserButton.setBorderPainted(false);
        ListSemuaUserButton.setContentAreaFilled(false);
        ListSemuaUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListSemuaUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ListSemuaUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 210, -1, -1));

        AdminMenuBG.setBackground(new java.awt.Color(242, 242, 255));
        AdminMenuBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BG_Admin.png"))); // NOI18N
        getContentPane().add(AdminMenuBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisKurirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisKurirButtonActionPerformed
        RegisterKurir registerkuliah = new RegisterKurir(userlist, DeliveryList, ListKurir, usedEmail);
        dispose();
        registerkuliah.setVisible(true);
        registerkuliah.pack();
        registerkuliah.setLocationRelativeTo(null);
        registerkuliah.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
        registerkuliah.setResizable(false);
    }//GEN-LAST:event_RegisKurirButtonActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        LoginMenu LM = new LoginMenu(userlist, usedEmail, DeliveryList, ListKurir);
        dispose();
        LM.setVisible(true);
        LM.pack();
        LM.setLocationRelativeTo(null);
        LM.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
        LM.setResizable(false);
    }//GEN-LAST:event_LogOutButtonActionPerformed

    private void DaftarKurirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarKurirButtonActionPerformed
        SeeListKurir SLM = new SeeListKurir(userlist, usedEmail, DeliveryList, ListKurir);
        dispose();
        SLM.setVisible(true);
        SLM.pack();
        SLM.setLocationRelativeTo(null);
        SLM.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
        SLM.setResizable(false);
    }//GEN-LAST:event_DaftarKurirButtonActionPerformed

    private void ListSemuaUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListSemuaUserButtonActionPerformed
        ListUser LU = new ListUser(userlist, usedEmail, DeliveryList, ListKurir);
        dispose();
        LU.setVisible(true);
        LU.pack();
        LU.setLocationRelativeTo(null);
        LU.setDefaultCloseOperation(ListUser.EXIT_ON_CLOSE);
        LU.setResizable(false);
    }//GEN-LAST:event_ListSemuaUserButtonActionPerformed

    private void MasukanPengirimanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasukanPengirimanButtonActionPerformed
        // TODO add your handling code here:
        MasukkanPengiriman MP = new MasukkanPengiriman(userlist, DeliveryList, usedEmail, ListKurir);
        dispose();
        MP.setVisible(true);
        MP.pack();
        MP.setLocationRelativeTo(null);
        MP.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
        MP.setResizable(false);

    }//GEN-LAST:event_MasukanPengirimanButtonActionPerformed

    private void ListPengirimanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListPengirimanButtonActionPerformed
        ListPengiriman LP = new ListPengiriman(userlist, usedEmail, DeliveryList, ListKurir);
        dispose();
        LP.setVisible(true);
        LP.pack();
        LP.setLocationRelativeTo(null);
        LP.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
        LP.setResizable(false);
    }//GEN-LAST:event_ListPengirimanButtonActionPerformed

    private void HapusPengirimanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusPengirimanButtonActionPerformed
        // TODO add your handling code here:
        HapusPengiriman HP = new HapusPengiriman(userlist, usedEmail, DeliveryList, ListKurir);
        dispose();
        HP.setVisible(true);
        HP.pack();
        HP.setLocationRelativeTo(null);
        HP.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
        HP.setResizable(false);
    }//GEN-LAST:event_HapusPengirimanButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminMenuBG;
    private javax.swing.JButton DaftarKurirButton;
    private javax.swing.JButton HapusPengirimanButton;
    private javax.swing.JButton ListPengirimanButton;
    private javax.swing.JButton ListSemuaUserButton;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton MasukanPengirimanButton;
    private javax.swing.JButton RegisKurirButton;
    // End of variables declaration//GEN-END:variables
}
