/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dnfapp;

/**
 *
 * @author Felicia Pangestu
 */
public class Electronic extends Package{
    private boolean danger; //rawan mbledos apa ga
    //false = gk mbledos - true = duar

    public Electronic(boolean danger, String resi, String sender, String receiver, String from, String destination, int weight, boolean fragile, boolean flammable, boolean keepdry, boolean protectfromheat) {
        super(resi, sender, receiver, from, destination, weight, fragile, flammable, keepdry, protectfromheat);
        this.danger = danger;
    }
    
    
    public boolean isDanger() {
        return danger;
    }

    public void setDanger(boolean danger) {
        this.danger = danger;
    }
}
