/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dnfapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;

/**
 *
 * @author Frans
 */
public class ListUser extends javax.swing.JFrame {

    private HashMap<String, User> userlist = new HashMap<String, User>();
    private HashMap<String, String> usedEmail = new HashMap<String, String>();
    private HashMap<String, Package> DeliveryList = new HashMap<String, Package>();
    private HashMap<String, Kurir> ListKurir = new HashMap<String, Kurir>();
    private ArrayList<User> ARRListUser = new ArrayList<User>();
    private Integer SelectedObj;
    
    public ListUser() {
        initComponents();
    }
    
    public ListUser(HashMap<String, User> userlist, HashMap<String, String> usedEmail, HashMap<String, Package> DeliveryList, HashMap<String, Kurir> ListKurir){
        initComponents();
        this.userlist = userlist;
        this.usedEmail = usedEmail;
        this.DeliveryList = DeliveryList;
        this.ListKurir = ListKurir;
        if (userlist.size() != 0) {
            
        }
        this.SelectedObj=null;
    }

    private void generateElement() {
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < ARRListUser.size(); i++) {
            String container = ARRListUser.get(i).getUsername() + " - " + ARRListUser.get(i).getEmail();
            listModel.addElement(container);
        }
        JListUser.setModel(listModel);
    }

    private void generate() {
        for (Map.Entry<String, User> set : userlist.entrySet()) {
            this.ARRListUser.add(set.getValue());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        JListUser = new javax.swing.JList<>();
        HapusButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        BG_ListUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JListUser.setBackground(new java.awt.Color(255, 255, 255));
        JListUser.setForeground(new java.awt.Color(0, 0, 0));
        JListUser.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Registered Users will appear here." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(JListUser);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 400, 380));

        HapusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_6.png"))); // NOI18N
        HapusButton.setBorderPainted(false);
        HapusButton.setContentAreaFilled(false);
        getContentPane().add(HapusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 163, 43));

        EditButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_5.png"))); // NOI18N
        EditButton.setBorderPainted(false);
        EditButton.setContentAreaFilled(false);
        getContentPane().add(EditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 480, 165, 43));

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon_5_minisize.png"))); // NOI18N
        BackButton.setBorderPainted(false);
        BackButton.setContentAreaFilled(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 584, 80, -1));

        BG_ListUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List_User.png"))); // NOI18N
        getContentPane().add(BG_ListUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        AdminMenu AM = new AdminMenu(userlist, DeliveryList, ListKurir, usedEmail);
        dispose();
        AM.setVisible(true);
        AM.pack();
        AM.setResizable(false);
        AM.setLocationRelativeTo(null);
        AM.setDefaultCloseOperation(AdminMenu.EXIT_ON_CLOSE);
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ListUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG_ListUser;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton HapusButton;
    private javax.swing.JList<String> JListUser;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
