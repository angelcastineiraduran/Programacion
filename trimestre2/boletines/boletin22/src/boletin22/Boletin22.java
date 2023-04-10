/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin22;

import java.util.Arrays;
import metodos.Metodos;

/**
 *
 * @author casty
 */
public class Boletin22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos obx = new Metodos();
        int golesMarcados[ ][ ] = obx.creaArray();
        obx.mostrarArray(); 
        
        /**
         * Ejercicio 2
         */
        System.out.println("");
        obx.equiposGoles();
            
        //obx.verGolesEquipos();
        //obx.ordenarMatriz(obx.golesEquipo);
        
        System.out.println(Arrays.toString(obx.golesEquipo));   
        
        System.out.println("\n***********");
        obx.ordenarMatriz_v2(obx.golesEquipo);
        obx.mostrarArray();
        
    }
    
}
