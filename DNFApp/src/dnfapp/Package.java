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
public abstract class Package {
    private String resi;
    private String sender;
    private String receiver;
    private String from;
    private String destination;
    private int weight;
    private ArrayList<String> track = new ArrayList<String>();
    private boolean delivered; //false = belum kekirim, true = kekirim
    private boolean fragile; //tahan banting atau ga
    private boolean flammable; 
    private boolean keepdry; 
    private boolean protectfromheat; 
    //false = bukan barang pecah belah - true = iya

    public Package(String resi, String sender, String receiver, String from, String destination, int weight, boolean fragile, boolean flammable, boolean keepdry, boolean protectfromheat) {
        this.resi = resi;
        this.sender = sender;
        this.receiver = receiver;
        this.from = from;
        this.destination = destination;
        this.weight = weight;
        this.delivered = false;
        this.fragile = fragile;
        this.flammable = flammable;
        this.keepdry = keepdry;
        this.protectfromheat = protectfromheat;
        this.track = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Paket telah diserahakan oleh " + sender + " dari " + from;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setResi(String resi) {
        this.resi = resi;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTrack(ArrayList<String> track) {
        this.track = track;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }
    
    public void updateTrack(String s){
        track.add(s);
    }
    
    public void changeResi (String resi){
        this.resi=resi;
    }

    public String getResi() {
        return resi;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getFrom() {
        return from;
    }

    public String getDestination() {
        return destination;
    }

    public ArrayList<String> getTrack() {
        return track;
    }

    public boolean isDelivered() {
        return delivered;
    }
    
    
    
}
