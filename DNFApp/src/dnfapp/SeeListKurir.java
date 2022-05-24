/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dnfapp;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Frans
 */
public class SeeListKurir extends javax.swing.JFrame {

    private HashMap<String, User> userlist = new HashMap<String, User>();
    private HashMap<String, String> usedEmail = new HashMap<String, String>();
    private HashMap<String, Package> DeliveryList = new HashMap<String, Package>();
    private HashMap<String, Kurir> ListKurir = new HashMap<String, Kurir>();
    private ArrayList<Kurir> ARRListKurir = new ArrayList<Kurir>();

    private static String tempNamaLamaKurir;

    //for compatibility.
    public SeeListKurir() {
        initComponents();
    }

    //main cons
    public SeeListKurir(HashMap<String, User> userlist, HashMap<String, String> usedEmail, HashMap<String, Package> DeliveryList, HashMap<String, Kurir> ListKurir) {
        initComponents();
        this.userlist = userlist;
        this.usedEmail = usedEmail;
        this.DeliveryList = DeliveryList;
        this.ListKurir = ListKurir;
        if (ListKurir.size() != 0) {
            generate();
            generateElement();
        }
    }

    private void generateElement() {
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < ARRListKurir.size(); i++) {
            String container = ARRListKurir.get(i).getNama() + " - " + ARRListKurir.get(i).getUsername();
            listModel.addElement(container);
        }
        JListKurir.setModel(listModel);
    }

    private void generate() {
        for (Map.Entry<String, Kurir> set : ListKurir.entrySet()) {
            this.ARRListKurir.add(set.getValue());
        }
        System.out.println(ARRListKurir.get(0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JListKurir = new javax.swing.JList<>();
        KeluarSeeListKurir = new javax.swing.JButton();
        displayNamaKurir = new javax.swing.JTextField();
        LabelNama = new javax.swing.JLabel();
        LabelUser = new javax.swing.JLabel();
        displayUsernameKurir = new javax.swing.JTextField();
        LabelPassword = new javax.swing.JLabel();
        displayPasswordKurir = new javax.swing.JTextField();
        EditKurirButton = new javax.swing.JButton();
        BG = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JListKurir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JListKurir.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Your List of Kurir will be here" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        JListKurir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JListKurirMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JListKurir);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 510, 340));

        KeluarSeeListKurir.setBackground(new java.awt.Color(4, 37, 107));
        KeluarSeeListKurir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon_5_minisize.png"))); // NOI18N
        KeluarSeeListKurir.setBorder(null);
        KeluarSeeListKurir.setBorderPainted(false);
        KeluarSeeListKurir.setContentAreaFilled(false);
        KeluarSeeListKurir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarSeeListKurirActionPerformed(evt);
            }
        });
        getContentPane().add(KeluarSeeListKurir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 80, -1));

        displayNamaKurir.setBackground(new java.awt.Color(62, 97, 155));
        displayNamaKurir.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        displayNamaKurir.setBorder(null);
        displayNamaKurir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayNamaKurirActionPerformed(evt);
            }
        });
        getContentPane().add(displayNamaKurir, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, 260, -1));

        LabelNama.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        LabelNama.setForeground(new java.awt.Color(0, 0, 0));
        LabelNama.setText("Nama : ");
        getContentPane().add(LabelNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, -1, -1));

        LabelUser.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        LabelUser.setForeground(new java.awt.Color(0, 0, 0));
        LabelUser.setText("Username :");
        getContentPane().add(LabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, -1, -1));

        displayUsernameKurir.setBackground(new java.awt.Color(62, 97, 155));
        displayUsernameKurir.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        displayUsernameKurir.setBorder(null);
        displayUsernameKurir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayUsernameKurirActionPerformed(evt);
            }
        });
        getContentPane().add(displayUsernameKurir, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, 210, -1));

        LabelPassword.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        LabelPassword.setForeground(new java.awt.Color(0, 0, 0));
        LabelPassword.setText("Password :");
        getContentPane().add(LabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, -1, -1));

        displayPasswordKurir.setBackground(new java.awt.Color(62, 97, 155));
        displayPasswordKurir.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        displayPasswordKurir.setBorder(null);
        displayPasswordKurir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayPasswordKurirActionPerformed(evt);
            }
        });
        getContentPane().add(displayPasswordKurir, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 340, 200, -1));

        EditKurirButton.setText("Edit");
        EditKurirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditKurirButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EditKurirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 440, -1, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List_Kurir.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 600, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JListKurirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JListKurirMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2 && evt.getButton() == evt.BUTTON1) {

            int i = JListKurir.getSelectedIndex();
            tempNamaLamaKurir = ARRListKurir.get(i).getNama();
//            System.out.println("ini i nyaaaaaaaaa" + i);

            displayNamaKurir.setText(ARRListKurir.get(i).getNama());

            displayUsernameKurir.setText(ARRListKurir.get(i).getUsername());

            displayPasswordKurir.setText(ARRListKurir.get(i).getPassword());

        }

    }//GEN-LAST:event_JListKurirMouseClicked

    private void KeluarSeeListKurirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarSeeListKurirActionPerformed
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
    }//GEN-LAST:event_KeluarSeeListKurirActionPerformed

    private void displayNamaKurirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayNamaKurirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayNamaKurirActionPerformed

    private void displayUsernameKurirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayUsernameKurirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayUsernameKurirActionPerformed

    private void displayPasswordKurirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayPasswordKurirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayPasswordKurirActionPerformed

    private void EditKurirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditKurirButtonActionPerformed
        // TODO add your handling code here:
        String newnama = displayNamaKurir.getText();
        String newPassword = displayPasswordKurir.getText();
        String newUsername = displayUsernameKurir.getText();

        if (displayNamaKurir.getText().equals("") && displayPasswordKurir.getText().equals("") && displayUsernameKurir.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan pilih user yang mau di-edit!", "DNF App", 2);
        } else {
            int ctr = 0;
            for (int i = 0; i < ARRListKurir.size(); i++) {
                if (ARRListKurir.get(i).getNama().equals(tempNamaLamaKurir)) {
                    ctr = i;
                    break;
                }
            }
            for (Map.Entry<String, Kurir> set : ListKurir.entrySet()) {
                if (set.getKey().equals(tempNamaLamaKurir)) {

                }
//                this.ARRListKurir.add(set.getValue());
            }
            ARRListKurir.get(ctr).setNama(newnama);
            ARRListKurir.get(ctr).setUsername(newUsername);
            ARRListKurir.get(ctr).setPassword(newPassword);
            resetField();
            JOptionPane.showMessageDialog(null, "Berhasil memperbaharui data Kurir!", "DNF App", 1);
        }

    }//GEN-LAST:event_EditKurirButtonActionPerformed

    void resetField() {
        displayNamaKurir.setText("");
        displayUsernameKurir.setText("");
        displayPasswordKurir.setText("");
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
            java.util.logging.Logger.getLogger(SeeListKurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeeListKurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeeListKurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeeListKurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeeListKurir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton EditKurirButton;
    private javax.swing.JList<String> JListKurir;
    private javax.swing.JButton KeluarSeeListKurir;
    private javax.swing.JLabel LabelNama;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelUser;
    private javax.swing.JTextField displayNamaKurir;
    private javax.swing.JTextField displayPasswordKurir;
    private javax.swing.JTextField displayUsernameKurir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
