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
 * @author Lenovo
 */
public class HapusPengiriman extends javax.swing.JFrame {

    /**
     * Creates new form HapusPengiriman
     */
    private HashMap<String, User> userlist = new HashMap<String, User>();
    private HashMap<String, String> usedEmail = new HashMap<String, String>();
    private HashMap<String, Package> DeliveryList = new HashMap<String, Package>();
    private HashMap<String, Kurir> ListKurir = new HashMap<String, Kurir>();

    public HapusPengiriman() {
        initComponents();
    }

    public HapusPengiriman(HashMap<String, User> userlist, HashMap<String, String> usedEmail, HashMap<String, Package> DeliveryList, HashMap<String, Kurir> ListKurir) {
        initComponents();
        this.userlist = userlist;
        this.usedEmail = usedEmail;
        this.DeliveryList = DeliveryList;
        this.ListKurir = ListKurir;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputResiDihapus = new javax.swing.JTextField();
        HapusButton = new javax.swing.JButton();
        keluarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputResiDihapus.setBackground(new java.awt.Color(62, 97, 155));
        inputResiDihapus.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        inputResiDihapus.setForeground(new java.awt.Color(255, 255, 255));
        inputResiDihapus.setText("Masukan No.Resi yang ingin dihapus");
        inputResiDihapus.setBorder(null);
        inputResiDihapus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputResiDihapusFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputResiDihapusFocusLost(evt);
            }
        });
        inputResiDihapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputResiDihapusActionPerformed(evt);
            }
        });
        jPanel1.add(inputResiDihapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 320, 40));

        HapusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_6.png"))); // NOI18N
        HapusButton.setBorder(null);
        HapusButton.setBorderPainted(false);
        HapusButton.setContentAreaFilled(false);
        HapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusButtonActionPerformed(evt);
            }
        });
        jPanel1.add(HapusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 520, -1, -1));

        keluarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon_5_minisize.png"))); // NOI18N
        keluarButton.setBorderPainted(false);
        keluarButton.setContentAreaFilled(false);
        keluarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(keluarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 592, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hapus_Pengiriman.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputResiDihapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputResiDihapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputResiDihapusActionPerformed

    private void inputResiDihapusFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputResiDihapusFocusGained
        // TODO add your handling code here:
        if (inputResiDihapus.getText().equalsIgnoreCase("Masukan No.Resi yang ingin dihapus")) {
            inputResiDihapus.setText("");
            inputResiDihapus.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_inputResiDihapusFocusGained

    private void inputResiDihapusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputResiDihapusFocusLost
        // TODO add your handling code here:
        if (inputResiDihapus.getText().equals("")) {
            inputResiDihapus.setText("Masukan No.Resi yang ingin dihapus");
            inputResiDihapus.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_inputResiDihapusFocusLost

    private void HapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusButtonActionPerformed
        // TODO add your handling code here:
        if (inputResiDihapus.getText().equalsIgnoreCase("Masukan No.Resi yang ingin dihapus")) {
            JOptionPane.showMessageDialog(null, "Resi masih kosong!");

        } else {
            if (!(DeliveryList.containsKey(inputResiDihapus.getText()))) {
                JOptionPane.showMessageDialog(null, "Resi tidak valid!");
            } else {
                DeliveryList.remove(inputResiDihapus.getText());
                JOptionPane.showMessageDialog(null, "Resi berhasil dihapus!");
            }
        }
    }//GEN-LAST:event_HapusButtonActionPerformed

    private void keluarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarButtonActionPerformed
        // TODO add your handling code here:
        int userAmount = userlist.size();
        if (userAmount == 0) {
            AdminMenu AM = new AdminMenu();
            dispose();
            AM.setVisible(true);
            AM.pack();
            AM.setResizable(false);
            AM.setLocationRelativeTo(null);
            AM.setDefaultCloseOperation(AdminMenu.EXIT_ON_CLOSE);
        } else if (userAmount > 0) {
            AdminMenu AM = new AdminMenu(userlist, DeliveryList, ListKurir, usedEmail);
            dispose();
            AM.setVisible(true);
            AM.pack();
            AM.setResizable(false);
            AM.setLocationRelativeTo(null);
            AM.setDefaultCloseOperation(AdminMenu.EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_keluarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HapusPengiriman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HapusPengiriman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HapusPengiriman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HapusPengiriman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HapusPengiriman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HapusButton;
    private javax.swing.JTextField inputResiDihapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton keluarButton;
    // End of variables declaration//GEN-END:variables
}
