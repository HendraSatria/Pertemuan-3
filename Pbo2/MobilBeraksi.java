/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo2;

/**
 *
 * @author LENOVO
 */
public class MobilBeraksi {
    public static void main(String[]args){
        
        mobil Mobilku=new mobil();
        
        Mobilku.tahunProduksi=2009;
        Mobilku.warna="Merah";
        
        System.out.println("Warna Mobil :"+Mobilku.warna);
        System.out.println("Tahun Produksi :"+Mobilku.tahunProduksi);
        
    }
    
}
