/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author dam1
 */
public interface Interfaz {
    public void algo();
    public default void algo2(){
        System.out.println("Hola");
    }
}
