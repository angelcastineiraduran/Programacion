

package com.mycompany.boletin7_5;


public class Boletin7_5 {

    public static void main(String[] args) {
        Metodos obx = new Metodos();
        int numero1 = obx.meterNumero("Introducir primer numero");
        int numero2 = obx.meterNumero("Introducir segundo numero distinto");
        int numero3 = obx.meterNumero("Introducir tercer numero distinto");
        
        if (numero1 < numero2 && numero2 > numero3){
            System.out.println("numero más alto = " + numero2);
        }
        else if (numero2 < numero1 && numero1 > numero3){
            System.out.println("numero más alto = " + numero1);
        }
        else if (numero1 < numero3 && numero3 > numero2){
            System.out.println("numero más alto = " + numero3);
        }
        
    }
}
