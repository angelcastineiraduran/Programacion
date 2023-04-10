
package com.mycompany.boletin6_3;

public class Main {
    public static void main(String[] args) {
        //sin parametros
        Circulo obx1 = new Circulo();
        var radio1 = obx1.getRadio();
        System.out.println("radio1 = " + radio1);
        var PI = obx1.getPI();
        System.out.println("PI = " + PI);
        
        var area1 = obx1.calcularArea();
        System.out.println("area1 = " + area1);
        var lonxitude1 = obx1.calcularLonxitude();
        System.out.println("lonxitude1 = " + lonxitude1);
        
        //parametrizado
        Circulo obx2 = new Circulo(3.0);
        var radio2 = obx2.getRadio();
        System.out.println("radio2 = " + radio2);
        var PI2 = obx2.getPI();
        System.out.println("PI2 = " + PI2);
        
        var area2 = obx2.calcularArea();
        System.out.println("area2 = " + area2);
        var lonxitude2 = obx2.calcularLonxitude();
        System.out.println("lonxitude2 = " + lonxitude2);
        
    }
}
