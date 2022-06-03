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
public class FnB extends Package {

    private int exp; //dalam bulan

    public FnB(int exp, String resi, String sender, String receiver, String from, String destination, int weight, boolean fragile, boolean flammable, boolean keepdry, boolean protectfromheat, boolean extraprotection) {
        super(resi, sender, receiver, from, destination, weight, fragile, flammable, keepdry, protectfromheat, extraprotection);
        this.exp = exp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

}
