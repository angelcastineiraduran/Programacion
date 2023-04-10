/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploPildoras.streams.sinBuffer;

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
public class Lectura {
    /**
     * 
     */
    public String ruta = 
        "C:\\Users\\casty\\OneDrive\\Documentos\\NetBeansProjects\\programacion_2tri_v2\\teoria\\teoriaFicherosUndmy\\src\\ejemploPildoras\\ejemplo.txt";
    /**
     * 
     * 
     * FileReader lanza una excepcion por lo que es obligatorio manejarla. Si
     * seleccionamos opcion del IDE captura excepcion exacta (extiende de IOEx..)
     * 
     * metodo lee carac por carac y cd llega al final devuelve -1. Mientras no
     * llegue devuelve codigo del caracter, un int.
     */
    public void  leerFichero(){
        try {
            FileReader entrada = new FileReader(ruta); // entrada almacena path fich
            int c = 0; // pq no inicializa en 0?
            while(c != -1) {
                c = entrada.read();
                char letra = (char)c;
                System.out.print(letra);
            }
            entrada.close(); // no necesario en finally ya que si no entra en el try no se abre flujo
        } catch (FileNotFoundException ex) { // captura lo de FileReader
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException ex) { // captura lo de read() 
            System.out.println("No se ha encontrado el archivo");
        }
    }
}
