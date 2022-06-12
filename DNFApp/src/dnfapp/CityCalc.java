/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dnfapp;

/**
 *
 * @author Frans
 */
public interface CityCalc {
    static double haversine(double lat1, double lon1, double lat2, double lon2)
    {
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
 
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
 
        double a = Math.pow(Math.sin(dLat / 2), 2) +
                   Math.pow(Math.sin(dLon / 2), 2) *
                   Math.cos(lat1) *
                   Math.cos(lat2);
        double rad = 6371;
        double c = 2 * Math.asin(Math.sqrt(a));
        return rad * c;
    }
    
    static int CalcHarga(Kota Destinasi, Kota Asal, double weight){
        double lat_1,lat_2;
        double lon_1,lon_2;
        lat_1 = Destinasi.getLat();
        lon_1 = Destinasi.getLon();
        lat_2 = Asal.getLat();
        lon_2 = Asal.getLon();
        
        double distance = haversine(lat_1,lon_1,lat_2,lon_2);
        double price = distance*weight;
        int rounded = (int)price*10;
        return rounded;
    }
}
