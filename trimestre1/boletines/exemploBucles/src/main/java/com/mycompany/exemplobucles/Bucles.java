
package com.mycompany.exemplobucles;

import javax.swing.*;



public class Bucles {
    /*Escribe un programa que sume 5 numero enteiros 
    que pedimos por teclado
    */
   
    int i = 0;
    
    /*los metodos que mas utilizo los pongo en static para no tener que 
    crear un objeto cada vez que los quiero utilizar*/
    
    //no lo pongo el void porque luego quiero utilizar esa variable
    public static int pedirEnteros(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        
    }
    
    public void metodoWhile () {
        int acumulador = 0;
        while (i < 5){
            int numero = Bucles.pedirEnteros("teclee un numero para metodo while");
            acumulador = acumulador + numero;
            i++;
        }
        System.out.println("acumulador de while= " + acumulador);
        //esto lo hago para que en la main pueda hacer mas whiles con la variable i
        i = 0;
    }
    
    public void metodoDoWhile() {
        int acumulador = 0;
        do {
            int numero = Bucles.pedirEnteros("teclee un numero para metodo dowhile");
            acumulador = acumulador + numero;
            i++;
        }while(i < 5);
        System.out.println("acumulador de dowhile = " + acumulador);
        //esto lo hago para que en la main pueda hacer mas whiles con la variable i
        i = 0;
    }
    
    public void metodFor(){
        int acumulador = 0;
        for (i = 0; i < 5; i++){
            int numero = Bucles.pedirEnteros("teclee el numero para metodo for");
            acumulador = acumulador + numero;
        }
        System.out.println("acumulador de for = " + acumulador);
    }
}
