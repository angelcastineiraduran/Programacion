/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletines21_4;

import metodos.Metodos;

/**
 *
 * @author casty
 */
public class Boletines21_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos obx = new Metodos();
        
        String letraDNI = obx.calculaLetra(39489065);
        System.out.println("letraDNI = " + letraDNI);
    }
    
}
