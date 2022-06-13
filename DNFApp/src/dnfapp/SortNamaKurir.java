/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dnfapp;

import java.util.Comparator;

/**
 *
 * @author Felicia Pangestu
 */
public class SortNamaKurir implements Comparator<Kurir>{

    @Override
    public int compare(Kurir o1, Kurir o2) {
        return o1.getNama().compareTo(o2.getNama());
    }
    
}
