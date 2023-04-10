/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploabstractas;

/**
 *
 * @author dam1
 */
public class Triangulo extends FigurasXeometricas{

    public Triangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public float calcularArea() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return (super.getBase()*super.getAltura()/2);
    }

    @Override
    public float calcularPeri() { // seria de un triangulo rectangulo
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return (float) Math.pow((Math.pow(super.getBase(), 2) + Math.pow(super.getAltura(), 2)), (1 / 2)) + super.getAltura() + super.getBase();
    }
    
    
}
