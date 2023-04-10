/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.boletin7_2;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin7_2 {

    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Teclee un numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Teclee un numero"));
        
        Metodos obx = new Metodos();
        obx.restaSuma(numero1, numero2);
    }
}
