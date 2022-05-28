/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dnfapp;

/**
 *
 * @author Felicia Pangestu
 */
//FOOD AND BEVERAGES
public class FnB extends Package{
    private int exp; //dalam bulan

    public FnB(int exp, String resi, String sender, String receiver, String from, String destination, int weight, boolean delivered, boolean fragile) {
        super(resi, sender, receiver, from, destination, weight, delivered, fragile);
        this.exp = exp;
    }

    

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    
    
}
