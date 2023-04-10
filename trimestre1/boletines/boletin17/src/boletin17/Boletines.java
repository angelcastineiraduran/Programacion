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
public class Boletines {
    
    private int numeroTotalBoletines;
    private int boletinesRealizados;
    
    public double notaBoletines (String mensaxeTotal, String mensaxeRealizados){
        this.numeroTotalBoletines = Integer.parseInt(JOptionPane.showInputDialog(mensaxeTotal));
        this.boletinesRealizados = Integer.parseInt(JOptionPane.showInputDialog(mensaxeRealizados));
        double porcentaxe = boletinesRealizados/numeroTotalBoletines;
        int nota;
        if (porcentaxe>0.90){
            nota = 2;
        }
        else if(porcentaxe<=0.90 || porcentaxe>=0.70){
            nota = 1;
        }
        else {
            nota = 0;
        }
        return nota;
    }
    
}
