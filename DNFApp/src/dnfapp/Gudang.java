/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dnfapp;

import java.util.ArrayList;

/**
 *
 * @author Felicia Pangestu
 */
public class Gudang<T>{
    ArrayList<T> paket; //ArrayList Person

    public Gudang() {
        this.paket = new ArrayList<>();
    }
    
    public void add(T item){
        this.paket.add(item);
    }
    
    public T get(int i){
        return this.paket.get(i);
    }
    
    public void remove(int i){
        this.paket.remove(i);
    }
    
    public int size(){
        return this.paket.size();
    }

    public ArrayList<T> getAccount() {
        return paket;
    }
    
    public void clearContent(){
        this.paket.clear();
    }
}
