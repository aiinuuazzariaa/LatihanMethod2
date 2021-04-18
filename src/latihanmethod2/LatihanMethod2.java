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
public class LatihanMethod2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Method2 ye = new Method2();
        ye.wortel();
        ye.setNama("Jeruk");
        ye.setWarna("Oranye");
        ye.setVitamin("Vitamin A");
        String nama = ye.getNama();
        String warna = ye.getWarna();
        String vitamin = ye.getVitamin();
        System.out.println("Buah ini bernama "+nama+", Jeruk berwarna "+warna+", Jeruk mengandung "+vitamin);
        ye.pisang();
    }
    
}
