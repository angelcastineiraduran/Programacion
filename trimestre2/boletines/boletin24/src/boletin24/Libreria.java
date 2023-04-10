/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin24;

import java.util.ArrayList;
import nosaLibreria.PedirDatos;

/**
 *
 * @author dam1
 */
public class Libreria {

    String pedirTitulo = "Escribe titulo del libro";
    String pedirAutor = "Escribe el autor del libro";
    String pedirIsbn = "Escribe el ISBN del libro";
    String pedirPrezo = "Escribe el precio del libro";
    String menDisponible = "El libro buscado está disponible";
    String preguntaBorrar = "¿Estas seguro de borrar el libro?\n1--> BORRAR\n0--> CANCELAR";
    String malIntroducido = "Opcion introducida incorrecta";

    Libro libroEncontrado = null;
    
    public void engadir(ArrayList<Libro> lista) {
        lista.add(new Libro(PedirDatos.pedirString(pedirTitulo),
                PedirDatos.pedirString(pedirAutor), PedirDatos.pedirString(pedirIsbn),
                PedirDatos.pedirFloat(pedirPrezo)));
    }

    public void amosar(ArrayList<Libro> lista) {
        for (Libro elemento : lista) {
            System.out.println(elemento);

        }
    }

    public void vender(ArrayList<Libro> lista) {
        boolean encontrado = buscar(lista);
        int opcion = PedirDatos.pedirInt(preguntaBorrar);
        switch (opcion){
            case 1:
                if (encontrado == false) {
                    System.out.println("no se puede borrar porque no esta disponible");
                } else {
                    lista.remove(libroEncontrado);
                    System.out.println("******borrrado******");
                }
                
                break;
            case 0:
                System.out.println("-----operacion cancelada-----");
                break;
            default: 
                System.out.println(this.malIntroducido);
   
        }
    }

    public boolean buscar(ArrayList<Libro> lista) {
        String titulo = PedirDatos.pedirString(pedirTitulo);
        boolean encontrado = false;
        for (Libro elemento : lista) {
            if (titulo.equalsIgnoreCase(elemento.getTitulo())) {
                System.out.println(menDisponible);
                System.out.println(elemento);
                libroEncontrado = elemento;
                encontrado = true;
            } else {
                System.out.println("libro no encontrado");
            }
                
        }
        return encontrado;

    }
}
 