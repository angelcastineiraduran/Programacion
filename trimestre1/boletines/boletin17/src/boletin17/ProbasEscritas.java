/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin17;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class ProbasEscritas {
    private double probaEscrita1;
    private double probaEscrita2;
    
    public double notaMediaEscrita (String mensaxe1, String mensaxe2){
        this.probaEscrita1 = Double.parseDouble(JOptionPane.showInputDialog(mensaxe1));
        this.probaEscrita2 = Double.parseDouble(JOptionPane.showInputDialog(mensaxe2));
        return (probaEscrita1 + probaEscrita2)/2 * 0.40;
    }
    
    
    
    
}
