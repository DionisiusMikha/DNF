/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dnfapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Frans
 */
public interface GenerateCity {
    
    HashMap<String, Kota> MapKota = new HashMap<>();
    
    static HashMap<String, Kota>generateCityMap(HashMap<String, Kota> MapKota){
        Kota Agam = new Kota(100.1703,0.2209);
        Kota Alor = new Kota(124.5528,8.2928);
        Kota Ambon = new Kota(128.1689,-3.6387);
        Kota Asahan = new Kota(99.6341,2.8175);
        Kota Asmat = new Kota(138.3988,5.0574);
        Kota Balikpapan = new Kota(116.8312,-1.265386);
        Kota BandaAceh = new Kota(95.323753,5.54829);
        Kota BandarLampung = new Kota(105.26667,-5.45);
        Kota Bandung = new Kota(107.60981,-6.914744);
        Kota Banjar = new Kota(108.558189,-7.374585);
        Kota Banjarbaru = new Kota(114.810318,-3.457242);
        Kota Banjarmasin = new Kota(114.590111,-3.316694);
        Kota Batam = new Kota(104.030457,1.082828);
        Kota Batu = new Kota(112.523903,-7.8671);
        Kota Bekasi = new Kota(106.992416,-6.241586);
        Kota Bengkulu = new Kota(102.266579,-3.788892);
        Kota Binjai = new Kota(98.489166,3.598401);
        Kota Bitung = new Kota(125.121652,1.440374);
        Kota Blitar = new Kota(112.150002,-8.1);
        Kota Bogor = new Kota(106.816635,-6.595038);
        Kota Bukittinggi = new Kota(100.383479,-0.303918);
        Kota Calang = new Kota(95.5818,4.6338);
        Kota Cepu = new Kota(111.5634,7.1605);
        Kota Ciamis = new Kota(108.3323,7.3299);
        Kota Cianjur = new Kota(107.1425,6.8168);
        Kota Ciawi = new Kota(106.8518,6.656);
        Kota Cibubur = new Kota(106.8759,-6.3735);
        Kota Cilegon = new Kota(106.01112,-6.002534);
        Kota Cileungsi = new Kota(106.9705,6.423);
        Kota Cimahi = new Kota(107.533867,-6.899541);
        Kota Cirebon = new Kota(108.550659,-6.737246);
        Kota Dairi = new Kota(98.2651,2.8676);
        Kota Darmasraya = new Kota(101.6158,1.1121);
        Kota Deliserdang = new Kota(98.7041,3.4202);
        Kota Demak = new Kota(110.6378,6.8922);
        Kota Denpasar = new Kota(115.216667,-8.65);
        Kota Depok = new Kota(106.830711,-6.385589);
        Kota Dogiyai = new Kota(135.4394,-4.0318);
        Kota Dompu = new Kota(118.3462,8.5364);
        Kota Donggala = new Kota(123.0437,0.527);
        Kota Dumai = new Kota(101.4002,1.6666);
        Kota Ende = new Kota(121.6542,8.8541);
        Kota Enkerang = new Kota(119.7727,3.5638);
        Kota Fakfak = new Kota(134.5,-3.9999);
        Kota FloresTimur = new Kota(122.9663,8.3131);
        Kota Garut = new Kota(107.9087,7.2279);
        Kota GayoLues = new Kota(97.3517,3.9552);
        Kota Gianyar = new Kota(115.2601,8.4248);
        Kota Gorontalo = new Kota(123.058548,0.556174);
        Kota Gowa = new Kota(119.6666,-5.16667);
        Kota Gresik = new Kota(112.652,7.1652);
        Kota Grobokan = new Kota(110.9507,7.1542);
        Kota GunungKidul = new Kota(110.6169,8.0305);
        Kota GunungMas = new Kota(105.2685,5.442);
        Kota GunungSitoli = new Kota(97.6147,1.2805);
        Kota HalmaheraTengah = new Kota(128,5.6843);
        Kota HuluSungaiSelatan = new Kota(115.2363,2.7663);
        Kota HumbangHasundutan = new Kota(98.5721,2.1989);
        Kota Indragiri = new Kota(102.2548,0.7361);
        Kota Indramayu = new Kota(108.3287,6.3489);
        Kota Jailolo = new Kota(127.468,1.0618);
        Kota JakartaBarat = new Kota(106.826927,-6.15076);
        Kota JakartaPusat = new Kota(106.829361,-6.17311);
        Kota JakartaSelatan = new Kota(106.814095,-6.300641);
        Kota JakartaTimur = new Kota(106.882744,-6.230702);
        Kota JakartaUtara = new Kota(106.774124,-6.121435);
        Kota Jambi = new Kota(103.6131,1.6101);
        Kota Jayapura = new Kota(140.669,2.5916);
        Kota Jember = new Kota(113.7009,8.1733);
        Kota Jepara = new Kota(110.679,6.5805);
        Kota Jombang = new Kota(112.2861,7.5741);
        Kota Karo = new Kota(98.5093,2.9397);
        Kota Kediri = new Kota(112.011864,7.82284);
        Kota Kuningan = new Kota(108.5701,7.0138);
        Kota Kupang = new Kota(123.607033,-10.1772);
        Kota Langsa = new Kota(97.967392,4.47028);
        Kota Lhokseumawe = new Kota(97.141319,5.181164);
        Kota Lubuklinggau = new Kota(102.866562,-3.29221);
        Kota Madiun = new Kota(111.530014,-7.631059);
        Kota Magelang = new Kota(110.217697,-7.479734);
        Kota Makassar = new Kota(119.432732,-5.147665);
        Kota Malang  = new Kota(112.632629,-7.96662);
        Kota Manado = new Kota(124.842079,1.47483);
        Kota Manokwari = new Kota(134.062,0.8615);
        Kota Mataram = new Kota(116.100487,-5.147665);
        Kota Medan = new Kota(98.672226,3.595196);
        Kota Metro = new Kota(105.30444,-5.12165);
        Kota Mojokerto = new Kota(112.440132,-7.470475);
        Kota Nabire = new Kota(135.5016,3.3722);
        Kota Nduga = new Kota(108.5596,-6.711);
        Kota Nias = new Kota(97.5247,1.1255);
        Kota Padang = new Kota(100.417183,-0.947083);
        Kota PadangPanjang = new Kota(100.400398,-0.46252);
        Kota PadangSidempuan = new Kota(99.273438,1.37751);
        Kota PagarAlam = new Kota(103.269829,-4.0342);
        Kota PalangkaRaya = new Kota(119.432732,-2.216105);
        Kota Palembang = new Kota(104.759865,-2.990077);
        Kota Palopo = new Kota(120.182663,-3.00108);
        Kota Palu = new Kota(119.904655,-0.86791);
        Kota Pangkalpinang = new Kota(106.124649,-2.22487);
        Kota Parepare = new Kota(119.622437,-4.0106);
        Kota Pariaman = new Kota(100.12014,-0.62477);
        Kota Pasuruan = new Kota(112.899925,-7.646919);
        Kota Payakumbuh = new Kota(100.634132,-0.22566);
        Kota Pekalongan = new Kota(109.674591,-6.889836);
        Kota Pekanbaru = new Kota(101.447777,0.507068);
        Kota Pematangsiantar = new Kota(99.068169,2.970042);
        Kota Pontianak = new Kota(109.342506,-0.02633);
        Kota Prabumulih = new Kota(104.255089,-3.42516);
        Kota Probolinggo = new Kota(113.203712,-7.776423);
        Kota Raha = new Kota(122.7211,4.8324);
        Kota Ransiki = new Kota(134.1688,1.5059);
        Kota Rengat = new Kota(102.5423,-0.3867);
        Kota Ruteng = new Kota(95.318527,5.89393);
        Kota Sabang = new Kota(95.318527,5.89393);
        Kota Salatiga = new Kota(110.508438,-7.330523);
        Kota Tangerang = new Kota(106.6403,6.1702);
        Kota TanjungPinang = new Kota(104.4665,0.9186);
        Kota Tarakan = new Kota(117.5785,3.3274);
        Kota Tasikmalaya = new Kota(108.2172,7.3506);
        Kota Tegal = new Kota(109.1256,6.8797);
        Kota Ternate = new Kota(127.3614,0.7958);
        Kota Tulungagung = new Kota(111.9642,8.0912);
        Kota Wakatobi = new Kota(123.5841,-5.3145);
        Kota Waropen = new Kota(136.6705,2.8436);
        Kota Wonogiri = new Kota(111.046,7.8846);
        Kota Wonosobo = new Kota(109.8984,7.3685);
        Kota Yogyakarta = new Kota(110.3695,7.7956);
        
        MapKota.put("Agam", Agam);
        MapKota.put("Alor", Alor);
        MapKota.put("Ambon", Ambon);
        MapKota.put("Asahan", Asahan);
        MapKota.put("Asmat", Asmat);
        MapKota.put("Balikpapan", Balikpapan);
        MapKota.put("Banda Aceh", BandaAceh);
        MapKota.put("Bandar Lampung", BandarLampung);
        MapKota.put("Bandung", Bandung);
        MapKota.put("Banjar", Banjar);
        MapKota.put("Banjarbaru", Banjarbaru);
        MapKota.put("Banjarmasin", Banjarmasin);
        MapKota.put("Batam", Batam);
        MapKota.put("Batu", Batu);
        MapKota.put("Bekasi", Bekasi);
        MapKota.put("Bengkulu", Bengkulu);
        MapKota.put("Binjai", Binjai);
        MapKota.put("Bitung", Bitung);
        MapKota.put("Blitar", Blitar);
        MapKota.put("Bogor", Bogor);
        MapKota.put("Bukittinggi", Bukittinggi);
        MapKota.put("Calang", Calang);
        MapKota.put("Cepu", Cepu);
        MapKota.put("Ciamis", Ciamis);
        MapKota.put("Cianjur", Cianjur);
        MapKota.put("Ciawi", Ciawi);
        MapKota.put("Cibubur", Cibubur);
        MapKota.put("Cilegon", Cilegon);
        MapKota.put("Cileungsi", Cileungsi);
        MapKota.put("Cimahi", Cimahi);
        MapKota.put("Cirebon", Cirebon);
        MapKota.put("Dairi", Dairi);
        MapKota.put("Darmasraya", Darmasraya);
        MapKota.put("Deliserdang", Deliserdang);
        MapKota.put("Demak", Demak);
        MapKota.put("Denpasar", Denpasar);
        MapKota.put("Depok", Depok);
        MapKota.put("Dogiyai", Dogiyai);
        MapKota.put("Dompu", Dompu);
        MapKota.put("Donggala", Donggala);
        MapKota.put("Dumai", Dumai);
        MapKota.put("Ende", Ende);
        MapKota.put("Enkerang", Enkerang);
        MapKota.put("Fakfak", Fakfak);
        MapKota.put("Flores Timur", FloresTimur);
        MapKota.put("Garut", Garut);
        MapKota.put("Gayo Lues", GayoLues);
        MapKota.put("Gianyar", Gianyar);
        MapKota.put("Gorontalo", Gorontalo);
        MapKota.put("Gowa", Gowa);
        MapKota.put("Gresik", Gresik);
        MapKota.put("Grobokan", Grobokan);
        MapKota.put("Gunung Kidul", GunungKidul);
        MapKota.put("Gunung Mas", GunungMas);
        MapKota.put("Gunung Sitoli", GunungSitoli);
        MapKota.put("Halmahera Tengah", HalmaheraTengah);
        MapKota.put("Hulu Sungai Selatan", HuluSungaiSelatan);
        MapKota.put("Humbang Hasundutan", HumbangHasundutan);
        MapKota.put("Indragiri", Indragiri);
        MapKota.put("Indramayu", Indramayu);
        MapKota.put("Jailolo", Jailolo);
        MapKota.put("Jakarta Barat", JakartaBarat);
        MapKota.put("Jakarta Pusat", JakartaPusat);
        MapKota.put("Jakarta Selatan", JakartaSelatan);
        MapKota.put("Jakarta Timur", JakartaTimur);
        MapKota.put("Jakarta Utara", JakartaUtara);
        MapKota.put("Jambi", Jambi);
        MapKota.put("Jayapura", Jayapura);
        MapKota.put("Jember", Jember);
        MapKota.put("Jepara", Jepara);
        MapKota.put("Jombang", Jombang);
        MapKota.put("Karo", Karo);
        MapKota.put("Kediri", Kediri);
        MapKota.put("Kuningan", Kuningan);
        MapKota.put("Kupang", Kupang);
        MapKota.put("Langsa", Langsa);
        MapKota.put("Lhokseumawe", Lhokseumawe);
        MapKota.put("Lubuklinggau", Lubuklinggau);
        MapKota.put("Madiun", Madiun);
        MapKota.put("Magelang", Magelang);
        MapKota.put("Makassar", Makassar);
        MapKota.put("Malang ", Malang );
        MapKota.put("Manado", Manado);
        MapKota.put("Manokwari", Manokwari);
        MapKota.put("Mataram", Mataram);
        MapKota.put("Medan", Medan);
        MapKota.put("Metro", Metro);
        MapKota.put("Mojokerto", Mojokerto);
        MapKota.put("Nabire", Nabire);
        MapKota.put("Nduga", Nduga);
        MapKota.put("Nias", Nias);
        MapKota.put("Padang", Padang);
        MapKota.put("Padang Panjang", PadangPanjang);
        MapKota.put("Padang Sidempuan", PadangSidempuan);
        MapKota.put("Pagar Alam", PagarAlam);
        MapKota.put("Palangka Raya", PalangkaRaya);
        MapKota.put("Palembang", Palembang);
        MapKota.put("Palopo", Palopo);
        MapKota.put("Palu", Palu);
        MapKota.put("Pangkalpinang", Pangkalpinang);
        MapKota.put("Parepare", Parepare);
        MapKota.put("Pariaman", Pariaman);
        MapKota.put("Pasuruan", Pasuruan);
        MapKota.put("Payakumbuh", Payakumbuh);
        MapKota.put("Pekalongan", Pekalongan);
        MapKota.put("Pekanbaru", Pekanbaru);
        MapKota.put("Pematangsiantar", Pematangsiantar);
        MapKota.put("Pontianak", Pontianak);
        MapKota.put("Prabumulih", Prabumulih);
        MapKota.put("Probolinggo", Probolinggo);
        MapKota.put("Raha", Raha);
        MapKota.put("Ransiki", Ransiki);
        MapKota.put("Rengat", Rengat);
        MapKota.put("Ruteng", Ruteng);
        MapKota.put("Sabang", Sabang);
        MapKota.put("Salatiga", Salatiga);
        MapKota.put("Tangerang", Tangerang);
        MapKota.put("Tanjung Pinang", TanjungPinang);
        MapKota.put("Tarakan", Tarakan);
        MapKota.put("Tasikmalaya", Tasikmalaya);
        MapKota.put("Tegal", Tegal);
        MapKota.put("Ternate", Ternate);
        MapKota.put("Tulungagung", Tulungagung);
        MapKota.put("Wakatobi", Wakatobi);
        MapKota.put("Waropen", Waropen);
        MapKota.put("Wonogiri", Wonogiri);
        MapKota.put("Wonosobo", Wonosobo);
        MapKota.put("Yogyakarta", Yogyakarta);
        
        return MapKota;
    }

    
    static ArrayList<String> generateCity(ArrayList<String> listkota){
        listkota.add( "Agam" );
        listkota.add( "Alor" );
        listkota.add( "Ambon" );
        listkota.add( "Asahan" );
        listkota.add( "Asmat" );
        listkota.add( "Balikpapan" );
        listkota.add( "Banda Aceh" );
        listkota.add( "Bandar Lampung" );
        listkota.add( "Bandung" );
        listkota.add( "Banjar" );
        listkota.add( "Banjarbaru" );
        listkota.add( "Banjarmasin" );
        listkota.add( "Batam" );
        listkota.add( "Batu" );
        listkota.add( "Bekasi" );
        listkota.add( "Bengkulu" );
        listkota.add( "Binjai" );
        listkota.add( "Bitung" );
        listkota.add( "Blitar" );
        listkota.add( "Bogor" );
        listkota.add( "Bukittinggi" );
        listkota.add( "Calang" );
        listkota.add( "Cepu" );
        listkota.add( "Ciamis" );
        listkota.add( "Cianjur" );
        listkota.add( "Ciawi" );
        listkota.add( "Cibubur" );
        listkota.add( "Cilegon" );
        listkota.add( "Cileungsi" );
        listkota.add( "Cimahi" );
        listkota.add( "Cirebon" );
        listkota.add( "Dairi" );
        listkota.add( "Darmasraya" );
        listkota.add( "Deliserdang" );
        listkota.add( "Demak" );
        listkota.add( "Denpasar" );
        listkota.add( "Depok" );
        listkota.add( "Dogiyai" );
        listkota.add( "Dompu" );
        listkota.add( "Donggala" );
        listkota.add( "Dumai" );
        listkota.add( "Ende" );
        listkota.add( "Enkerang" );
        listkota.add( "Fakfak" );
        listkota.add( "Flores Timur" );
        listkota.add( "Garut" );
        listkota.add( "Gayo Lues" );
        listkota.add( "Gianyar" );
        listkota.add( "Gorontalo" );
        listkota.add( "Gowa" );
        listkota.add( "Gresik" );
        listkota.add( "Grobokan" );
        listkota.add( "Gunung Kidul" );
        listkota.add( "Gunung Mas" );
        listkota.add( "Gunung Sitoli" );
        listkota.add( "Halmahera Tengah" );
        listkota.add( "Hulu Sungai Selatan" );
        listkota.add( "Humbang Hasundutan" );
        listkota.add( "Indragiri" );
        listkota.add( "Indramayu" );
        listkota.add( "Jailolo" );
        listkota.add( "Jakarta Barat" );
        listkota.add( "Jakarta Pusat" );
        listkota.add( "Jakarta Selatan" );
        listkota.add( "Jakarta Timur" );
        listkota.add( "Jakarta Utara" );
        listkota.add( "Jambi" );
        listkota.add( "Jayapura" );
        listkota.add( "Jember" );
        listkota.add( "Jepara" );
        listkota.add( "Jombang" );
        listkota.add( "Karo" );
        listkota.add( "Kediri" );
        listkota.add( "Kuningan" );
        listkota.add( "Kupang" );
        listkota.add( "Langsa" );
        listkota.add( "Lhokseumawe" );
        listkota.add( "Lubuklinggau" );
        listkota.add( "Madiun" );
        listkota.add( "Magelang" );
        listkota.add( "Makassar" );
        listkota.add( "Malang " );
        listkota.add( "Manado" );
        listkota.add( "Manokwari" );
        listkota.add( "Mataram" );
        listkota.add( "Medan" );
        listkota.add( "Metro" );
        listkota.add( "Mojokerto" );
        listkota.add( "Nabire" );
        listkota.add( "Nduga" );
        listkota.add( "Nias" );
        listkota.add( "Padang" );
        listkota.add( "Padang Panjang" );
        listkota.add( "Padang Sidempuan" );
        listkota.add( "Pagar Alam" );
        listkota.add( "Palangka Raya" );
        listkota.add( "Palembang" );
        listkota.add( "Palopo" );
        listkota.add( "Palu" );
        listkota.add( "Pangkalpinang" );
        listkota.add( "Parepare" );
        listkota.add( "Pariaman" );
        listkota.add( "Pasuruan" );
        listkota.add( "Payakumbuh" );
        listkota.add( "Pekalongan" );
        listkota.add( "Pekanbaru" );
        listkota.add( "Pematangsiantar" );
        listkota.add( "Pontianak" );
        listkota.add( "Prabumulih" );
        listkota.add( "Probolinggo" );
        listkota.add( "Raha" );
        listkota.add( "Ransiki" );
        listkota.add( "Rengat" );
        listkota.add( "Ruteng" );
        listkota.add( "Sabang" );
        listkota.add( "Salatiga" );
        listkota.add( "Tangerang" );
        listkota.add( "Tanjung Pinang" );
        listkota.add( "Tarakan" );
        listkota.add( "Tasikmalaya" );
        listkota.add( "Tegal" );
        listkota.add( "Ternate" );
        listkota.add( "Tulungagung" );
        listkota.add( "Wakatobi" );
        listkota.add( "Waropen" );
        listkota.add( "Wonogiri" );
        listkota.add( "Wonosobo" );
        listkota.add( "Yogyakarta" );
        return listkota;
    }
}
