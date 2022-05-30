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
    
    public static void main(String[] args) {
        LoginMenu LM = new LoginMenu(true);
        LM.setVisible(true);
        LM.pack();
        LM.setLocationRelativeTo(null);
        LM.setResizable(false);
        LM.setDefaultCloseOperation(LoginMenu.EXIT_ON_CLOSE);
    }
    
}
