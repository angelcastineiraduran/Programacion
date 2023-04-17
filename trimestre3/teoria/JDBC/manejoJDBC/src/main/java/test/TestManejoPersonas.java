/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.*;

/**
 *
 * @author casty
 */
public class TestManejoPersonas {

    public static void main(String[] args) {

        PersonaDAO personaDAO = new PersonaDAO();

        // SELECIONAR
//        List<Persona> personas = personaDAO.seleccionar();
//        personas.forEach(persona -> {
//            System.out.println("persona: " + persona);
//        });

        // INSERTAR
        Persona personaNueva = new Persona("Carlos", "Esperanza", "cesperan@gmail.com", "4738438");
        personaDAO.insertar(personaNueva);
        
        //mostramos resultado nuevo
        List<Persona> personas = personaDAO.seleccionar();
        personas.forEach(persona -> {
            System.out.println("persona: " + persona);
        });

    }

}
