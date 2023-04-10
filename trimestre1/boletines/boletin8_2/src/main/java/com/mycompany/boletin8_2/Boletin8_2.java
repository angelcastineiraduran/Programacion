

package com.mycompany.boletin8_2;

public class Boletin8_2 {

    public static void main(String[] args) {
        
        Metodos obx = new Metodos();
        int numero = obx.meterNumero("Seleccione el numero asignado a la figura que desee calcular su area\n1.Cuadrado\n2.Triangulo\n3.Circulo");
        obx.seleccionarNumero(numero);
        
      }
}
