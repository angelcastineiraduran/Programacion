/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploPildoras.serializacion;

/**
 *
 * @author casty
 */
public class Plantilla {
    public Empleado[] creacionPlantilla() {
        Empleado[] personal = new Empleado[3];
        personal[0] = new Empleado(18, "angel", 3000);
        personal[1] = new Empleado(30, "marga", 1000);
        personal[2] = new Empleado(60, "oscar", 500);
        return personal;
    }   
}
