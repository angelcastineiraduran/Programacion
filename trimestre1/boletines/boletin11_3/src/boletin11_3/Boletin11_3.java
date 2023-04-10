/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin11_3;

/**
 *
 * @author dam1
 */
public class Boletin11_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Metodos obx = new Metodos();

        int base = obx.base;
        int altura = obx.altura;


        int area = obx.pedirNumerosCorrectos();
        System.out.println("area = " + area);
    }
    
}
