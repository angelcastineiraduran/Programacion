
package com.mycompany.exemplocondicionais;

import java.util.Scanner;

public class CondicionalAnidada {
    
        public void introducirEdade( int edad){
        if (edad > 18){
            System.out.println("E maior de 18");
        }
        else if(edad == 18){
            System.out.println("Ten 18");
        }
        else{
            System.out.println("E menor de 18");
        }
        
    }

        public void verDiaSwitch (int dia){
            switch (dia){
                /*si no le pongo break, si encuentra un caso valido, va a ejercutar
                todas las sentencias a partir de la que es cierta. tenemos que poner
                break despues de cada sentencia
                */
                case 1: System.out.println("luns");
                case 2: System.out.println("martes");
                case 3: System.out.println("miercoles"); 
                case 4: System.out.println("jueves"); 
                default: System.out.println("erro");
            }
        }
}
