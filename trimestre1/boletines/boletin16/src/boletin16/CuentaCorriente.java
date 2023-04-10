/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin16;

/**
 *
 * @author dam1
 */
public class CuentaCorriente extends Conta{
    
    private final double INTERES_FIXO = 1.5;// 0.985; // no me va con la cte
    public CuentaCorriente() {
    }

    public CuentaCorriente(long numeroConta, Persoa cliente) {
        super(numeroConta, cliente);
        super.setSaldo(300);
        this.saldo = super.getSaldo() * ((100 + INTERES_FIXO) / 100);
 
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaCorriente{");
        sb.append("INTERES_FIXO=").append(INTERES_FIXO);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

 
 
    


}
    
    
    



    
    
    
    
    
  
    
    
    
    
    

