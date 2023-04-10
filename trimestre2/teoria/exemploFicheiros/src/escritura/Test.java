/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escritura;

import escritura.EscribirFicheiros;
import java.io.File;
import lectura.LerFicheiros;

public class Test {

    public static void main(String[] args) {
        // si tengo fichero en la misma ruta
//        File f = new File("numeros");
//        LerFicheiros=new LerFicheiros();
//        System.out.println(dato);

        EscribirFicheiros es = new EscribirFicheiros();
        File f = new File("dia.text"); // se crea fichero con ese nombre con lo que hemos escrito dentro
        es.escribirPalabras(f);

        // Ahora tendriamos que leer el codigo con el metodo correspondiente
        /*
        esto no lo tengo ya que ese dia que habia hecho el codigo de leer fichero
        no estaba en clase
        ya lo importe todo creo
        */
        
        // cambiando al de engadir, en vez de sobreescribir va a engadir
//        LerFicheiros obxLer = new LerFicheiros();
//        obxLer.lerPalabras(f, "\n");
//        System.out.println("");
//        
        
        // ahora engadimos en vez de sobreescribir aunque no lo entinedo muy biern
//        es.engadirPalabras(f);
//        obxLer.lerPalabras(f, "\n");
    }

}
