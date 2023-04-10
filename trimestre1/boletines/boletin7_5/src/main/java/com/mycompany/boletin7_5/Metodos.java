
package com.mycompany.boletin7_5;

import javax.swing.JOptionPane;


public class Metodos {
    
    public String meterString(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }
    
    public int meterNumero(String mensaje){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
    

}

