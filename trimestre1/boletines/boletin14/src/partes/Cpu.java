/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partes;

/**
 *
 * @author dam1
 */
public class Cpu {
    private int velocidad;
    
    public Cpu(){
        
    } 
    
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }
    
    public int getVelocidad(){
        return velocidad;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
    }

    @Override
    public String toString() {
        return "CPU{" + "velocidad=" + velocidad + '}';
    }
    
    
    
}
