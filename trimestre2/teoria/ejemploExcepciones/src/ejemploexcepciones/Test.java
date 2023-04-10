/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploexcepciones;

import dividirExcepciones.DividirExcepciones;
import nosaExcepcion.NosaExcepcion;

/**
 *
 * @author dam1
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DividirExcepciones obx = new DividirExcepciones();
//        try {
//        obx.dividirNosaExcepcion(6, 0);
//        } catch (NosaExcepcion e){
//            System.out.println("non dividir entre 0" + e.toString());
//        }
//        System.out.println("Fin do programa");
        
        int num2 = 8, deno2 = 4;
        /**
         * si creo mi propia excepcion recordar que tengo que crear el objeto
         * para poder utilizarlo    
         */
        try {
            int resultado = num2 / deno2;
            obx.dividirNosaExcepcion_sinElse(num2, resultado); // hay que crear objeto antes de asignarle el tipo
        } catch (NosaExcepcion e) { // esto es lo que recibe. el objeto tiene que estar creado para poder recibirlo 
            System.out.println("Non dividir entre 0" + e.toString());
        }
        System.out.println("Finaliza programa");
        
        
        
    }
    
    
}
