/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import domain.Persona;
import java.lang.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * operaciones select, insert o delete sobre la tabla de entidad que lleva
 * asociada (Persona)
 *
 * @author casty
 */
public class PersonaDAO {

    private static final String SLQ_SELECT = "SELECT * FROM schema_JDBC.registros";
    private static final String SLQ_INSERT = "INSERT INTO schema_JDBC.registros(nombre, apellido, importe, detalles) VALUES(?, ?, ?, ?)";
    //String sql_insert = "INSERT INTO schema_JDBC.registros (nombre, apellido, importe, detalles) VALUES (" + nombre + ",'"+ titulo + "');";
    ArrayList<Persona> lista = new ArrayList<>();
    private static final String SLQ_SELECT_NUMERO = "SELECT numero FROM schema_JDBC.registros";

    Integer numero;

    public List<Integer> identificacionPersona() {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Integer> listaNumeros = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            st = conn.prepareStatement(SLQ_SELECT_NUMERO);
            rs = st.executeQuery();
            while (rs.next()) {
                Integer numero = rs.getInt("numero");
                listaNumeros.add(numero);
            }
        } catch (Exception ex) {
            System.out.println("**fallo bd indetif**");
            ex.printStackTrace();
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(st);
                Conexion.close(conn);
            } catch (SQLException ex) {
                System.out.println("**fallo con sql identificador**");
                ex.printStackTrace(System.out);

            }
        }
        return listaNumeros;
    }

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
            while (rs.next()) {
                Integer numero = rs.getInt("numero");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                Integer importe = Integer.parseInt(rs.getString("importe"));
                String detalles = rs.getString("detalles");
                persona = new Persona(nombre, apellido, importe, detalles);
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
    public int insertar(Persona persona) {
        Connection conn = null;
        PreparedStatement st = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            st = conn.prepareStatement(SLQ_INSERT);
            st.setString(1, persona.getNombre());
            st.setString(2, persona.getApellido());
            st.setInt(3, persona.getImporte());
            st.setString(4, persona.getDetalles());
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

    public void borrar(Integer valor) {
        String sql_borrar = "DELETE FROM schema_JDBC.registros WHERE numero=" + valor;
        Connection conn = null;
        PreparedStatement st = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();

            st = conn.prepareStatement(sql_borrar);

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

    }

}
