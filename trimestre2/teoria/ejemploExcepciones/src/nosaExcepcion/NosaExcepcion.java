/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nosaExcepcion;

/**
 * Creo mi propia clase para lanzar mis excepciones
 * 
 * @author dam1
 */

public class NosaExcepcion extends Exception{ // todas las excep extiendes de esta
    /**
     * estoy importanto el metodo constructor de Excepcion. Lo tengo que poner 
     * si luego quiero agregar un constructor parametrizado como en el de abajo.
     * ya que si no lo agrego no se creara el constructor por defecto y cuando
     * el compilador intente compilar no va a encontrarlo. NO estoy completamente seguro
     * pero la elimnacion del mismo puede causar errores en otras partes del codigo
     * entonces lo pongo
     * 
     */
    public NosaExcepcion(){
        super(); // si no lo pongo se agregará de manera implicita
    }
    
    // Crearemos el objeto de este constructor en la clase Dividir Excepciones
    public NosaExcepcion(String mensaxe){ // contstructor de mi clase 
        super(mensaxe); // normalmente se acompaña de un mensaje indicando que ocurre
    }
    
}
