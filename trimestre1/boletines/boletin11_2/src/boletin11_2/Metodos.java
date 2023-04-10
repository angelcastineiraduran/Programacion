/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin11_2;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Metodos {
    int numero = 0;
    //le tengo que dar double por que si no no me cabe en la multi
    double numero1 = 1;
    
    public void suma (){
        int i = 10;
        do {
            this.numero = this.numero + i;
            i++;
        }
        while (i < 91);
    }
    
    public void multiplicacion(){
        int i = 10;
        do {
            this.numero1 = this.numero1 * i;
            i++;
        }
        while (i < 91);
    }
    
    
    
}
