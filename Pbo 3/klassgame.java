/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo3;

/**
 *
 * @author LENOVO
 */
public class klassgame {
    public static void main(String[]args){
        gamePetani Petani= new gamePetani();
        
        Petani.nama="Hendra";
        Petani.kecepatan= 99;
        Petani.healthpoin= 0;
        
        
        Petani.run();
        if(Petani.isDead())
        {
            System.out.println("GAME IS OVER !!!");
        }
    
        }
}
