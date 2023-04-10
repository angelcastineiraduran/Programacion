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
public class Conta{
    private long numeroConta;
    protected double saldo;
    private Persoa cliente;
    public Conta() {
        
    }

    public Conta(long numeroConta, Persoa cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }
    
// Metodos 
    
    public void Ingresar (String mensaxe, double ingreso){
        ingreso = Double.parseDouble(JOptionPane.showInputDialog(mensaxe));
        this.saldo = this.saldo + ingreso;
        
    }
    
    public void Retiro (String mensaxe, double retiro){
        retiro = Double.parseDouble(JOptionPane.showInputDialog(mensaxe));
        if (saldo > 0) {
            this.saldo = this.saldo - retiro;
        }
        else {
            System.out.println("No se puede realizar retiro, no hay saldo");
        }
       
    }
    
    
    public double actualizarSaldo (){
        System.out.println("El saldo actual es de:");
        return this.saldo;
    }
    
    // setters y getters

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persoa getCliente() {
        return cliente;
    }

    public void setCliente(Persoa cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Conta{");
        sb.append("numeroConta=").append(numeroConta);
        sb.append(", cliente=").append(cliente);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    
    
}
