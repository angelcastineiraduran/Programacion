/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin11_2;

/**
 *
 * @author dam1
 */
public class Boletin11_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos obx = new Metodos();
        obx.suma();
        obx.multiplicacion();
        
        int numero = obx.numero;
        double multiplicacion = obx.numero1;
        
        System.out.println("numero = " + numero);
        System.out.println("multiplicacion = " + multiplicacion);
    }
    
}
