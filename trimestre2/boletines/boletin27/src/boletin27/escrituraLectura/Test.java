/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin27.escrituraLectura;

import boletin27.libreria.Libro;
import java.io.File;

/**
 *
 * @author casty
 */
public class Test {
    public static void main(String[] args) {
        String ruta = 
            "C:\\Users\\casty\\OneDrive\\Documentos\\NetBeansProjects\\programacion_2tri_v2\\boletines\\boletin27\\src\\boletin27\\almacenamientoFicheros\\dataLibros.txt";
        File archivo=new File(ruta);
        Escritura escritura=new Escritura();
        Lectura lectura=new Lectura();
        CreadoraLibros cl=new CreadoraLibros();
        //Libro libro1 = new Libro("nombre vient", "patrick", 10.99, 1);
        //Libro libro2 = new Libro("it", "stephen king", 15.99, 10);
        
        escritura.escribir(ruta, new Libro("patric", "roth", 9.3, 3));
        //lectura.leer(archivo);
        //escritura.escribir(ruta,libro2);
        //lectura.leer(archivo);
    }
}
