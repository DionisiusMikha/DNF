/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dnfapp;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Frans
 */
public class ListPengiriman extends javax.swing.JFrame {
    
    private HashMap<String, User> userlist = new HashMap<String, User>();
    private HashMap<String, Package> DeliveryList = new HashMap<String, Package>();
    private HashMap<String, String> usedEmail = new HashMap<String, String>();
    private HashMap<String, Kurir> ListKurir = new HashMap<String, Kurir>();
    private ArrayList<Package> ARRListPackage = new ArrayList<>();
    private Integer SelectedObj = null;
    private boolean kategoriFnB;
    private boolean kategoriOthers;
    private boolean kategoriBnF;
    private boolean kategoriHnC;
    private boolean kategoriElectronic;
    private boolean kategoriSports;

    /**
     * Creates new form ListPengiriman
     */
    public ListPengiriman() {
        initComponents();
    }
    
    public ListPengiriman(HashMap<String, User> userlist, HashMap<String, String> usedEmail, HashMap<String, Package> DeliveryList, HashMap<String, Kurir> ListKurir) {
        initComponents();
        this.userlist = userlist;
        this.usedEmail = usedEmail;
        this.DeliveryList = DeliveryList;
        this.ListKurir = ListKurir;
        this.kategoriFnB = false;
        this.kategoriSports = false;
        this.kategoriHnC = false;
        this.kategoriBnF = false;
        this.kategoriElectronic = false;
        this.kategoriOthers = false;
        generateElement();
        inputKategoriBox();
    }
    
    private void generateList() {
        for (Map.Entry<String, Package> set : DeliveryList.entrySet()) {
            this.ARRListPackage.add(set.getValue());
        }
    }
    
    private void generateListv2() {
        
        DaftarPengiriman.removeAll();
        ARRListPackage.removeAll(ARRListPackage);
        for (Map.Entry<String, Package> set : DeliveryList.entrySet()) {
            if (set.getValue() instanceof FnB && kategoriFnB == true) {
                this.ARRListPackage.add(set.getValue());
                System.out.println("fnb");
            } else if (set.getValue() instanceof BnF && kategoriBnF == true) {
                this.ARRListPackage.add(set.getValue());
                System.out.println("bnf");
            } else if (set.getValue() instanceof HnC && kategoriHnC == true) {
                this.ARRListPackage.add(set.getValue());
                System.out.println("hnc");
            } else if (set.getValue() instanceof Others && kategoriOthers == true) {
                this.ARRListPackage.add(set.getValue());
                System.out.println("others");
            } else if (set.getValue() instanceof Electronic && kategoriElectronic == true) {
                this.ARRListPackage.add(set.getValue());
                System.out.println("electronic");
            } else if (set.getValue() instanceof Sports && kategoriSports == true) {
                this.ARRListPackage.add(set.getValue());
                System.out.println("sports");
            }
        }
    }
    
    private void generateElement() {
        generateList();
        if (this.ARRListPackage.size() != 0) {
            DefaultListModel listModel = new DefaultListModel();
            for (int i = 0; i < ARRListPackage.size(); i++) {
                String container = ARRListPackage.get(i).getResi() + " - " + ARRListPackage.get(i).getSender() + " - " + ARRListPackage.get(i).getReceiver();
                listModel.addElement(container);
            }
            DaftarPengiriman.setModel(listModel);
        }
    }
    
    private void generateElementv2() {
        
        generateListv2();
        if (this.ARRListPackage.size() != 0) {
            DefaultListModel listModel = new DefaultListModel();
            for (int i = 0; i < ARRListPackage.size(); i++) {
                String container = ARRListPackage.get(i).getResi() + " - " + ARRListPackage.get(i).getSender() + " - " + ARRListPackage.get(i).getReceiver();
                listModel.addElement(container);
            }
            DaftarPengiriman.setModel(listModel);
        } else if (this.ARRListPackage.size() == 0) {
            DefaultListModel listModel = new DefaultListModel();
            listModel.removeAllElements();
            DaftarPengiriman.setModel(listModel);
            ARRListPackage.removeAll(ARRListPackage);
        }
    }
    
    private void inputKategoriBox() {
        
        filterKategori.addItem("Others");
        filterKategori.addItem("Food and Beverages");
        filterKategori.addItem("Beauty and Fashion");
        filterKategori.addItem("Hobby and Collections");
        filterKategori.addItem("Electronic");
        filterKategori.addItem("Sports");
        
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
        DaftarPengiriman = new javax.swing.JList<>();
        ExitButton = new javax.swing.JButton();
        ReceiverField = new javax.swing.JLabel();
        SenderField = new javax.swing.JLabel();
        LabelAsal = new javax.swing.JLabel();
        LabelTujuan = new javax.swing.JLabel();
        LabelBerat = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ketBarang = new javax.swing.JTextArea();
        BGKeterangan = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        filterKategori = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DaftarPengiriman.setBackground(new java.awt.Color(4, 37, 107));
        DaftarPengiriman.setFont(new java.awt.Font("Fira Sans", 1, 14)); // NOI18N
        DaftarPengiriman.setForeground(new java.awt.Color(255, 255, 255));
        DaftarPengiriman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DaftarPengirimanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DaftarPengiriman);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 400, 360));

        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon_5_minisize.png"))); // NOI18N
        ExitButton.setBorderPainted(false);
        ExitButton.setContentAreaFilled(false);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 598, 75, 75));

        ReceiverField.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        ReceiverField.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ReceiverField, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 260, 30));

        SenderField.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        SenderField.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(SenderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 270, 20));

        LabelAsal.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        LabelAsal.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(LabelAsal, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 260, 20));

        LabelTujuan.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        LabelTujuan.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(LabelTujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, 280, 30));

        LabelBerat.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        LabelBerat.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(LabelBerat, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 270, 30));

        ketBarang.setBackground(new java.awt.Color(4, 37, 107));
        ketBarang.setColumns(20);
        ketBarang.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        ketBarang.setForeground(new java.awt.Color(255, 255, 255));
        ketBarang.setLineWrap(true);
        ketBarang.setRows(5);
        ketBarang.setWrapStyleWord(true);
        ketBarang.setBorder(null);
        ketBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ketBarang.setMargin(new java.awt.Insets(2, 5, 2, 5));
        ketBarang.setMinimumSize(new java.awt.Dimension(1, 18));
        jScrollPane2.setViewportView(ketBarang);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 320, 80));

        BGKeterangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BG_Keterangan_Pengiriman.png"))); // NOI18N
        getContentPane().add(BGKeterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 340, 120));

        jPanel1.setBackground(new java.awt.Color(62, 97, 155));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filter Kategori :");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 120, 30));

        jPanel2.setBackground(new java.awt.Color(62, 97, 155));

        filterKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filterKategoriMouseClicked(evt);
            }
        });
        filterKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterKategoriActionPerformed(evt);
            }
        });
        jPanel2.add(filterKategori);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 190, -1));

        jPanel3.setBackground(new java.awt.Color(62, 97, 155));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 260, 30));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Daftar_Pengiriman.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DaftarPengirimanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DaftarPengirimanMouseClicked
        SelectedObj = DaftarPengiriman.getSelectedIndex();
        ReceiverField.setText(ARRListPackage.get(SelectedObj).getReceiver());
        SenderField.setText(ARRListPackage.get(SelectedObj).getSender());
        LabelAsal.setText(ARRListPackage.get(SelectedObj).getFrom());
        LabelTujuan.setText(ARRListPackage.get(SelectedObj).getDestination());
        LabelBerat.setText(Integer.toString(ARRListPackage.get(SelectedObj).getWeight()));
        if (ARRListPackage.get(SelectedObj) instanceof Others) {
            Others tempObj = (Others) ARRListPackage.get(SelectedObj);
            String text = tempObj.getKeterangan();
            ketBarang.setText(text);
        } else {
//            String text = ARRListPackage.get(SelectedObj).getClassName();
//            ketBarang.setText(text);
        }
    }//GEN-LAST:event_DaftarPengirimanMouseClicked
    
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        AdminMenu AM = new AdminMenu(userlist, DeliveryList, ListKurir, usedEmail);
        dispose();
        AM.setVisible(true);
        AM.pack();
        AM.setResizable(false);
        AM.setLocationRelativeTo(null);
        AM.setDefaultCloseOperation(AdminMenu.EXIT_ON_CLOSE);
    }//GEN-LAST:event_ExitButtonActionPerformed
    
    private void filterKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterKategoriActionPerformed
        // TODO add your handling code here:
//        
        String temp = (String) filterKategori.getSelectedItem();
        int cek = 0;
        
        if (temp.equals("Food and Beverages")) {
//            DefaultListModel listModel = (DefaultListModel) DaftarPengiriman.getModel();
//            listModel.removeAllElements();
//            DaftarPengiriman.setModel(listModel);

            this.kategoriOthers = false;
            this.kategoriBnF = false;
            this.kategoriHnC = false;
            this.kategoriElectronic = false;
            this.kategoriSports = false;
            this.kategoriFnB = true;
            generateElementv2();
            
        } else if (temp.equals("Others")) {

//            DefaultListModel listModel = (DefaultListModel) DaftarPengiriman.getModel();
//            listModel.removeAllElements();
//            DaftarPengiriman.setModel(listModel);
            this.kategoriOthers = true;
            this.kategoriBnF = false;
            this.kategoriHnC = false;
            this.kategoriElectronic = false;
            this.kategoriSports = false;
            this.kategoriFnB = false;
            generateElementv2();
            
        } else if (temp.equals("Beauty and Fashion")) {

//            DefaultListModel listModel = (DefaultListModel) DaftarPengiriman.getModel();
//            listModel.removeAllElements();
//            DaftarPengiriman.setModel(listModel);
            this.kategoriOthers = false;
            this.kategoriBnF = true;
            this.kategoriHnC = false;
            this.kategoriElectronic = false;
            this.kategoriSports = false;
            this.kategoriFnB = false;
            generateElementv2();
            
        } else if (temp.equals("Hobby and Collections")) {

//            DefaultListModel listModel = (DefaultListModel) DaftarPengiriman.getModel();
//            listModel.removeAllElements();
//            DaftarPengiriman.setModel(listModel);
            this.kategoriHnC = true;
            this.kategoriOthers = false;
            this.kategoriBnF = false;
            this.kategoriElectronic = false;
            this.kategoriSports = false;
            this.kategoriFnB = false;
            generateElementv2();
            
        } else if (temp.equals("Electronic")) {

//            DefaultListModel listModel = (DefaultListModel) DaftarPengiriman.getModel();
//            listModel.removeAllElements();
//            DaftarPengiriman.setModel(listModel);
            this.kategoriElectronic = true;
            this.kategoriHnC = false;
            this.kategoriOthers = false;
            this.kategoriBnF = false;
            this.kategoriSports = false;
            this.kategoriFnB = false;
            generateElementv2();
            
        } else if (temp.equals("Sports")) {

//            DefaultListModel listModel = (DefaultListModel) DaftarPengiriman.getModel();
//            listModel.removeAllElements();
//            DaftarPengiriman.setModel(listModel);
            this.kategoriSports = true;
            this.kategoriElectronic = false;
            this.kategoriHnC = false;
            this.kategoriOthers = false;
            this.kategoriBnF = false;
            this.kategoriFnB = false;
            generateElementv2();
            
        }
    }//GEN-LAST:event_filterKategoriActionPerformed
    
    private void filterKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterKategoriMouseClicked
        // TODO add your handling code here:
//        filterKategori.addItem("Others");
//        filterKategori.addItem("Food and Beverages");
//        filterKategori.addItem("Beauty and Fashion");
//        filterKategori.addItem("Hobby and Collections");
//        filterKategori.addItem("Electronic");
//        filterKategori.addItem("Sports");

//        String temp = (String) filterKategori.getSelectedItem();
//        if (temp.equals("Food and Beverages")) {
////            DefaultListModel listModel = (DefaultListModel) DaftarPengiriman.getModel();
////            listModel.removeAllElements();
////            DaftarPengiriman.setModel(listModel);
//            this.kategoriOthers = false;
//            this.kategoriBnF = false;
//            this.kategoriHnC = false;
//            this.kategoriElectronic = false;
//            this.kategoriSports = false;
//            this.kategoriFnB = true;
//            generateElementv2();
//
//        } else if (temp.equals("Others")) {
////            DefaultListModel listModel = (DefaultListModel) DaftarPengiriman.getModel();
////            listModel.removeAllElements();
////            DaftarPengiriman.setModel(listModel);
//            this.kategoriOthers = true;
//            this.kategoriBnF = false;
//            this.kategoriHnC = false;
//            this.kategoriElectronic = false;
//            this.kategoriSports = false;
//            this.kategoriFnB = false;
//            generateElementv2();
//        } else if (temp.equals("Beauty and Fashion")) {
////            DefaultListModel listModel = (DefaultListModel) DaftarPengiriman.getModel();
////            listModel.removeAllElements();
////            DaftarPengiriman.setModel(listModel);
//            this.kategoriOthers = false;
//            this.kategoriBnF = true;
//            this.kategoriHnC = false;
//            this.kategoriElectronic = false;
//            this.kategoriSports = false;
//            this.kategoriFnB = false;
//            generateElementv2();
//        } else if (temp.equals("Hobby and Collections")) {
////            DefaultListModel listModel = (DefaultListModel) DaftarPengiriman.getModel();
////            listModel.removeAllElements();
////            DaftarPengiriman.setModel(listModel);
//            this.kategoriHnC = true;
//            this.kategoriOthers = false;
//            this.kategoriBnF = false;
//            this.kategoriElectronic = false;
//            this.kategoriSports = false;
//            this.kategoriFnB = false;
//            generateElementv2();
//        } else if (temp.equals("Electronic")) {
////            DefaultListModel listModel = (DefaultListModel) DaftarPengiriman.getModel();
////            listModel.removeAllElements();
////            DaftarPengiriman.setModel(listModel);
//            this.kategoriElectronic = true;
//            this.kategoriHnC = false;
//            this.kategoriOthers = false;
//            this.kategoriBnF = false;
//            this.kategoriSports = false;
//            this.kategoriFnB = false;
//            generateElementv2();
//        } else if (temp.equals("Sports")) {
////            DefaultListModel listModel = (DefaultListModel) DaftarPengiriman.getModel();
////            listModel.removeAllElements();
////            DaftarPengiriman.setModel(listModel);
//            this.kategoriSports = true;
//            this.kategoriElectronic = false;
//            this.kategoriHnC = false;
//            this.kategoriOthers = false;
//            this.kategoriBnF = false;
//            this.kategoriFnB = false;
//            generateElementv2();
//        }
    }//GEN-LAST:event_filterKategoriMouseClicked

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
            java.util.logging.Logger.getLogger(ListPengiriman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListPengiriman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListPengiriman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListPengiriman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListPengiriman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel BGKeterangan;
    private javax.swing.JList<String> DaftarPengiriman;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel LabelAsal;
    private javax.swing.JLabel LabelBerat;
    private javax.swing.JLabel LabelTujuan;
    private javax.swing.JLabel ReceiverField;
    private javax.swing.JLabel SenderField;
    private javax.swing.JComboBox<String> filterKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea ketBarang;
    // End of variables declaration//GEN-END:variables
}
