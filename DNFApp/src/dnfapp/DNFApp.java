/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dnfapp;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Frans
 */
public class DNFApp {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
//        HashMap<String, User> userlist = new HashMap<String, User>();
//        HashMap<String, String> usedEmail = new HashMap<String, String>();
//        HashMap<String, Package> DeliveryList = new HashMap<String, Package>();
//        HashMap<String, Kurir> ListKurir = new HashMap<String, Kurir>();
//        
//        try {
//            FileInputStream fileIn = new FileInputStream(System.getProperty("user.dir") + "\\kurir.ser");
//            ObjectInputStream objIn = new ObjectInputStream(fileIn);            
//            ListKurir = (HashMap<String, Kurir>)objIn.readObject();            
//            fileIn.close();
//            objIn.close();   
//        } catch (Exception e) {
//            System.out.println("error : belum ada kurir");
//        }
        
        LoginMenu LM = new LoginMenu(true);
        LM.setVisible(true);
        LM.pack();
        LM.setLocationRelativeTo(null);
        LM.setResizable(false);
        LM.setDefaultCloseOperation(LoginMenu.EXIT_ON_CLOSE);
    }
    
}
