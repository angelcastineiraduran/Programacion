/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partes;

/**
 *
 * @author dam1
 */
public class Teclado {
    private String marca;
    
    public Teclado(){
        
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return this.marca;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + '}';
    }
    
    
}
