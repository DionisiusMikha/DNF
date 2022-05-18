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
public class Package {
    private String resi;
    private String contains;
    private String sender;
    private String receiver;
    private String from;
    private String destination;
    private ArrayList<String> track = new ArrayList<String>();
    private boolean Delivered;

    public Package(String resi, String contains, String sender, String receiver, String from, String destination, boolean Delivered) {
        this.resi = resi;
        this.contains = contains;
        this.sender = sender;
        this.receiver = receiver;
        this.from = from;
        this.destination = destination;
        this.Delivered = Delivered;
    }
    
    public void updateTrack(String s){
        track.add(s);
    }
    
}
