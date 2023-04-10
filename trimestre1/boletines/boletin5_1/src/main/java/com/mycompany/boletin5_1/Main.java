
package com.mycompany.boletin5_1;

public class Main {
    
    public static void main(String[] args) {
        Consumo obx1 = new Consumo();
        obx1.setLitros(50);
        obx1.setPGas(1.57f);
        
        Consumo obx2 = new Consumo( 200, 12, 60, 1.57f);
        
        var consumoMedio = obx2.consumoMedio();
        System.out.println("consumo medio = " + consumoMedio);
        
        obx2.setLitros(15);
        
        var velocidadMedia = obx2.getVMed();
        System.out.println("velocidade media = " + velocidadMedia);
    }
    
    
    
}
