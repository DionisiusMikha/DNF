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
public class Kurir {
    private String uname;
    private String nama;
    private String password;
    
//    private boolean status;
    private boolean isDelivering;
    private ArrayList<Package> deliveredPackages = new ArrayList<Package>();

    public Kurir(String uname, String nama, String password) {
        this.uname = uname;
        this.nama = nama;
        this.password = password;
//        this.status = true; //true = nganggur, false = gak nganggur
        this.isDelivering = false; //false = nganggur, true = lagi ada kiriman
        this.deliveredPackages = new ArrayList<Package>();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    
}
