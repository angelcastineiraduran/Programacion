/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin16;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */

public class CuentaAhorro2 extends Conta{
    private double intereseVariable;
    private double sueldoMin;
   
    public void cambioInteres (String mensaxe){
        intereseVariable = Double.parseDouble(JOptionPane.showInputDialog(mensaxe));
    }

    public CuentaAhorro2(double intereseVariable, double sueldoMin) {
        this.intereseVariable = intereseVariable;
        this.sueldoMin = sueldoMin;
    }

    public CuentaAhorro2(double intereseVariable, double sueldoMin, long numeroConta, Persoa cliente) {
        super(numeroConta, cliente);
        this.intereseVariable = intereseVariable;
        this.sueldoMin = sueldoMin;
        super.setSaldo(300);
        this.saldo = super.getSaldo() * ((100 + intereseVariable) / 100);
    }

    public double getIntereseVariable() {
        return intereseVariable;
    }

    public void setIntereseVariable(double intereseVariable) {
        this.intereseVariable = intereseVariable;
    }

    public double getSueldoMin() {
        return sueldoMin;
    }

    public void setSueldoMin(double sueldoMin) {
        this.sueldoMin = sueldoMin;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaAhorro2{");
        sb.append("intereseVariable=").append(intereseVariable);
        sb.append(", sueldoMin=").append(sueldoMin);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    
    }
    
    

   
    
    
    

    
    
    
    
    
    
    
    


    
    
    
    
    
    
    
    
    
