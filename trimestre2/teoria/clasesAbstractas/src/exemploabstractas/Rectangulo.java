/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploabstractas;

/**
 * quiero crear un rectangulo con todos sus atributos 
 * 
 * hacer un no puedo crear un objeto de tipo figura xeometricas pero si me permite 
 * crear as miñas figuras xeometricas
 * 
 * @author dam1
 */
public class Rectangulo extends FigurasXeometricas{


    public Rectangulo(float base, float altura) {
        super(base, altura);
    }

// Tienen que ser iguales al de la superclase, por lo que sobre se borra
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
    
// tienen que ser iguales que el de la superclase
    
}
