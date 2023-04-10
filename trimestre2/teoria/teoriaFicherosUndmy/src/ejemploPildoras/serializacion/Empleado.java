/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploPildoras.serializacion;

import java.io.Serializable;

/**
 *
 * @author casty
 */
public class Empleado implements Serializable{
    private int edad;
    private String nombre;
    private double sueldo;

    public Empleado(int edad, String nombre, double sueldo) {
        this.edad = edad;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public void subirSueldo(double porcentaje){
        double aumento = this.sueldo * (porcentaje/100);
        this.sueldo += aumento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("edad=").append(edad);
        sb.append(", nombre=").append(nombre);
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }
    
    
}
