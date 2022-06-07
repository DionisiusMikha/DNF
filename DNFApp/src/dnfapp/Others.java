/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dnfapp;

/**
 *
 * @author Felicia Pangestu
 */
public class Others extends Package {

    private String keterangan;
//    private boolean danger;

    public Others(String keterangan, String resi, String sender, String receiver, String from, String destination, int weight, boolean fragile, boolean flammable, boolean keepdry, boolean protectfromheat, boolean extraprotection) {
        super(resi, sender, receiver, from, destination, weight, fragile, flammable, keepdry, protectfromheat, extraprotection);
        this.keterangan = keterangan;
    }

    public String getKeterangan() {
        return keterangan;
    }

}
