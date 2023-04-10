/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin12_1;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Metodos {
    int numero;

    
    public int pedirEnteros(String mensaje) {
        this.numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return this.numero;
    }
    
    public void dentroRango(){

        while(this.numero < 1 || this.numero > 50){
            pedirEnteros("Numero fuera de rango, volver a introducirlo");
        }
        System.out.println("Numero dentro del rango");
    }
    
    public void salidaPrograma(int numeroCorrecto){
        if(this.numero == numeroCorrecto){
            System.out.println("El numero es correcto");
        }
        else{
        System.out.println("Se han acabadi los intentos");
        }
        
    }
    
    
}
