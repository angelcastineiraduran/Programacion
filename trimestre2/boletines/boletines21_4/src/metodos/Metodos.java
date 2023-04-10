/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author casty
 */
public class Metodos {
    private long dni;
    private String letraDNI;
    private static final int CONSTANTE = 23;
    // las ordene por excel, vale????
    // mejor hacerlo con char en vez de String
    String asociacionLetras[ ] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
    
    /**
     * Realiza un programa que regresa a letra do NIF
     * @param dni
     * @return letraDNI
     */
    public String calculaLetra(long dni){
        this.dni = dni;
        int resto = (int) (dni % CONSTANTE);
        for (int i = 0; i  < asociacionLetras.length; i++){
            if(i == resto){
                this.letraDNI = asociacionLetras[i];
            }
        }
        return letraDNI;
    }
    
}
