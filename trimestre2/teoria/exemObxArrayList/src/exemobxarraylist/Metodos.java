/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemobxarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import nosaLibreria.PedirDatos;

/**
 * clase para probar distintos metodos aplicados a una Coleccion de ele
 * 
 * @author dam1
 */
public class Metodos {
    /**
     * Metodo que crea una coleccion con datos de tipo Xogador
     * Cada vez que se ejecuta el cuerpo se le pide al usu un nombre y un dorsal
     * que corresponden al objeto Xogador que se esta creando en ese momento.
     * Una vez creado el objeto, se aniade a la coleccion
     * 
     * @param lista coleccion que le tenemos que pasar
     * @return coleccion que he creado en el propio metodo
     */
    public ArrayList<Xogador> engadir(ArrayList<Xogador> lista) {
        // Primer metodo
//        Xogador xo = new Xogador (PedirDatos.pedirString("nome"),
//                PedirDatos.pedirInt("dorsal"));
//        lista.add(xo);
        // Segundo metodo
        lista.add(new Xogador(PedirDatos.pedirString("nome"),
                PedirDatos.pedirInt("dorsal")));
        return lista;
    }
    /**
     * imprime la coleecion
     * 
     * @param lista coleccion de tipo Xogador
     */
    public void amosar1(ArrayList<Xogador> lista) {
        System.out.println(lista);
    }
    
    /**
     * imprime la coleccion utilizando un for each
     * 
     * @param lista 
     */
    public void amosar2(ArrayList<Xogador> lista) {
        //for each. recorre la lista y los objetos los mete en elemento
        for (Xogador elemento : lista) {
            System.out.println(elemento);
        }
    }
    /**
     * imprime la coleccion usando un for normal
     * 
     * @param lista 
     */
    public void amosar3(ArrayList<Xogador> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));

        }
    }
    /**
     * Iterator: esta clase nos sirve para iterar. siempre que queramos 
     * borrar un elemento de una colecccion debemos usar este
     * 
     * @param lista 
     */
    public void amosar4(ArrayList<Xogador> lista) {
        Iterator it = lista.iterator();
        // cada vez que haya algo se itera:
        while (it.hasNext()) {//me devuelve un boolean para saber si se acabo o no
            Xogador aux = (Xogador) it.next();//me devuelve un objeto de tipo Object --> downcasting
            System.out.println(aux);
//            System.out.println(it.next()); // otra opcion sin hacer cast
        }
    }
    
    /**
     * Metodo que busca un obj de tipo Xogador en una collecion
     * Iteramos los objeto de "list" y si encontramos un dorsal igual al introducido 
     * por el ususrio cambiamos la var de atopado
     *
     * next() devuelve un obj de tipo Object por eso hay que castearlo y guardarlo
     * una variable para que podemos acceder al atributo "dorsal" de ese objeto
     * 
     * @param lista
     * @param mensaje
     * @return no se para que devuelve nada ?? creo que no es necesario -> para luego poder utilizarla
     * en otros metodos como el de eliminar
     */
    public int buscar(ArrayList<Xogador> lista, String mensaje) {
        int dorsal = PedirDatos.pedirInt(mensaje); // pedimos mensaje a usu
        Iterator it = lista.iterator(); // creamos obj para iterar
        Xogador aux = null; // inicalizamos la var de tipo Xogador con null para poder utilizarla??? no me da error si lo quito
        int atopado = 0; // tengo que inicializarla para poder utilizarla en return
        while (it.hasNext()) { // mientras haya elemento devuelve true
            aux = (Xogador) it.next();  // se le asigna un elemento obj de tipo Xogador
            if (aux.getDorsal() == dorsal) { // devuelve dorsal del jugador, si es igual entra
                System.out.println(aux.getNome()); // imprime nombre jugador encontrado
                atopado = 1; // si lo encuentra
            }
        }
        if (atopado == 0) { // si nunca entrase en el if
            System.out.println("Xogador no encontrado");
        }
        return atopado;
    }
    /**
     * Buscamos por "dorsal" el jugador. Si lo encuentra nos dice el nombre del mismo
     * y devuelve un 1 que indica que se ha encontrado.
     * En el if buscamos al jugador igual que antes pero en vez d por el dorsal 
     * lo buscamos por el nombre. Si lo encuentra lo borra
     * 
     * @param lista
     * @param mensaje 
     */
    public void eliminar(ArrayList<Xogador> lista, String mensaje) {
        int atopado = buscar(lista, mensaje); // utlizamos metodo buscar de arriba
        if (atopado == 1) { // si lo encuentra entra
            String nome = PedirDatos.pedirString("Nome xogador a eliminar");
            Iterator it = lista.iterator(); // para iterar la lista
            Xogador xo; // creamos la var que se va a iterar
            while (it.hasNext()) {  // devuelve true si hay ele
                xo = (Xogador) it.next(); // devuelve el ele 
                if (xo.getNome().equalsIgnoreCase(nome)) { // devuelve el nombre y comparamos
                    it.remove();
                }
            }
        }

    }
    
    
    
    public void ordenar (ArrayList<Xogador>lista){
        Collections.sort(lista);
    }

}
