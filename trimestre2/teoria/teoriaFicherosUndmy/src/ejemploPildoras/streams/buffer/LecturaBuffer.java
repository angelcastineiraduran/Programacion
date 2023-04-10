/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploPildoras.streams.buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *  
 * @author casty
 * 
 * 
 */
public class LecturaBuffer {
    /**
     * 
     */
    public String ruta = 
            "C:\\Users\\casty\\OneDrive\\Documentos\\NetBeansProjects\\programacion_2tri_v2\\teoria\\teoriaFicherosUndmy\\src\\ejemploPildoras\\buffer\\pruebaBuffer.txt";
            
   
    public void  leerFichero(){
        try {
            FileReader entrada = new FileReader(ruta);
            BufferedReader entradaBuffer = new BufferedReader(entrada);
            String linea = "";
            while(linea != null) {
                linea = entradaBuffer.readLine();
                if (linea != null){
                    System.out.println(linea);
                }                
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se ha encontrado el archivo1");
        } catch (IOException ex) {
            System.out.println("No se ha encontrado el archivo2");
        }
    }
}
