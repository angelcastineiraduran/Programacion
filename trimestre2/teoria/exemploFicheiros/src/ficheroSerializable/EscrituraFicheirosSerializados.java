package ficheroSerializable;

import lectura.*;
import eficheiros.Alumno;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * si utilizo obj de esta clase, se van a serializar (solo objetos). Voy a hacer 
 * un flujo de datos de lo que yo le mande
 * 
 * @author NSteuerberg
 */
public class EscrituraFicheirosSerializados{ 
    Scanner sc;
    ObjectInputStream lec = null; // creo obj tipo ObjectInputStream
    ObjectOutputStream escr = null;
    /**
     * 
     * 1. abro flujo salida
     * 2. creo 2 objetos `AlumnoSerializado`
     * 3. utilizo la clase de ObjectOutPutStream para poder usar el metodo
     * writeObject() que escribe en el fichero
     * @param fich 
     */
    public void escribirSeri (File fich){
        try{
            // serializao los objetos y los escribo
            escr = new ObjectOutputStream (new FileOutputStream(fich));
            AlumnadoSerializado a11 = new AlumnadoSerializado("aa", 3);
            AlumnadoSerializado a12 = new AlumnadoSerializado("bb", 2);
            AlumnadoSerializado a13 = new AlumnadoSerializado("cc", 3);
            escr.writeObject (a11);
            escr.writeObject (a12);
            escr.writeObject (a13);
        
        }catch (FileNotFoundException ex){
            System.out.println("No se encontro en fichero " +  ex.toString());
        
        }catch (IOException ex) {// capturo excep y los cierro
            System.out.println("error 2" + ex.getMessage());
            
        }finally {
            
            try {
                escr.close();
            }catch(IOException ex){ // es un erro de escritura, es distinto al anterior 
                System.out.println("erro 3 " + ex.getMessage());
            }
        }
    }
    /***
     * NO ESTA BIEN PREGUNTAR????
     * @param fich 
     */
    public void engadirSeri (File fich){
        try{
            escr = new ObjectOutputStream (new FileOutputStream(fich, true));
            AlumnadoSerializado a11 = new AlumnadoSerializado("qq23", 2);
            AlumnadoSerializado a12 = new AlumnadoSerializado("e23", 2);
            escr.writeObject (a11);
            escr.writeObject (a12);
        
        }catch (FileNotFoundException ex){
            System.out.println("No se encontro en fichero " +  ex.toString());
        
        }catch (IOException ex) {// capturo excep y los cierro
            System.out.println("error 2" + ex.getMessage());
            
        }finally {
            
            try {
                escr.close();
            }catch(IOException ex){ // es un erro de escritura, es distinto al anterior 
                System.out.println("erro 3 " + ex.getMessage());
            }
        }
    }


    
    
}