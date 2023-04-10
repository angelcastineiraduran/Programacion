/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intentoMiExcepcion;

/**
 *
 * @author casty
 */
public class Operaciones {
    ExcepcionesOperaciones excepcionesOperaciones= new ExcepcionesOperaciones();
    
    public void dividir (int numerador, int denominador){
        
    }
    public void raizCuadrada (double radicando, double indice){
        try {
            double resultado = Math.pow(radicando, (1/indice));
            // System.out.println("resultado = " + resultado); // si va arriba se imprimiria eso antes
            excepcionesOperaciones.raizRadicandoNegativo(radicando);
            System.out.println("resultado = " + resultado);
        } catch (MiExcepcion e){
            System.out.println("***ERROR EN CLASE: Operaciones***");
        }
    }
    
}
