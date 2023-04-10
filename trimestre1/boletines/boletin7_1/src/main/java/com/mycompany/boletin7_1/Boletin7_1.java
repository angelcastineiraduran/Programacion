/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.boletin7_1;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin7_1 {

    public static void main(String[] args) {
        
        Metodos obx = new Metodos();
        int consola = Integer.parseInt(JOptionPane.showInputDialog("Teclee un numero"));
        obx.comprobacionSigno(consola);
        
    }
}
