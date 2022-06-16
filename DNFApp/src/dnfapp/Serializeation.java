/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dnfapp;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Frans
 */
public interface Serializeation{
    
    static void saveUser(HashMap<String, User> target){
        ArrayList<User> listuser = new ArrayList<>();
        for (Map.Entry<String, User> set : target.entrySet()) {
            if(!set.getKey().equals("admin")||!set.getKey().equals("a")){
                listuser.add(set.getValue());
            }
        }
        try {            
            FileOutputStream save = new FileOutputStream("userlist.ser");
            ObjectOutputStream out = new ObjectOutputStream(save);
            out.writeObject(listuser);
            out.close();
            save.close();
        }catch (Exception ex) {
            System.out.println("Save Failed");
        }
    }
    
    static void savePackage(HashMap<String, Package> target){
        ArrayList<Package> listpaket = new ArrayList<>();
        for (Map.Entry<String, Package> set : target.entrySet()) {
            if(!set.getKey().equals("a")){
                listpaket.add(set.getValue());
            }
        }
        try {            
            FileOutputStream save = new FileOutputStream("packagelist.ser");
            ObjectOutputStream out = new ObjectOutputStream(save);
            out.writeObject(listpaket);
            out.close();
            save.close();
        }catch (Exception ex) {
            System.out.println("Save Failed");
        }
    }
    
    static void saveKurir(HashMap<String, Kurir> target){
        ArrayList<Kurir> listkurir = new ArrayList<>();
        for (Map.Entry<String, Kurir> set : target.entrySet()) {
            listkurir.add(set.getValue());
        }
        try {            
            FileOutputStream save = new FileOutputStream("kurirlist.ser");
            ObjectOutputStream out = new ObjectOutputStream(save);
            out.writeObject(listkurir);
            out.close();
            save.close();
        }catch (Exception ex) {
            System.out.println("Save Failed");
        }
    }
    
    static HashMap<String, User> loadUser(){
        ArrayList<User> userCont = new ArrayList<>();
        HashMap<String, User> map = new HashMap<>();
        try {
            FileInputStream load = new FileInputStream("userlist.ser");
            ObjectInputStream in = new ObjectInputStream(load);
            userCont = (ArrayList<User>) in.readObject();
            in.close();
            load.close();
        } catch (Exception ex) {
             System.out.println(ex.getMessage());
        }
        for(int i =0;i<userCont.size();i++){
            map.put(userCont.get(i).getUsername(), userCont.get(i));
        }
        return map;
    }
    
    static HashMap<String, Kurir> loadKurir(){
        ArrayList<Kurir> kurirCont = new ArrayList<>();
        HashMap<String, Kurir> map = new HashMap<>();
        try {
            FileInputStream load = new FileInputStream("kurirlist.ser");
            ObjectInputStream in = new ObjectInputStream(load);
            kurirCont = (ArrayList<Kurir>) in.readObject();
            in.close();
            load.close();
        } catch (Exception ex) {
             System.out.println(ex.getMessage());
        }
        for(int i =0;i<kurirCont.size();i++){
            map.put(kurirCont.get(i).getUsername(), kurirCont.get(i));
        }
        return map;
    }
    
    static HashMap<String, String> loadEmail(){
        HashMap<String, String> map = new HashMap<>();
        ArrayList<User> userCont = new ArrayList<>();
        try {
            FileInputStream load = new FileInputStream("userlist.ser");
            ObjectInputStream in = new ObjectInputStream(load);
            userCont = (ArrayList<User>) in.readObject();
            in.close();
            load.close();
        } catch (Exception ex) {
             System.out.println(ex.getMessage());
        }
        for(int i =0;i<userCont.size();i++){
            map.put(userCont.get(i).getEmail(), userCont.get(i).getEmail());
        }
        return map;
    }
    
    static HashMap<String, Package> loadPackage(){
        HashMap<String, Package> map = new HashMap<>();
        ArrayList<Package> packageCont = new ArrayList<>();
        try {
            FileInputStream load = new FileInputStream("packagelist.ser");
            ObjectInputStream in = new ObjectInputStream(load);
            packageCont = (ArrayList<Package>) in.readObject();
            in.close();
            load.close();
        } catch (Exception ex) {
             System.out.println(ex.getMessage());
        }
        for(int i =0;i<packageCont.size();i++){
            map.put(packageCont.get(i).getResi(), packageCont.get(i));
        }
        return map;
    }
    
}
