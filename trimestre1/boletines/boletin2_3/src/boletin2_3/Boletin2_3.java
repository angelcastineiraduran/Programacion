
package boletin2_3;

import java.util.Scanner;


public class Boletin2_3 {

    public static void main(String[] args) {
        Scanner obxConsola = new Scanner (System.in);
        System.out.println("Introducir euros");
        float dineroEuros = obxConsola.nextFloat();
        System.out.println("Introducir cambio dolar/euro");
        float cambioDolares = obxConsola.nextFloat();
        float calculo = dineroEuros * cambioDolares;
        System.out.println("dinero en dolares = " + calculo )   ;   

    }
    
}
