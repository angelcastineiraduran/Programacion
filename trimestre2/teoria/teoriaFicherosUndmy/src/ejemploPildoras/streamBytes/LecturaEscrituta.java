/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploPildoras.streamBytes;
import java.io.*;
/**
 *
 * @author casty
 */
public class LecturaEscrituta {
    String ruta = 
            "C:\\Users\\casty\\OneDrive\\Documentos\\NetBeansProjects\\programacion_2tri_v2\\teoria\\teoriaFicherosUndmy\\archivosGenerados\\imagen.jpg";
    String rutaCopia = 
            "C:\\Users\\casty\\OneDrive\\Documentos\\NetBeansProjects\\programacion_2tri_v2\\teoria\\teoriaFicherosUndmy\\archivosGenerados\\imagen_copia.jpg";

    /**
     * nos permite contar cuantos bytes tendra la imagen
     */
    int contador = 0;
    int[] almacenBytes = new int[135001];
    
    public void acceder () {
        try{
            FileInputStream entrada = new FileInputStream(this.ruta);
            int bytesImagen = 0;
            while (bytesImagen != -1){
                bytesImagen = entrada.read();
                if (bytesImagen != -1){
                    System.out.println(bytesImagen);
                    almacenBytes[contador] = bytesImagen;
                    this.contador++;
                }
            }
            System.out.println(contador);
            entrada.close();
        } catch (FileNotFoundException ex){
            ex.getMessage();
            System.out.println("no encontrado");
        } catch (IOException ex){
            ex.getMessage();
            System.out.println("no leido");
        }
    }
    
    public void salir() {
        try {
            FileOutputStream salida = new FileOutputStream(this.rutaCopia); // crea archivo
            for(int i = 0;i < almacenBytes.length; i++){
                salida.write(almacenBytes[i]);
            }
            salida.close();
        } catch(IOException ex) {
            ex.getMessage();
            System.out.println("error salida");
        }
    }
    
    
}
