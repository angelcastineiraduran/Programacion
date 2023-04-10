/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriaficherosundmy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author casty
 */
public class ManejoArchivos {

    /**
     * se va a encargar de crear un archivo en nuestro discoduro
     * 
     * static solo para no tener que crear obj
     *
     * @param nombreArchivo
     */
    public static void crearArchivo(String nombreArchivo) {
        PrintWriter salida = null;
        try {
            File archivo = new File(nombreArchivo); // Creamos obj de tipo file en memo
            salida = new PrintWriter(archivo); // lo abrimos en disc duro/memo. Puede lanzar excep
            salida.close(); // cd llamamos a este metodo -> REALMENTE a aqui es dd se crear archivo, estamos seguros
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            // Logger.getLogger(ManejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);
        } finally {
            salida.close();
        }
    }

    /**
     *
     * @param nombreArchivo ruta archivo en el que queramos escribir info
     * @param contenido
     */
    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo); // se creaa obj de file
        try { 
            PrintWriter salida = new PrintWriter(archivo); // abrimos obj PrintWriter
            salida.println(contenido);
            salida.close(); // no podemos cerrar hasta que hayamos escrito
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    
    }
    
    public static void anexarArchivo(String nombreArchivo, String contenido){
        PrintWriter salida = null;
        try {
            File archivo = new File(nombreArchivo);
            salida = new PrintWriter(new FileWriter(archivo,true)); // puede lanzar otro error
            salida.println(contenido);
            System.out.println("Se ha creado archivo con anexar");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) { // se procesa la nueva excep
            ex.printStackTrace(System.out);
        } finally {
            salida.close();
        }
    }
    
    public static void lecturaArchivo(String nombreArchivo){
        var archivo = new File(nombreArchivo);
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine(); // para leer lineas completas
            while (lectura == null){
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out); 
        }
    }
}
