/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author dam1
 */
public class EContratado extends Empregado{
    private double soldoBasico;
    private double porcentaxe;
    private static final int ANOSMIN = 0;
    private static final int ANOSMAX_PRIMER_PORCENTAXE = 3;
    private static final int ANOSMAX_SEGUNDO_PORCENTAXE = 7;
    private static final int ANOSMAX_TERCER_PORCENTAXE = 15;
    
    public void asignarPorcentaxe(int anosTraballados){
        if(anosTraballados >= ANOSMIN && anosTraballados <= ANOSMAX_PRIMER_PORCENTAXE){
            
        }
            
    }
}
