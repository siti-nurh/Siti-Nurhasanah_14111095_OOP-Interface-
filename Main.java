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
public class Main {
    
    public static void main(String[] args){
        Tanaman tam = new Tanaman();
        System.out.println("Ini Kelas Tanaman");
         System.out.println("");
         
         
         
    System.out.println("Ini Kelas Bambu");
        Tanaman ta = new Tanaman();
        ta.setNama("Bambu");
        System.out.println("Tanaman ini bernama Ini = " +ta.getNama());
        ta.setWarna("Hijau");
        System.out.println("Tanaman ini berwarna = " +ta.getWarna());
       
        BambuKuning tbb =  new BambuKuning();
        
          System.out.println("ini kelas bambu kuning");
            tbb.Nama1();
            tbb.Warna1();
            tbb.jenis();
         System.out.println("");
        
         
            BambuHijau me = new BambuHijau();
          System.out.println("ini kelas bambu hijau");
            me.Nama1();
            me.Warna1();
            me.jenis();
        System.out.println("");
        
        
        
        BambuJepang mb = new BambuJepang();
          System.out.println("ini kelas bambu jepang");
            mb.Nama1();
            mb.Warna1();
            mb.jenis();
        System.out.println("");
        
        
        
        System.out.println("Ini kelas Anggrek");
        Anggrek sm = new Anggrek();
        sm.tampilAnggrek();
        
       
        System.out.println("Ini kelas Melati");
        Melati ap = new Melati();
        ap.tampilMelati();
        
        
    }
    
}
