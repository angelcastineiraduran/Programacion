/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import domain.Persona;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * operaciones select, insert o delete sobre la tabla de entidad que lleva asociada
 * (Persona)
 * 
 * @author casty
 */
public class PersonaDAO {
    private static final String SLQ_SELECT = "SELECT * FROM test.persona";
    private static final String SLQ_INSERT = "INSERT INTO test.persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
    
    
    public List<Persona> seleccionar() {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();
        
        try {
            conn = Conexion.getConnection();
            st = conn.prepareStatement(SLQ_SELECT);
            rs = st.executeQuery(); 
            while(rs.next()){
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                persona = new Persona(idPersona, nombre, apellido, email, telefono);
                personas.add(persona);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(st);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return personas; 
    }
    
    /**
     * 
     * @param persona
     * @return cuantos registros se han insertado
     */
    public int insertar(Persona persona){
        Connection conn = null;
        PreparedStatement st = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            st = conn.prepareStatement(SLQ_INSERT);
            st.setString(1, persona.getNombre());
            st.setString(2, persona.getApellido());
            st.setString(3, persona.getEmail());
            st.setString(4, persona.getTelefono());
            registros = st.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(st);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
            
        }
        return registros;
    }
    
}
