/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin11_4;

/**
 *
 * @author dam1
 */
public class Boletin11_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Metodos obx = new Metodos();
        numero = obx.pedirEnteros("Introducir un numero del 1 al 10");
        /*habria que hacer tambien lo de salir con el cero y que se vuela a
        hasta que le de el valor cero
        */
        
        switch(numero){
            case 1:
                obx.multiplicaciones();
                break;
            case 2:
                obx.multiplicaciones();
                break;
            case 3:
                obx.multiplicaciones();
                break;
            case 4:
                obx.multiplicaciones();
                break;
            case 5:
                obx.multiplicaciones();
                break;
            case 6:
                obx.multiplicaciones();
                break;
            case 7:
                obx.multiplicaciones();
                break;
            case 8:
                obx.multiplicaciones();
                break;
            case 9:
                obx.multiplicaciones();
                break;
            case 10:
                obx.multiplicaciones();
                break;
                
        }
    }
    
}
