/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Colecciones con distintos tipos
 *
 * @author dam1
 */
public class mismosTipos {
    
    /**
     * declaramos la coleccion que almacena SOLO enteros. 
     * Especifico que el tipo de objeto es Integer???
     */
    ArrayList<Integer> listaEnteiros = new ArrayList<Integer>();
    
    /**
     * metodo que añade los elementos de tipo int
     */
    public void engadir() {
        listaEnteiros.add(2);
        // listaEnteiros.add("bbb"); // no me deja pq le estoy especificando el tipo?? SI
        listaEnteiros.add(3);
        listaEnteiros.add(5);
        listaEnteiros.add(1);
    }

    public void amosar() {
        System.out.println(listaEnteiros); // al ser Integer te da el toString por eso no imprime direccion?
    }

    /**
     * engade numero en posicion especifica
     *
     * @param numero
     */
    public void engadirNumero(int elemento, int posicion) {
        listaEnteiros.add(posicion, elemento);
    }

    /**
     * remueve en una posicion determinada
     *
     * @param posicion
     */
    public void eliminarPorPosicion(int posicion) {
        listaEnteiros.remove(posicion);
    }

    /**
     * busca elementos en la array
     *
     * @param elemento
     */
    public void verElemento(int elemento) {
        int posicion = listaEnteiros.indexOf(elemento);
        if (posicion != -1) {
            System.out.println("El numero se encuentra en la posicion = " + (posicion + 1));
        } else {
            System.out.println("El numero buscado no se encuentra en la Array");
        }
    }

    /**
     * elimimar en funcion del elemento.
     * <indexOf> devuelve el indice del ele encontrado, si no lo encuentra devuelve -1
     * 
     * @param elemento que queremos borrar
     */
    public void borrarPorElemento(int elemento) {
        int comprobar = 0; // para comprobar si entra en el if
        int posicion;
        do {
            posicion = listaEnteiros.indexOf(elemento);
            if (posicion != -1) { // si encuentra el numero
                eliminarPorPosicion(posicion);
                comprobar = 1; //
            }
            
        } while (posicion != -1);
        
        if (comprobar == 0) { // si no encuentra la var seguira siendo cero
            System.out.println("El numero introducido no ha sido encontrado");
        }   
    }
    /**
     * elimimar en funcion del elemento, se itera por cada ele duplicado - 2 FORMA
     *  si no lo encuentra no imprime nada
     * {@link Iterator}
     * <code>.hasNext()</code> devuelve {@code true} si la iteracion tiene mas ele
     * <code>.next()</code> en el momento en el que encuentra el elemento lo devuelve
     * @param elemento a borrar
     */
    public void borrarPorNumero_v2 (int elemento){
        Iterator it = listaEnteiros.iterator();
        while (it.hasNext()) // devuelve true hasta que no encuentre ele
            if ((int)it.next()==elemento) // si el ele devuelvo es igual al pedido
                it.remove(); // lo borra
    }
    
    // OTROS METODOS DE NINA:...
    
    public void ordenar (){
        // Collections.sort(listaEnteiros,Collections.reverseOrder()); // lo ordena al reves
        Collections.sort(listaEnteiros);
    }
    
    public void borrar2 () {
        listaEnteiros.remove(Integer.valueOf(5));
    }
    

}
