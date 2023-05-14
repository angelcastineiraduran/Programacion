/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author ubuntu
 */
import domain.*;
import java.util.ArrayList;
public class RegistrosTotales {
    ArrayList<Persona> lista = new ArrayList<>();
    String sql = "SELECT numero, nombre, apellido, importe, detalles from registros";
    

}
