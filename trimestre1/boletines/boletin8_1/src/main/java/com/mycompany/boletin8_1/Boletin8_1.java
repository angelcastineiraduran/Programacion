
package com.mycompany.boletin8_1;

public class Boletin8_1 {

    public static void main(String[] args) {
        Metodos obx = new Metodos ();
        String nomeArtigo = obx.meterString("Introducir o nome do artigo");
        int numeroVentas = obx.meterNumero("Introducir o numero de ventas");
        obx.condicionalVentas(numeroVentas);
    
    }
}
