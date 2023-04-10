

package com.mycompany.boletinextra_1;

import java.util.Scanner;


public class BoletinExtra_1 {

    public static void main(String[] args) {
        // Ejercicio 1
        Scanner consola = new Scanner ( System.in );
        System.out.println("Introducir precio sin IVA");
        double base = consola.nextDouble();
        System.out.println("Introducir porcentaje de IVA que se va a aplicar");
        double ivaPorcentaje = consola.nextDouble();
        //no preciso poner 100.0 porque se queda con la literal mas grande (el double)
        double ivaPrecio = base * (ivaPorcentaje / 100);
        double precioTotal = ivaPrecio + base;
        System.out.println("precioTotal = " + precioTotal);
        
        // Ejercicio 2
        System.out.println("Introduce el valor de a");
        double a = consola.nextDouble();
        System.out.println("Introduce el valor de b");
        double b = consola.nextDouble();
        System.out.println("Introduce el valor de c");
        double c = consola.nextDouble();
        System.out.println("Introduce el valor de x");
        double x = consola.nextDouble();
        //operacion
        double y = a * (Math.pow(x, 2)) + b * x + c;
        System.out.println("y = " + y);
        
        // Ejercicio 3
        System.out.println("Introduce el valor de a");
        double a1 = consola.nextDouble();
        System.out.println("Introduce el valor de b");
        double b1 = consola.nextDouble();
        System.out.println("Introduce el valor de c");
        double c1 = consola.nextDouble();
        double z1 = Math.pow(b1, 2) - (4 * a * c1);
        double z2 = Math.pow(z1, 0.5);
        double y1 = ( - b + z2 ) / (2 * a1);
        double y2 = ( - b - z2 ) / (2 * a1);
        System.out.println("y1 = " + y1);
        System.out.println("y2 = " + y2);
    }
}
        
            

   
