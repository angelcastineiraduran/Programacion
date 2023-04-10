/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin27.escrituraLectura;

import boletin27.libreria.Libro;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author casty
 */
public class Escritura{
    String ruta = 
            "C:\\Users\\casty\\OneDrive\\Documentos\\NetBeansProjects\\programacion_2tri_v2\\boletines\\boletin27\\src\\boletin27\\almacenamientoFicheros\\dataLibros.txt";
    CreadoraLibros creadoraLibros=new CreadoraLibros();
    
    ObjectOutputStream escr;
    public void escribir(String ruta, Libro libro) {
        try {
            escr=new ObjectOutputStream(new FileOutputStream(ruta));
            escr.writeObject(libro);

        } catch(FileNotFoundException ex){
            System.out.println("erro 1: ");
            ex.printStackTrace();
            
        } catch(IOException ex) {
            System.out.println("erro 1: ");
            ex.printStackTrace();
        } finally {
            try {
                escr.close();
            } catch (IOException ex) {
                System.out.println("error 3:");
                ex.printStackTrace();
            }
        }
    }
}
