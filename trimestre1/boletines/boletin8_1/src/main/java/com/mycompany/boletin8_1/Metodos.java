package com.mycompany.boletin8_1;

import javax.swing.JOptionPane;

public class Metodos {

    public String meterString(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    public int meterNumero(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }

    public void condicionalVentas(int numeroVentas) {
        if (numeroVentas <= 100) {
            System.out.println("O artigo introducido é de consumo baixo");
        } else if (numeroVentas > 100 && numeroVentas <= 500) {
            System.out.println("O artigo introducido é de consumo medio");
        } else if (numeroVentas > 500 && numeroVentas <= 1000) {
            System.out.println("O artigo introducido é de consumo alto");
        } else {
            System.out.println("O artigo introducido é de primeira necesidade");
        }
    }

}
