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
    
}
