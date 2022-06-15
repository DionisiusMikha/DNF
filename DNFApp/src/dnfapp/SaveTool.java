/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dnfapp;

import java.util.HashMap;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Frans
 */
public class SaveTool {
    
    static void save(HashMap<String, User> userlist, HashMap<String, String> usedEmail, HashMap<String, Package> DeliveryList, HashMap<String, Kurir> ListKurir){
        ArrayList<User> listuser = new ArrayList<>();
        ArrayList<String> listemail = new ArrayList<>();
        ArrayList<Package> listDelivery = new ArrayList<>();
        ArrayList<Kurir> listKurir = new ArrayList<>();
        
        for (Map.Entry<String, User> set : userlist.entrySet()) {
            if(!set.getKey().equals("admin")||!set.getKey().equals("a")){
                listuser.add(set.getValue());
            }
        } 
    }
}
