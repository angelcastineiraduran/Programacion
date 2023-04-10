/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprogramacionpractico;

/**
 *
 * @author dam1
 */
public class Coche {
    private String marca;
    private float prezo;

    public Coche(String marca, float prezo) {
        this.marca = marca;
        this.prezo = prezo;
    }
    
    public void modificarPrezo(float valor){
        this.prezo = valor;
    }
    
    // Creo los metodos de acceso para acceder a ellos
    
    public String getMarca() {
        return marca;
    }

    public float getPrezo() {
        return prezo;
    }
    
    
    
}
