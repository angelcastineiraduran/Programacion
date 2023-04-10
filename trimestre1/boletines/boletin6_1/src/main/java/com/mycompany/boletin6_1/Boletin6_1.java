
package com.mycompany.boletin6_1;

public class Boletin6_1 {
    
    public static void main(String[] args) {
        
        Coche obx1 = new Coche();
        
        obx1.acelerar(5);
        var acelerar = obx1.getVelocidade();
        System.out.println("acelerar = " + acelerar);
        
        obx1.frenar(2);
        var frenar = obx1.getVelocidade();
        System.out.println("frenar = " + frenar);
        
        
    }
    
}
