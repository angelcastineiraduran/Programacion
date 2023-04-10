

package com.mycompany.exemplocondicionais;

import javax.swing.JOptionPane;

public class ExemploCondicionais {

    public static void main(String[] args) {
        
        //1.- Condicional simple
        CondicionalSimple obx = new CondicionalSimple();
        obx.maiorEdade(19);
        obx.maiorEdade(15);
        
        //llamamos a la consola
        String resultado = JOptionPane.showInputDialog("teclea edade");
        System.out.println("resultado = " + resultado);
        //paso de string a int
        int edad = Integer.parseInt(resultado);
        /*se pueden juntar los 2 pasos anteriores en 1
        int edad = Integer.parseInt(JOptionPane.showInputDialog("teclea edade"));
        System.out.println("edad = " + edad);
        **/
        obx.maiorEdade(edad);
        
        System.out.println("---------------");
        
        //2.- Condicional dobre
        CondicionalDobre obx1 = new CondicionalDobre();
        obx1.consultarEdade(edad);
        
        obx1.consultarEdade2(edad);
        
        //3. - Condiconal anidado
        int edade = Integer.parseInt(JOptionPane.showInputDialog("teclea edade"));
        CondicionalAnidada obxAni = new CondicionalAnidada();
        obxAni.introducirEdade(edade);
        
                
    }
}
