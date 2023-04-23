/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin31;

/**
 *
 * @author casty
 */
public class Historial {
    final static int SUMA = 0;
    final static int MULTIPLICACION = 1;
    final static int DIVISION = 2;
    final static int RESTA = 3;
    String operando;
    String historialText;
    
    Integer[] historial = new Integer[4];
    int aux = 0;
    
    public Integer[] getHistorial(Integer operador1, Integer operador2, Integer operando, Integer resultado){
        historial[0] = operador1;
        historial[1] = operador2;
        historial[2] = operando;
        historial[3] = resultado;
        aux = aux + 1;
        return historial;
    }
    
    public boolean existeHistorial(Integer[] historial){
        if (aux > 0){
            return true;
        }
        return false;
    }
    
    public String getOperando (){
        switch(historial[2]){
            case SUMA:
                operando = "+";
                break;
            case RESTA:
                operando = "-";
                break;
            case DIVISION:
                operando = "/";
                break;
            case MULTIPLICACION:
                operando = "*";
        }
        return operando;
    }
    
    public String getHistorialText(Integer[] historial){
        historialText = historial[0] + " " + getOperando() + " " + historial[1] + " = " + historial[3];
        return historialText;
    }
   
    
}
