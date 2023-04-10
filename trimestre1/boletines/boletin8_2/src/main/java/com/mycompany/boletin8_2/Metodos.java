
package com.mycompany.boletin8_2;

import javax.swing.JOptionPane;


public class Metodos {

    public int meterNumero(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
    
    
    public void seleccionarNumero(int numero){
        switch (numero){
            case 1:
                int lado = meterNumero("Introducir el lado del cuadrado");
                int area = (int)Math.pow(lado, 2);
                System.out.println("area = " + area);
                break;
        
            case 2:
                int base2 = meterNumero("Introducir base del triangulo");
                int altura2 = meterNumero("Introducir altura del triangulo");
                int area2 = (base2 * altura2) / 2;
                System.out.println("area = " + area2);
                break;
        
            case 3:
                int radio = meterNumero("Introducir radio del circulo");
                double area3 = Math.PI * Math.pow(radio, 2);
                long areaRed3 = Math.round(area3);
                System.out.println("area = " + areaRed3);
                break;
            default:
                System.out.println("El numero introducido es incorrecto");
        }
    }
    
}
