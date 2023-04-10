/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin15;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Pelicula obxPeli = new Pelicula("BradPitt", "Cristina", "Tiburon", "Tarantino", "dvd", 3.0);
    Disco obxDisco = new Disco("rocck", "bohemian rapsody", "queen", "mp3", 4.0);
    

    
    System.out.println(obxDisco.toString());
    System.out.println(obxPeli.toString());
    
    }
    
    
}
