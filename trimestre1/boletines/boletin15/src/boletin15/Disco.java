/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin15;

/**
 *
 * @author dam1
 */
public class Disco extends Multimedia{
    private String xeneroPrincipal;

    public Disco() {
        super();
    }

    public Disco(String xeneroPrincipal, String titulo, String autor, String formato, double duracion) {
        super(titulo, autor, formato, duracion);
        this.xeneroPrincipal = xeneroPrincipal;
    }

    public String getXeneroPrincipal() {
        return xeneroPrincipal;
    }

    public void setXeneroPrincipal(String xeneroPrincipal) {
        this.xeneroPrincipal = xeneroPrincipal;
    }

    @Override
    public String toString() {
        return super.toString() + "Disco{" + "xeneroPrincipal=" + xeneroPrincipal + '}';
    }
    
    
    
    
    
}
