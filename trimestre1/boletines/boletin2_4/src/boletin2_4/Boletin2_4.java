
package boletin2_4;

import java.util.Scanner;


public class Boletin2_4 {

    
    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        System.out.println("introduce numero 1");
        int numero1 = consola.nextInt();
        System.out.println("Introduce numero 2");
        int numero2 = consola.nextInt();
        int suma = numero1 + numero2;
        System.out.println("suma = " + suma);
        /*en visual studio si pones un numero2 negativo 
        en el ejemplo de abajo daria error ya que los 2 signos 
        negativos lo interpreta como 2 guiones no como si fuera 
        una opeacion matematica para solucionar esto se pondría:
        int resta = numero1 - (numero2);
        */
        int resta = numero1 - numero2;
        System.out.println("resta = " + resta);
        int producto = numero1 * numero2;
        System.out.println("producto = " + producto);
        int cociente = numero1/numero2;
        System.out.println("cociente = " + cociente);
        
       
    }
    
}
