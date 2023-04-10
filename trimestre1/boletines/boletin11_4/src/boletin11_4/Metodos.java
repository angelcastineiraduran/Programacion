/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin11_4;

import javax.swing.JOptionPane;



public class Metodos {
    int numero;
    
    public int pedirEnteros(String mensaje) {
        this.numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return this.numero;
    }
    
    public void multiplicaciones(){
        for(int i = 0;i < 10;i++){
            int resultado = this.numero * i;
            System.out.println("resultado = " + resultado);;
        }
    }
    
}
