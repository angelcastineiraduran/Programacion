/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.com.gm.my.jdbc.pruebabasesborrar;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ubuntu
 */
public class PruebaBasesBorrar {

    public static void main(String[] args) {
        try {
            String url="jdbc:mysql://localhost:3306/productosPrueba";
            Connection conexion = DriverManager.getConnection(url,"root","123456");
            Statement instruccion = conexion.createStatement();
            String sql = "SELECT * from tabla1";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.println("persona: " + resultado.getInt("persona"));
                System.out.println("nombre: " + resultado.getString("nombre"));
                System.out.println("apellido: " + resultado.getString("apellidos"));
                System.out.println("*****");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
