
package boletin3_3;

import java.util.Scanner;

public class App {
 
    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        System.out.println("Introducir numero de billetes de 100 euros");
        int billetes100 = consola.nextInt();
        System.out.println("Introducir numero de billetes de 20 euros");
        int billetes20 = consola.nextInt();
        System.out.println("Introducir numero de billetes de 5 euros");
        int billetes5 = consola.nextInt();
        System.out.println("Introducir numero de monedas de 1 euro");
        int monedas = consola.nextInt();
        int dineroTotal = (billetes100 * 100) + (billetes20 * 20) + (billetes5 * 5) + monedas;
        System.out.println("El dinero total es de = " + dineroTotal + "euros");
        
        

    }
}
