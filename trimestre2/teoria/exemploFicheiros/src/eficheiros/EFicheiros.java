/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eficheiros;

import java.io.File;
import lectura.LerFicheiros;

/**
 *
 * @author dam1
 */
public class EFicheiros {

    /**
     * previamente crear fichero: ficherosNumeros.txt
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * creo objeto file y le adjudico un path
         */
        File f = new File(
                "ficherosNumeros.txt");
        
        // objeto que sera utilizado por los 2 metodos siguientes
        // LerFicheiros obx = new LerFicheiros();
        
        /**
         * --Por palabras--
         * lee contenido fichero y cada vez que encuentra una coma lo considera
         * el final de una palabra
         */
//        obx.lerPalabras(f,",");

        /**
         * --Por lineas (creo)--
         * lee tal cual el contenido del fichero
         */
//        obx.lerLiñas(f);
        
        // ArrayList
//        File n = new File("numeros2.txt");
//        LerFicheiros obx = new LerFicheiros();
//        obx.lerNumero(n);
        
        
        // arrayList teniendo fichero con comas
//        File n = new File("numeros3.txt");
//        LerFicheiros obx = new LerFicheiros();
//        
//        obx.lerNumeroDelimitadores(n);
//        
        // lee objectos
        File al = new File("alumnos.txt");
        LerFicheiros obx = new LerFicheiros();
        
        obx.lerObxecto(al);
        
//        File n = new File("/home/dam1/Documentos/ficherosProg/probaNumeros.txt");
//        LerFicheiros obx = new LerFicheiros();
//        
//        obx.lerPalabras(n, " ");
    }
    
}