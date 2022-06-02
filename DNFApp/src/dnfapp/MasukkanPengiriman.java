/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dnfapp;

import java.awt.Color;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.DefaultListModel;

/**
 *
 * @author Lenovo
 */
public class MasukkanPengiriman extends javax.swing.JFrame {

    /**
     * Creates new form MasukkanPengiriman
     */
    private HashMap<String, User> userlist = new HashMap<String, User>();
    private HashMap<String, Package> DeliveryList = new HashMap<String, Package>();
    private HashMap<String, String> usedEmail = new HashMap<String, String>();
    private HashMap<String, Kurir> ListKurir = new HashMap<String, Kurir>();
    private ArrayList<String> kategori = new ArrayList<>();
    private boolean flammable;
    private boolean fragile;
    private boolean keepdry;
    private boolean protectfromheat;
    private boolean extraprotect;

    public MasukkanPengiriman() {
        initComponents();
        this.kategori.add("Food and Beverages");
        this.kategori.add("Beauty and Fashion");
        this.kategori.add("Hobby and Collections");
        this.kategori.add("Electronic");
        this.kategori.add("Sports");
        this.kategori.add("Others");
        boolean flammable = false;
        boolean fragile = false;
        boolean keepdry = false;
        boolean protectfromheat = false;
        boolean extraprotect = false;
        for (int i = 0; i < kategori.size(); i++) {
            kategoriBarang.addItem(kategori.get(i));
        }
    }

    public MasukkanPengiriman(HashMap<String, User> userlist, HashMap<String, Package> DeliveryList, HashMap<String, String> usedEmail, HashMap<String, Kurir> ListKurir) {
        initComponents();
        this.userlist = userlist;
        this.usedEmail = usedEmail;
        this.DeliveryList = DeliveryList;
        this.ListKurir = ListKurir;
        this.kategori.add("Food and Beverages");
        this.kategori.add("Beauty and Fashion");
        this.kategori.add("Hobby and Collections");
        this.kategori.add("Electronic");
        this.kategori.add("Sports");
        this.kategori.add("Others");
        boolean flammable = false;
        boolean fragile = false;
        boolean keepdry = false;
        boolean protectfromheat = false;
        boolean extraprotect = false;
        for (int i = 0; i < kategori.size(); i++) {
            kategoriBarang.addItem(kategori.get(i));
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

        jPanel1 = new javax.swing.JPanel();
        inputNamaPenerima = new javax.swing.JTextField();
        inputDaerahTujuan = new javax.swing.JTextField();
        inputBeratBarang = new javax.swing.JTextField();
        keluarButton = new javax.swing.JButton();
        kategoriBarang = new javax.swing.JComboBox<>();
        flammableButton = new javax.swing.JButton();
        fragileButton = new javax.swing.JButton();
        keepdryButton = new javax.swing.JButton();
        protectfromheatButton = new javax.swing.JButton();
        extraProtectButton = new javax.swing.JButton();
        inputButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputNamaPenerima.setBackground(new java.awt.Color(62, 97, 155));
        inputNamaPenerima.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        inputNamaPenerima.setText("Masukan nama");
        inputNamaPenerima.setBorder(null);
        inputNamaPenerima.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputNamaPenerimaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputNamaPenerimaFocusLost(evt);
            }
        });
        inputNamaPenerima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaPenerimaActionPerformed(evt);
            }
        });
        jPanel1.add(inputNamaPenerima, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 390, 30));

        inputDaerahTujuan.setBackground(new java.awt.Color(62, 97, 155));
        inputDaerahTujuan.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        inputDaerahTujuan.setText("Masukan daerah tujuan");
        inputDaerahTujuan.setBorder(null);
        inputDaerahTujuan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputDaerahTujuanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputDaerahTujuanFocusLost(evt);
            }
        });
        inputDaerahTujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDaerahTujuanActionPerformed(evt);
            }
        });
        jPanel1.add(inputDaerahTujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 390, 30));

        inputBeratBarang.setBackground(new java.awt.Color(62, 97, 155));
        inputBeratBarang.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        inputBeratBarang.setText("Masukan berat barang");
        inputBeratBarang.setBorder(null);
        inputBeratBarang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputBeratBarangFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputBeratBarangFocusLost(evt);
            }
        });
        inputBeratBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBeratBarangActionPerformed(evt);
            }
        });
        jPanel1.add(inputBeratBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 380, 30));

        keluarButton.setBackground(new java.awt.Color(4, 37, 107));
        keluarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon_5_minisize.png"))); // NOI18N
        keluarButton.setBorder(null);
        keluarButton.setContentAreaFilled(false);
        keluarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(keluarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, -1, -1));

        kategoriBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoriBarangActionPerformed(evt);
            }
        });
        jPanel1.add(kategoriBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        flammableButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_Flammable.png"))); // NOI18N
        flammableButton.setBorderPainted(false);
        flammableButton.setContentAreaFilled(false);
        flammableButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flammableButtonMouseClicked(evt);
            }
        });
        flammableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flammableButtonActionPerformed(evt);
            }
        });
        jPanel1.add(flammableButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, -1));

        fragileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_Fragile.png"))); // NOI18N
        fragileButton.setBorderPainted(false);
        fragileButton.setContentAreaFilled(false);
        fragileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fragileButtonMouseClicked(evt);
            }
        });
        jPanel1.add(fragileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        keepdryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_Keep_Dry.png"))); // NOI18N
        keepdryButton.setBorderPainted(false);
        keepdryButton.setContentAreaFilled(false);
        keepdryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keepdryButtonMouseClicked(evt);
            }
        });
        keepdryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keepdryButtonActionPerformed(evt);
            }
        });
        jPanel1.add(keepdryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, -1));

        protectfromheatButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_Protect.png"))); // NOI18N
        protectfromheatButton.setBorderPainted(false);
        protectfromheatButton.setContentAreaFilled(false);
        protectfromheatButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                protectfromheatButtonMouseClicked(evt);
            }
        });
        protectfromheatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                protectfromheatButtonActionPerformed(evt);
            }
        });
        jPanel1.add(protectfromheatButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, -1, -1));

        extraProtectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Box-alt_no.png"))); // NOI18N
        extraProtectButton.setBorderPainted(false);
        extraProtectButton.setContentAreaFilled(false);
        extraProtectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                extraProtectButtonMouseClicked(evt);
            }
        });
        extraProtectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraProtectButtonActionPerformed(evt);
            }
        });
        jPanel1.add(extraProtectButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, -1, -1));

        inputButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_4.png"))); // NOI18N
        inputButton.setBorderPainted(false);
        inputButton.setContentAreaFilled(false);
        inputButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputButtonMouseClicked(evt);
            }
        });
        inputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputButtonActionPerformed(evt);
            }
        });
        jPanel1.add(inputButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 480, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Masukan_Pengiriman.png"))); // NOI18N
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

    private void inputBeratBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBeratBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBeratBarangActionPerformed

    private void inputNamaPenerimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaPenerimaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_inputNamaPenerimaActionPerformed

    private void inputDaerahTujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDaerahTujuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDaerahTujuanActionPerformed

    private void inputNamaPenerimaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNamaPenerimaFocusGained
        // TODO add your handling code here:
        if (inputNamaPenerima.getText().equals("Masukan nama")) {
            inputNamaPenerima.setText("");
            inputNamaPenerima.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_inputNamaPenerimaFocusGained

    private void inputNamaPenerimaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNamaPenerimaFocusLost
        // TODO add your handling code here:
        if (inputNamaPenerima.getText().equals("")) {
            inputNamaPenerima.setText("Masukan nama");
            inputNamaPenerima.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_inputNamaPenerimaFocusLost

    private void inputDaerahTujuanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputDaerahTujuanFocusGained
        // TODO add your handling code here:
        if (inputDaerahTujuan.getText().equals("Masukan daerah tujuan")) {
            inputDaerahTujuan.setText("");
            inputDaerahTujuan.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_inputDaerahTujuanFocusGained

    private void inputDaerahTujuanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputDaerahTujuanFocusLost
        // TODO add your handling code here:
        if (inputDaerahTujuan.getText().equals("")) {
            inputDaerahTujuan.setText("Masukan daerah tujuan");
            inputDaerahTujuan.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_inputDaerahTujuanFocusLost

    private void inputBeratBarangFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputBeratBarangFocusGained
        // TODO add your handling code here:
        if (inputBeratBarang.getText().equals("Masukan berat barang")) {
            inputBeratBarang.setText("");
            inputBeratBarang.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_inputBeratBarangFocusGained

    private void inputBeratBarangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputBeratBarangFocusLost
        // TODO add your handling code here:
        if (inputBeratBarang.getText().equals("")) {
            inputBeratBarang.setText("Masukan berat barang");
            inputBeratBarang.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_inputBeratBarangFocusLost

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

    private void protectfromheatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_protectfromheatButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_protectfromheatButtonActionPerformed

    private void keepdryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keepdryButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keepdryButtonActionPerformed

    private void flammableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flammableButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flammableButtonActionPerformed

    private void flammableButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flammableButtonMouseClicked
        if (this.flammable == true) {
            this.flammable = false;
            this.flammableButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_Flammable.png")));
        } else {
            this.flammable = true;
            this.flammableButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_Flammable_Click.png")));
        }
    }//GEN-LAST:event_flammableButtonMouseClicked

    private void fragileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fragileButtonMouseClicked
        // TODO add your handling code here:
        if (this.fragile == true) {
            this.fragile = false;
            this.fragileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_Fragile.png")));
        } else {
            this.fragile = true;
            this.fragileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_Fragile_Click.png")));
        }
    }//GEN-LAST:event_fragileButtonMouseClicked

    private void keepdryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keepdryButtonMouseClicked
        // TODO add your handling code here:
        if (this.keepdry == true) {
            this.keepdry = false;
            this.keepdryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_Keep_Dry.png")));
        } else {
            this.keepdry = true;
            this.keepdryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_Keep_Dry_Click.png")));
        }
    }//GEN-LAST:event_keepdryButtonMouseClicked

    private void protectfromheatButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_protectfromheatButtonMouseClicked
        // TODO add your handling code here:
        if (this.protectfromheat == true) {
            this.protectfromheat = false;
            this.protectfromheatButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_Protect.png")));
        } else {
            this.protectfromheat = true;
            this.protectfromheatButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_Protect_Click.png")));
        }
    }//GEN-LAST:event_protectfromheatButtonMouseClicked

    private void extraProtectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraProtectButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_extraProtectButtonActionPerformed

    private void extraProtectButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extraProtectButtonMouseClicked
        // TODO add your handling code here:
        if (this.extraprotect == true) {
            this.extraprotect = false;
            this.extraProtectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Box-alt_no.png")));
        } else {
            this.extraprotect = true;
            this.extraProtectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Box-alt_yes.png")));
        }
    }//GEN-LAST:event_extraProtectButtonMouseClicked

    private void inputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputButtonActionPerformed
        LocalDateTime date = LocalDateTime.now();
        String temp = (String)kategoriBarang.getSelectedItem();
        String namaPenerima = inputNamaPenerima.getText();
        String daerahPenerima = inputDaerahTujuan.getText();
        String tempBeratBarang = inputBeratBarang.getText();
        int beratBarang = Integer.parseInt(tempBeratBarang);
        String resi = "DF";
        int bulan = (int) date.getMonthValue();
        int tanggal = (int) date.getDayOfMonth();
        int tahun = (int) date.getYear();
        int jam = (int) date.getHour();
        int menit = (int) date.getMinute();
        String month = String.valueOf(bulan);
        String det = String.valueOf(tanggal);
        String year = String.valueOf(tahun);
        String timea = String.valueOf(jam);
        String timeb = String.valueOf(menit);
        resi += timea + timeb + det + month + year;
        System.out.println(resi);
        
        if(temp.equals("Food and Beverages")){
            DeliveryList.put(resi, new FnB())
        } else if(temp.equals("Sports")){
            
        } else if(temp.equals("Electronic")){
            
        } else if(temp.equals("Beauty and Fashion")){
            
        } else if(temp.equals("Hobby and Collections")){
            
        } else {
            
        }
    }//GEN-LAST:event_inputButtonActionPerformed

    private void inputButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_inputButtonMouseClicked

    private void kategoriBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoriBarangActionPerformed
        String temp = (String)kategoriBarang.getSelectedItem();
        if(temp.equals("Food and Beverages") || temp.equals("Sports") || temp.equals("Hobby and Collections")){
            flammableButton.setVisible(false);
            fragileButton.setVisible(true);
            keepdryButton.setVisible(true);
            protectfromheatButton.setVisible(true);
        } else {
            flammableButton.setVisible(true);
            fragileButton.setVisible(true);
            keepdryButton.setVisible(true);
            protectfromheatButton.setVisible(true);
        }
    }//GEN-LAST:event_kategoriBarangActionPerformed

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
            java.util.logging.Logger.getLogger(MasukkanPengiriman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasukkanPengiriman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasukkanPengiriman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasukkanPengiriman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasukkanPengiriman().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton extraProtectButton;
    private javax.swing.JButton flammableButton;
    private javax.swing.JButton fragileButton;
    private javax.swing.JTextField inputBeratBarang;
    private javax.swing.JButton inputButton;
    private javax.swing.JTextField inputDaerahTujuan;
    private javax.swing.JTextField inputNamaPenerima;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> kategoriBarang;
    private javax.swing.JButton keepdryButton;
    private javax.swing.JButton keluarButton;
    private javax.swing.JButton protectfromheatButton;
    // End of variables declaration//GEN-END:variables
}
