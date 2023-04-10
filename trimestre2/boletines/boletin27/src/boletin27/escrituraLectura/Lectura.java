/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin27.escrituraLectura;

import boletin27.libreria.Libro;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author casty
 */
public class Lectura {
    CreadoraLibros creadoraLibros=new CreadoraLibros();
    
    ObjectInputStream lec=null;
    Scanner sc;
    public void leer(File fichero){
        try {
            lec=new ObjectInputStream(new FileInputStream(fichero));
            Libro libroLeido=(Libro)lec.readObject();
            while(libroLeido!=null){
                System.out.println(libroLeido);
                libroLeido=(Libro)lec.readObject();
            }
        } catch(IOException ex) {
            System.out.println("erro 1 lectura:");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            System.out.println("erro 2 lectura:");
            ex.printStackTrace();
        } finally {
            try {
                lec.close();
            } catch (IOException ex) {
                Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public void lectura_inten2(ArrayList lista){
        while(sc.hasNext()){
            String libroLeido=sc.nextLine();
            System.out.println(libroLeido);
        }
    }
}
