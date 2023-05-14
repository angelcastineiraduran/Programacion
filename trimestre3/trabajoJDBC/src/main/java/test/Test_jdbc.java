/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author ubuntu
 */
import datos.*;
import domain.Persona;
import java.util.List;
public class Test_jdbc {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
       // Persona personaNueva = new Persona("angel", "casti", 3, "holaausdi");
        //personaDAO.insertar(personaNueva);
        
        
        //selecciono
        personaDAO.borrar(1);

    }
    
}
