/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo3;

/**
 *
 * @author LENOVO
 */
public class gamePetani {
    int kecepatan;
    String nama ;
    int healthpoin;
    
    void run (){
        System.out.println(nama       +" is Running ...");
        System.out.println("Kecepatan = "+kecepatan);
    }

    boolean isDead()
    {
        if(healthpoin<=0)return true;
        return false;
    }
    }
    

