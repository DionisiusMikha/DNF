/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.dnf;
import java.util.*;
/**
 *
 * @author Frans
 */
public class Main {
    
    public static void main(String[] args) {
        ArrayList<User> UserList =  new ArrayList<User>();
        LoginFrame LG = new LoginFrame();
        LG.setVisible(true);
        LG.pack();
        LG.setLocationRelativeTo(null);
        LG.setDefaultCloseOperation(LoginFrame.EXIT_ON_CLOSE);
    }
    
}
