/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manejoexcepcionesundemy;

/**
 *
 * @author casty
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado = 0;
        
        
        // TIPO EXCEPTION
        try {
            resultado = Aritmetica.division(10, 0);
        } catch (OperacionExcepcion e) {
            System.out.println("Ocurrio una excepcion de tipo OperacionException");
            System.out.println(e.getMessage());
        } catch (Exception e){
            // e.printStackTrace(); // imprimos pila de excepciones
            e.printStackTrace(System.out); // para que la mande a imprimir a consola aunque no es necesario ponerlo 
            //System.out.println(e.getMessage()); // si no quisieramos ver toda la pila de excepciones    
        }
        System.out.println("resultado = " + resultado);
        
        /*
        // TIPO RUNTIMEEXCEPCION
        // try { // **no es necesario**
            resultado = AritmeticaRuntimeException.division(10, 0);
        // } catch (Exception e){ // **no es necesario **
        //     e.printStackTrace(System.out); 
        // }
        System.out.println("resultado = " + resultado);
        */
    }
    
    
    
}
