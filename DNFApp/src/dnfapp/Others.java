/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dnfapp;

/**
 *
 * @author Felicia Pangestu
 */
public class Others extends Package{
    private String keterangan;
    private boolean danger;

    public Others(String keterangan, boolean danger, String resi, String sender, String receiver, String from, String destination, int weight, boolean delivered, boolean fragile) {
        super(resi, sender, receiver, from, destination, weight, delivered, fragile);
        this.keterangan = keterangan;
        this.danger = danger;
    }

}
