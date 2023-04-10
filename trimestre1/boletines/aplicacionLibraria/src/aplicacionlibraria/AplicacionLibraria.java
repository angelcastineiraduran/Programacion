/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacionlibraria;

//import com.nina.datos.PedirDatos;

import com.nina.datos.PedirDatos;


public class AplicacionLibraria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String valor = PedirDatos.pedirString("teclea nome : ");
        /*
        para poder utilizar el metodo de la clase que esta en otro paquete
        tengo que importar el paquete pero antes hay que hacer un paso.
        1-tengo que crear el jar del proyecto que queremos importar
        2-carpeta libreria etc
        3-
        */
        System.out.println(valor);


    }
    
}
