/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dnfapp;

/**
 *
 * @author Felicia Pangestu
 */
//HOBBY AND COLLECTIONS
public class HnC extends Package{
    private boolean extraPack; //mau tambah pelindung apa ga
    private boolean danger; //yang ada batere ne

    public boolean isExtraPack() {
        return extraPack;
    }

    public void setExtraPack(boolean extraPack) {
        this.extraPack = extraPack;
    }

    public boolean isDanger() {
        return danger;
    }

    public void setDanger(boolean danger) {
        this.danger = danger;
    }

    public HnC(boolean extraPack, boolean danger, String resi, String sender, String receiver, String from, String destination, int weight, boolean delivered, boolean fragile) {
        super(resi, sender, receiver, from, destination, weight, delivered, fragile);
        this.extraPack = extraPack;
        this.danger = danger;
    }

    
    
}
