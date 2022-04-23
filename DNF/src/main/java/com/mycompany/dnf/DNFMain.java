/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.dnf;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

/**
 *
 * @author Dionisius, Felicia, Felix, Frans
 */
public class DNFMain {

    public static void main(String[] args) {
       int p,l;
       p = 2532;
       l = 1170;
       String title = "DNF";
       String iconImageName = "";
       JFrame loginFrame = new JFrame();
       ImageIcon iconImg = new ImageIcon("smilink.png"); //tolong bikin logo trus diganti.
       
       loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       loginFrame.setSize(p,l);
       loginFrame.setTitle(title);
       loginFrame.setIconImage(iconImg.getImage());
       loginFrame.setVisible(true);
       
        System.out.println("HAII");
       
    }
    
}
