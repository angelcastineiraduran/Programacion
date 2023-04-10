/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.boletin6_2;

/**
 *
 * @author dam1
 */
public class Boletin6_2 {

    public static void main(String[] args) {
        //valores atributos constructor por defecto
        Satelite obx1 = new Satelite();
        obx1.verPosicion();
        
        //valores atributos constructor parametrizado
        Satelite obx2 = new Satelite(3.0, 4.0, 3.0);
        obx2.verPosicion();
    }
}
