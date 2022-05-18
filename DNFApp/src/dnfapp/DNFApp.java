/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dnfapp;

/**
 *
 * @author Frans
 */
public class DNFApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginMenu LM = new LoginMenu(true);
        LM.setVisible(true);
        LM.pack();
        LM.setLocationRelativeTo(null);
        LM.setResizable(false);
        LM.setDefaultCloseOperation(LoginMenu.EXIT_ON_CLOSE);
    }
    
}
