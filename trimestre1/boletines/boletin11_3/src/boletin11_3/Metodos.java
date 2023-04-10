/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin11_3;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Metodos {
        //variables
    int base, altura;
    boolean condicion;
    int numero;

    public int pedirEnteros(String mensaje) {
        this.numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return this.numero;
    }

    public boolean getCondicion(){
        /*realmente lo mejor seria hacer la condicion uno por uno en vez de a la vez
        ya que si tengo algo mal me vuelve a pedir todo otra vez. hacer mejor un metodo
        que valide los numeros negativos y lo uso para las dos condiciones
        */
        this.condicion = base >=0 & altura >= 0;
        return this.condicion;
    }

    public int getArea(){
        int area = this.base * this.altura;
        return area;
    }

    //bucle: numeros incorrectos los vuelve a pedir
    public int pedirNumerosCorrectos() {
        this.base = pedirEnteros("Introducir base");
        this.altura = pedirEnteros("Introducir altura");
        while (!getCondicion()) {
            System.out.println("Numeros introducidos incorrectos");
            this.altura = pedirEnteros("Volver a introducir la altura");
            this.base = pedirEnteros("Volver a introducir la base");
        }
        System.out.println("Numeros enteros correctos");
        int area = getArea();
        return area;

    }
    
}
