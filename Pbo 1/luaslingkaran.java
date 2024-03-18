/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo1;

/**
 *
 * @author LENOVO
 */
public class luaslingkaran {

   public static void main(String[] args) {
    lingkaran L=new lingkaran();
    
    L.phi=3.14;
    L.jari2=15;
    
    L.luas= L.phi*(L.jari2*L.jari2);
    
    System.out.println("Phi = "+L.phi);
    System.out.println("Jari - Jari : "+L.jari2);
    System.out.println(" Luas lingkaran :"+L.luas);
    
   
    }
    
}
