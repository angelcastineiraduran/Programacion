/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author dam1
 */
public class EscribirFicheiros {
    /**
     * es necensario inicializarlos antes?????
     */

    FileWriter ou = null; // null para que no apunte a nada

    PrintWriter fich = null;// me coge el "ou" pq quiero hacer lectura y escritura en buffer (va en paquetes)

    /**
     * Se crea o se sobreescribe en un fichero dado
     * 
     * PrintWriter obtengo objeto de flujo de salida en el fichero, si no lo creo
     * PrintWriter proporciona metodos para escribir (mejor optimizacion)
     * @param ficheiro 
     */
    public void escribirPalabras(File ficheiro) { // recibo el obj dd quiero escribir
        try {
            ou = new FileWriter(ficheiro);
            // ou.write("buenas dias");
            fich = new PrintWriter(ou);

            fich.println("lun++++s"); // escribo
            fich.println("maertes");
            fich.println("mercoles");
            // ou.close();

        } catch (IOException ex) {
            System.out.println("erro escritura: " + ex.getMessage());

        } finally {
            fich.close();

        }
       
    }
    
    /**
     * añade cadenas al fichero sin sobreescribir
     * al poner el `true` le decimos que ya existe el fichero y que lo añada en vez
     * de sobreescribir
     * 
     * @param ficheiro 
     */
    public void engadirPalabras (File ficheiro){
        try {
            ou = new FileWriter(ficheiro, true);
            fich = new PrintWriter(ou);
            fich.println("lun++++s"); // escribo
            fich.println("maertes");
            fich.println("mercoles");

        } catch (IOException ex) {
            System.out.println("erro escritura: " + ex.getMessage());

        } finally {
            fich.close();
        }
    }
}
