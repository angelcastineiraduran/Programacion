
package com.mycompany.boletin7_4;

public class Boletin7_4 {

    public static void main(String[] args) {
        int diferenciaPeso;
        
        Metodos obx = new Metodos();
        String nome1 = obx.meterString("Introducir nome");
        int peso1 = obx.meterNumero("Introducir peso");
        String nome2 = obx.meterString("Introducir nome");
        int peso2 = obx.meterNumero("Introducir peso");
        
        if (peso1 > peso2){
            System.out.println("nome = " + nome1);
            System.out.println("peso = " + peso1);
            diferenciaPeso = Math.abs(peso1 - peso2);
            System.out.println("La diferencia de peso con respecto a la otra persona es de = " + diferenciaPeso);
        }
        else if (peso1 < peso2){
            System.out.println("nome = " + nome2);
            System.out.println("peso = " + peso2);
            diferenciaPeso = Math.abs(peso1 - peso2);
            System.out.println("La diferencia de peso con respecto a la otra persona es de = " + diferenciaPeso);
            
        }
        else {
            System.out.println("Las dos personas tienen el mismo peso");
            diferenciaPeso = Math.abs(peso1 - peso2);
            System.out.println("La diferencia de peso con respecto a la otra persona es de = " + diferenciaPeso);
        }
        
    }
}
