/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin7_2;

/**
 *
 * @author dam1
 */
public class Metodos {
    
    public void restaSuma(int numero1, int numero2){
        if(numero1 >= numero2){
            int resta = numero1 - numero2;
            System.out.println("resta = " + resta);
        }else{
            int suma = numero1 + numero2;
            System.out.println("suma = " + suma);
        }
    }
    
}
