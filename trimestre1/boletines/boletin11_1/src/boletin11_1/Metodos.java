/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin11_1;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Metodos {
    int contadorP = 0;
    int contadorN = 0;
    int contadorC = 0;

        
    public static int pedirEnteros (String mensaje){
        int numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return numero;
    }
    
    public void bucle(){

        for (int i = 0;i < 5;i++){
            int numero = Metodos.pedirEnteros("Introducir numero");
            if (numero > 0){
                this.contadorP++;
            }
            else {
                if (numero < 0){
                    this.contadorN++;
                }
                else {
                    this.contadorC++;
                }
            }
        }
        
        
    }
    
}
