/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin17;

import java.text.DecimalFormat;

/**
 *
 * @author dam1
 */
public class Boletin17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Boletines boletines = new Boletines();
        ProbaPracticas practicas = new ProbaPracticas();
        ProbasEscritas escritas = new ProbasEscritas();
        
        DecimalFormat decimales = new DecimalFormat("##.##");
        
        double notaBoletines = boletines.notaBoletines("Introducir numero de boletines totales", "Introducir numero de boletines realizados");
        System.out.println("notaBoletines = " + notaBoletines);
        
        double notaPracticas = practicas.notaMediaPractica("Introducir nota de la prueba practica");
        System.out.println("notaPracticas = " + notaPracticas);
        
        double notaEscritas = escritas.notaMediaEscrita("Introducir nota del primer examen teorico", "Introducir nota del segundo examen teorico");
        System.out.println("notaEscritas = " + notaEscritas);
        
        double notaTotal = notaBoletines + notaEscritas + notaPracticas;
        System.out.println("notaTotal = " + decimales.format(notaTotal));
        
    }
    
}
