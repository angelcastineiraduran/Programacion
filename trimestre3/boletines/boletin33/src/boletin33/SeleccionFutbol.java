/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin33;

/**
 *
 * @author dam1
 */
public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
    protected Integer id;
    protected String nombre;
    protected String apellidos;
    protected Integer edad;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SeleccionFutbol{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }
    
    
}
