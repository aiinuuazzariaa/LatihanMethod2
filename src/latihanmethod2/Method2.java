/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmethod2;

/**
 *
 * @author MOKLET-2
 */
public class Method2 {
    String nama;
    String warna;
    String vitamin;
    
    public void wortel(){
        nama = "Wortel";
        warna = "Oranye";
        vitamin = "Vitamin A";
        
        System.out.println("Sayuran ini bernama "+nama+", Wortel berwarna "+warna+", Wortel mengandung "+vitamin);
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public void setVitamin(String Vitamin){
        this.vitamin = vitamin;
    }
    
    public String getVitamin(){
        return vitamin;
    }
    
    public static void pisang(){
        String nama;
        String warna;
        String vitamin;
        
        nama = "Pisang";
        warna = "Kuning";
        vitamin = "Vitamin A dan C";
        
        System.out.println("Buah ini bernama "+nama+", Pisang berwarna "+warna+", Pisang ini mengandung "+vitamin);
    }
}
