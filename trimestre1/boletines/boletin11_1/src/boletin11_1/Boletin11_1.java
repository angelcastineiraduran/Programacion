/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin11_1;

/**
 *
 * @author dam1
 */
public class Boletin11_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
//        int numero1 = Metodos.pedirEnteros("Introducir un numero");
//        int numero2 = Metodos.pedirEnteros("Introducir un numero");
//        int numero3 = Metodos.pedirEnteros("Introducir un numero");
//        int numero4 = Metodos.pedirEnteros("Introducir un numero");
//        int numero5 = Metodos.pedirEnteros("Introducir un numero");
//        int numero6 = Metodos.pedirEnteros("Introducir un numero");
//        int numero7 = Metodos.pedirEnteros("Introducir un numero");
//        int numero8 = Metodos.pedirEnteros("Introducir un numero");
//        int numero9 = Metodos.pedirEnteros("Introducir un numero");
//        int numero10 = Metodos.pedirEnteros("Introducir un numero");
        
        Metodos obx = new Metodos();
        obx.bucle();
        int numerosCer = obx.contadorC;
        int numerosPos = obx.contadorN;
        int numerosNeg = obx.contadorP;
        System.out.println("numerosNeg = " + numerosNeg);
        System.out.println("numeroPos = " + numerosPos);
        System.out.println("numerosCer = " + numerosCer);
    }
    
}
