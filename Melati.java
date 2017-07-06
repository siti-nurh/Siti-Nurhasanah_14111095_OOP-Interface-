/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author siti
 */
public class Melati {
    public void tampilMelati(){
        System.out.println("Ini kelas melati");
        Tanaman tam = new Tanaman();
        tam.setNama("Melati");
        System.out.println("Tanaman ini bernama  : "+tam.getNama());
        tam.setWarna("Merah");
        System.out.println("Tanaman ini berwarna  : "+tam.getWarna());
    }
    
}
