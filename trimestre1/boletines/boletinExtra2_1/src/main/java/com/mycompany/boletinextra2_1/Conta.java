
package com.mycompany.boletinextra2_1;

public class Conta {
    //atributos
    private String nomeCliente;
    private String numeroConta;
    private double tipoInterese;
    private double saldo;
    
    //constructores
    public Conta(){
        
    }
    
    public Conta(String nomeCliente, String numeroConta, double tipoInterese, double saldo){
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.tipoInterese = tipoInterese;
        this.saldo = saldo;
        
    }
    
    //m acceso
    public void setNomeCliente(String nomeCliente){
       this.nomeCliente = nomeCliente; 
    }
    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
        
    }
    public void setTipoInterese(double tipoInterese){
        this.tipoInterese = tipoInterese;
    }
    
    public String getNomeCliente(){
        return nomeCliente;
    }
    public String getNumeroConta(){
        return numeroConta;
    } 
    public double getSaldo(){
        return saldo;
    }
    public double getTipoInterese(){
        return tipoInterese;
    }
    
    //metodos ingreso e reintegro
    public double ingresoSaldo(double ingreso){
        if(ingreso >= 0){
            this.saldo = ingreso + this.saldo;
        } else {
        System.out.println("Numero incorrecto, introduce un numero positivo");
        }
        return this.saldo;
    }
    public double reintegroSaldo(double reintegro){
        if (reintegro >= 0){
            this.saldo =  this.saldo - reintegro;
        } else {
        System.out.println("Numero incorrecto, introduce un numero positivo");
        }
        return this.saldo;
    }
    
    //metodo transferencia
    public void transferencia(String cuentaDestinoNome, String cuentaDestinoNumero, double importe){
        this.nomeCliente = cuentaDestinoNome;
        this.numeroConta = cuentaDestinoNumero;
        this.saldo = importe;
    }
    
}
