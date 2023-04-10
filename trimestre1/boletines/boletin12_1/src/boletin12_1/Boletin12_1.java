/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin12_1;

/**
 *
 * @author dam1
 */
public class Boletin12_1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
//        int i;
//        i = 3;
//        do{
//            int j = 0;
//            if(j > 10){
//                System.out.println("Numero correcto");
//            
//            i++;
//        }while(i < 10);
//            
//            }
//            else{
//                    System.out.println("i = " + i);
//                    }
//        
//    
//    }
     
        /*me faltaria solo poner el numero de intentos, pero por lo demas
        esta bien**/
        Metodos obx = new Metodos();
        System.out.println("Tienes 10 intentos");
        int i = 0;
        int numeroCorrecto = 3;
        
        do{
            i++;
            obx.pedirEnteros("Introduce un numero del 1 al 50");
            
            //si esta fuera del rango entra en este bucle
            obx.dentroRango();
            
            
        }while(i < 11 && obx.numero != numeroCorrecto);
        
        obx.salidaPrograma(numeroCorrecto);
    }
    
}
