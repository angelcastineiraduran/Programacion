/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin24;

import java.util.ArrayList;
import nosaLibreria.PedirDatos;

/**
 *
 * @author dam1
 */
public class Boletin24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Libro> listaLibros = new ArrayList<>();

        Libreria obx = new Libreria();
        
        int opcion;
        do {
            opcion = PedirDatos.pedirInt("Introduce una de estas opciones\n"
                    + "1--> Crear lista\n2--> Amosar lista\n3--> Buscar libro"
                    + "\n4--> Elminar libro");
            switch (opcion) {
                case 1:
                    obx.engadir(listaLibros);
                    break;
                case 2:
                    obx.amosar(listaLibros);
                    break;
                case 3:
                    obx.buscar(listaLibros);
                    break;
                case 4:
                    obx.vender(listaLibros);
                    break;
                default:
                    System.out.println("numero introducido incorrecto");
                    
            }
        } while (opcion != 0);
        
    }

}
