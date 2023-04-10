package boletin2_5;

import java.util.Scanner;

        
public class Boletin2_5 {
    //por convenio toda la constante debe estar en mayus
    public static final int CONVERSION = 1850;

    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        System.out.println("Inserte la distancia en metros");
        //ponemos mejor en double por si acaso
        double distanciaMillas = consola.nextInt();
        double distanciaMetros = distanciaMillas * CONVERSION;
        System.out.println("La distancia en millas es = " + distanciaMetros);
        
        
        
    }
    
}
