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
public class ProbaPracticas {
    private double probaPractica;
    
    public double notaMediaPractica (String mensaxe){
        this.probaPractica = Double.parseDouble(JOptionPane.showInputDialog(mensaxe));
        return probaPractica * 0.40;
        
    }
    
}
