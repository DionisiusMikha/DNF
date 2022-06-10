/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dnfapp;

import java.util.*;
import javax.swing.DefaultListModel;

/**
 *
 * @author Frans
 */
public class DetailPackage extends javax.swing.JFrame {

    private HashMap<String, User> userlist = new HashMap<String, User>();
    private HashMap<String, String> usedEmail = new HashMap<String, String>();
    private HashMap<String, Package> DeliveryList = new HashMap<String, Package>();
    private HashMap<String, Kurir> ListKurir = new HashMap<String, Kurir>();
    private Package CurrentPackage;
    private User CurrentUser;
    
    public DetailPackage() {
        initComponents();
        generate();
    }
    
    public DetailPackage(HashMap<String, User> userlist,HashMap<String, String> usedEmail, HashMap<String, Package> DeliveryList,  HashMap<String, Kurir> ListKurir, Package CurrentPackage, User CurrentUser){
        initComponents();
        this.userlist=userlist;
        this.usedEmail=usedEmail;
        this.DeliveryList=DeliveryList;
        this.ListKurir=ListKurir;
        this.CurrentPackage=CurrentPackage;
        this.CurrentUser=CurrentUser;
        NamaPengirim.setText(CurrentPackage.getSender());
        NamaPenerima.setText(CurrentPackage.getReceiver());
        LabelAlamatPengirim.setText(CurrentPackage.getFrom());
        LabelAlamatPenerima.setText(CurrentPackage.getDestination());
        generate();
        
    }
    
    public void generate(){
        if(!CurrentPackage.getTrack().isEmpty()){
            DefaultListModel listModel = new DefaultListModel();
            for (int i = 0; i < CurrentPackage.getTrack().size(); i++) {
                String container = CurrentPackage.getTrack().get(i);
                listModel.addElement(container);
            }
            DetailList.setModel(listModel);
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

        NamaPengirim = new javax.swing.JLabel();
        LabelAlamatPengirim = new javax.swing.JLabel();
        NamaPenerima = new javax.swing.JLabel();
        LabelAlamatPenerima = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DetailList = new javax.swing.JList<>();
        LabelResi = new javax.swing.JLabel();
        ButtonKeluar = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NamaPengirim.setText(" ");
        getContentPane().add(NamaPengirim, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 160, 30));

        LabelAlamatPengirim.setText(" ");
        getContentPane().add(LabelAlamatPengirim, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 390, 40));
        getContentPane().add(NamaPenerima, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 170, 30));
        getContentPane().add(LabelAlamatPenerima, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 390, 40));

        jScrollPane1.setViewportView(DetailList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 420, 380));

        LabelResi.setText("jLabel1");
        getContentPane().add(LabelResi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 410, 40));

        ButtonKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon_5.png"))); // NOI18N
        ButtonKeluar.setBorderPainted(false);
        ButtonKeluar.setContentAreaFilled(false);
        ButtonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 610, 112, 112));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User_BG_ShippingDetail.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKeluarActionPerformed
        UserMainMenu UserMenu = new UserMainMenu(userlist, usedEmail, DeliveryList,ListKurir,CurrentUser);
        dispose();
        UserMenu.setVisible(true);
        UserMenu.pack();
        UserMenu.setLocationRelativeTo(null);
        UserMenu.setDefaultCloseOperation(CreateAccountPage.EXIT_ON_CLOSE);
        UserMenu.setResizable(false);
    }//GEN-LAST:event_ButtonKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(DetailPackage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailPackage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailPackage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailPackage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailPackage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton ButtonKeluar;
    private javax.swing.JList<String> DetailList;
    private javax.swing.JLabel LabelAlamatPenerima;
    private javax.swing.JLabel LabelAlamatPengirim;
    private javax.swing.JLabel LabelResi;
    private javax.swing.JLabel NamaPenerima;
    private javax.swing.JLabel NamaPengirim;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}