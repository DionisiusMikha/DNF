/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dnfapp;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Felicia Pangestu
 */
public class KurirMainMenu extends javax.swing.JFrame {

    /**
     * Creates new form LoginMenu
     */
    //initial constructor, used to generate admin account.
    private Kurir currentKurir;
    //HashMaps to Pass.
    private HashMap<String, User> userlist = new HashMap<String, User>();
    private HashMap<String, String> usedEmail = new HashMap<String, String>();
    private HashMap<String, Package> DeliveryList = new HashMap<String, Package>();
    private HashMap<String, Kurir> ListKurir = new HashMap<String, Kurir>();

    //private Generated HashMaps&ArrayList for City Index
    private HashMap<String, Kota> MapKota = new HashMap<String, Kota>();
    private ArrayList<String> listkota = new ArrayList<>();

    public KurirMainMenu() {
        initComponents();
        bgKurir.requestFocus();
    }

    public KurirMainMenu(HashMap<String, User> userlist, HashMap<String, String> usedEmail) {
        initComponents();
        this.userlist = userlist;
        this.usedEmail = usedEmail;
    }

    public KurirMainMenu(HashMap<String, User> userlist, HashMap<String, String> usedEmail, HashMap<String, Package> DeliveryList, HashMap<String, Kurir> ListKurir, Kurir currentKurir) {
        initComponents();
        this.userlist = userlist;
        this.usedEmail = usedEmail;
        this.DeliveryList = DeliveryList;
        this.ListKurir = ListKurir;
        this.currentKurir = currentKurir;
        this.setResizable(false);
        bgKurir.requestFocus();
//        WelcomeLabel.setText("Welcome, "+currentUser.getUsername());
//        this.cek_resi=false;
//        this.home_menu=true;
//        this.setting=false;
//        this.history=false;
//        this.send=false;
//        ButtonController(false,true,false,false,false);
//        generateCityCalc();
    }

    /**
     * Creates new form KurirMainMenu
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kurirKeluar = new javax.swing.JButton();
        listPaket = new javax.swing.JButton();
        cekStatusPaket = new javax.swing.JButton();
        bgKurir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kurirKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon_5_minisize.png"))); // NOI18N
        kurirKeluar.setBorderPainted(false);
        kurirKeluar.setContentAreaFilled(false);
        kurirKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurirKeluarActionPerformed(evt);
            }
        });
        jPanel1.add(kurirKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 590, -1, -1));

        listPaket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Kurir_Button_ListPaket.png"))); // NOI18N
        listPaket.setBorderPainted(false);
        listPaket.setContentAreaFilled(false);
        listPaket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPaketMouseClicked(evt);
            }
        });
        listPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listPaketActionPerformed(evt);
            }
        });
        jPanel1.add(listPaket, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        cekStatusPaket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Kurir_Button_CekStatus.png"))); // NOI18N
        cekStatusPaket.setBorderPainted(false);
        cekStatusPaket.setContentAreaFilled(false);
        cekStatusPaket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cekStatusPaketMouseClicked(evt);
            }
        });
        cekStatusPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekStatusPaketActionPerformed(evt);
            }
        });
        jPanel1.add(cekStatusPaket, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, -1, -1));

        bgKurir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Kurir_BG_MainMenu.png"))); // NOI18N
        jPanel1.add(bgKurir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kurirKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurirKeluarActionPerformed
        LoginMenu LM = new LoginMenu(userlist, usedEmail, DeliveryList, ListKurir);
        dispose();
        LM.setVisible(true);
        LM.pack();
        LM.setLocationRelativeTo(null);
        LM.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
        LM.setResizable(false);
    }//GEN-LAST:event_kurirKeluarActionPerformed

    private void listPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listPaketActionPerformed
        // TODO add your handling code here:
        ListPaketKurir LM = new ListPaketKurir(userlist, usedEmail, DeliveryList, ListKurir, currentKurir);
        dispose();
        LM.setVisible(true);
        LM.pack();
        LM.setLocationRelativeTo(null);
        LM.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
        LM.setResizable(false);
    }//GEN-LAST:event_listPaketActionPerformed

    private void cekStatusPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekStatusPaketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cekStatusPaketActionPerformed

    private void listPaketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPaketMouseClicked
        ListPaketKurir LM = new ListPaketKurir(userlist, usedEmail, DeliveryList, ListKurir, currentKurir);
        dispose();
        LM.setVisible(true);
        LM.pack();
        LM.setLocationRelativeTo(null);
        LM.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
        LM.setResizable(false);
    }//GEN-LAST:event_listPaketMouseClicked

    private void cekStatusPaketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cekStatusPaketMouseClicked
        // TODO add your handling code here:
        CekStatusKurir LM = new CekStatusKurir(userlist, usedEmail, DeliveryList, ListKurir, currentKurir);
        dispose();
        LM.setVisible(true);
        LM.pack();
        LM.setLocationRelativeTo(null);
        LM.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
        LM.setResizable(false);
    }//GEN-LAST:event_cekStatusPaketMouseClicked

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
            java.util.logging.Logger.getLogger(KurirMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KurirMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KurirMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KurirMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KurirMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgKurir;
    private javax.swing.JButton cekStatusPaket;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kurirKeluar;
    private javax.swing.JButton listPaket;
    // End of variables declaration//GEN-END:variables
}
