/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package experimentosmios;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class ArrayEjemplo {

    public static void main(String[] args) {

        int eleEngadir = 3;
        int []lista = new int[4];
        for(int i = 0; i < lista.length; i++){
            lista[i] = Integer.parseInt(JOptionPane.showInputDialog("introducir val: "));
        }
        for(int i = 0; i < lista.length; i++){
            System.out.println("newLista[i] = " + lista[i]);
        }
        
//        lista [0]=1;
//        lista [1]=2;
//        lista [2]=7;
//        lista [3]=8;
        
        System.out.println("Engadimos elementos");
        
        int []newLista = new int[lista.length + 1]; // 5
        for (int i = 0; i < newLista.length; i++) { // 0,1,2,3,4
            if (i < lista.length){ // 0,1,2,3 // lengt = 4
                newLista[i] = lista[i];
            }
            else{
                newLista[i] = Integer.parseInt(JOptionPane.showInputDialog("introducir valor añadido: ")); // 4
            }

        }
        
        for(int i = 0; i < newLista.length; i++){
            System.out.println("newLista[i] = " + newLista[i]);
        }
    }
}
