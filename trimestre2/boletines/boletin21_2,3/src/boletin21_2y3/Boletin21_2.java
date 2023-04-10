/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin21_2y3;

/**
 *
 * @author dam1
 */
public class Boletin21_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos obx = new Metodos();
        
        /**
         * boletin21_2
         */
        obx.crearArray();
        obx.aprobadosSuspensos();
        obx.notaMedia();
        //obx.notaAlta(); // lo tengo que comentar para que no me influya en los boletin21_3
        
        /**
         * boletin21_3
         */
        System.out.println("\n**apartado 1**");
        obx.notaAlumno(); 
        
        System.out.println("\n**apartado 2**");
        obx.nomeAprobado();
        
        System.out.println("\n**apartado 3**");
        obx.odenacion();
        
        System.out.println("\n**apartado 4**");
        obx.notaAlumnoPedido("paco");
        
        
    }
    
}
