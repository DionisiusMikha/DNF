/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dnfapp;
import java.util.ArrayList;

/**
 *
 * @author Frans
 */
public class Kurir extends Account{
    
    private String Nama;
    
    //    private boolean status;
    private boolean isDelivering;
    private ArrayList<Package> deliveredPackages = new ArrayList<Package>();

    public Kurir(String Nama, String username, String password) {
        super(username, password);
        this.Nama = Nama;
        this.isDelivering = false;
    }

    public boolean isIsDelivering() {
        return isDelivering;
    }

    public void setIsDelivering(boolean isDelivering) {
        this.isDelivering = isDelivering;
    }

    public ArrayList<Package> getDeliveredPackages() {
        return deliveredPackages;
    }

    public void setDeliveredPackages(ArrayList<Package> deliveredPackages) {
        this.deliveredPackages = deliveredPackages;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
}
