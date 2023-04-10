/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partes;

/**
 *
 * @author dam1
 */
public class Monitor {
    private float pulgadas;
    
    public Monitor(){
        
    }
    
    public void setPulgadas(float pulgadas){
        this.pulgadas = pulgadas;
    }
    
    public float getPulgadas(){
        return pulgadas;
    }

    @Override
    public String toString() {
        return "Monitor{" + "pulgadas=" + pulgadas + '}';
    }
    
    
    
}
