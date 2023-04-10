
package com.mycompany.boletin6_1;

public class Coche {
    //atributos
    private int velocidade;
    
    public Coche(){
        //da igual ponerlo a cero ya que me lo da java por defecto
        velocidade = 0;
    }
    
    //metodos
    
    public int getVelocidade(){
        return velocidade;
    }
    
    public void acelerar (int valor){
        this.velocidade = this.velocidade + valor;
        
        
    }
    
    public void frenar (int menos){
        this.velocidade = this.velocidade - menos;
    }
    
    
}
