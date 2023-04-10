/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoexcepcionesundemy;

/**
 *
 * @author casty
 */
public class AritmeticaRuntimeException {
    public static int division (int numerador, int denominador) { // throws OperacionExcepcion { -> no es necesario
        if (denominador == 0) {
            throw new OperacionExcepcionRuntimeException("Division entre cero");
        }
        return numerador / denominador;
    }
    
}
