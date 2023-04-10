/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploarraylist;

import java.util.ArrayList;

/**
 * colecciones que pueden contener datos de distintos tipos
 *
 * @author dam1
 */
public class distintosTipos {
    // TODAS LAS COLECCIONES SON DE OBJTOS Y NO DE DATOS PRIMITIVOS -->??

    /**
     * declaro una coleccion de la clase ArrayList.
     * Esta clase implementa la interfaz: List
     * Puedo meter cualquier tipo de datos
     * (creo que seria una mejor practica definir el tipo como: List)?
     */
    ArrayList lista = new ArrayList();

    /**
     * añado elementos int, double, String y character a la coleccion
     */
    public void crear() {
        lista.add(2);
        lista.add("aaa");
        lista.add(2.3);
        lista.add('b');
    }

    /**
     * visualizo los elementos de la coleecion
     * es la unica forma para visualizar elementos de distintos tipos??
     */
    public void ver() {
        for (int i= 0; i < lista.size(); i++){
            System.out.println(lista.get(i)); // me devuelve valor de cada elemento
        }
    }
    
    
}
