
package com.mycompany.boletin7_3;

import javax.swing.JOptionPane;

public class Boletin7_3 {

    public static void main(String[] args) {
        Metodos obx = new Metodos();
        int numero = obx.meterNumero("Introducir numero positivo o negativo");
        if (numero < 0){
            System.out.println("El numero es negativo");
        }
        else if (numero == 0){
            System.out.println("Tienes el cero");
        }
        else {
            System.out.println("Tu numero es positivo");
        }
        
    }
}




