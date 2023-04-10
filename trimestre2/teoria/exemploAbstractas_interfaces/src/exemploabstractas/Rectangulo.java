/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploabstractas;

import exemploabstractas.superClases.FigurasXeometricas;
import exemploabstractas.interfaces.IRotable;
import exemploabstractas.interfaces.IDibuxable;

/**
 * quiero crear un rectangulo con todos sus atributos 
 * 
 * hacer un no puedo crear un objeto de tipo figura xeometricas pero si me permite 
 * crear as miñas figuras xeometricas
 * 
 * @author dam1
 */
public class Rectangulo extends FigurasXeometricas implements IDibuxable,IRotable{  
    
    public Rectangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public float calcularPeri() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return super.getBase()*super.getAltura();
    }

    @Override 
    public float calcularArea() { 
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return (2 * super.getBase()+ 2 * super.getAltura());
    }
    
// hay que modificarlos
    /**
     * Metodo que implementa el metodo dibujar de la interfaz IDibuxable
     * 
     * A nivel de compilacion solo hay esa etiqueta para indicar que lo implementa
     * por primera vez
     * 
     */
    @Override // realmente no esta sobreescribiendo, esta implementando por primer vez
    public void dibuxar() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Dibuxamos o rectangulo");
    }
    /**
     * Metodo que implementa el metodo rotar de la interfaz IRorable
     */
    @Override
    public void rotar() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Rotamos o rectangulo");
    }
    
}
