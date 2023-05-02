/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin33;

/**
 * con esta clase observamos que un mismo metodo que recibe un tipo padre puede ejecutar
 * distintos distintos metodos en funcion del objeto hijo que albergue
 * 
 * no deberiamos crear un metodo que reflejo los metodos especificos de cada objeto hijo?? NO
 * ya que el objetivo de este boletin es observar el fenome explicado arriba y no 
 * reflejar los metodos especificos de cada clase, si no los comunes que pueden variar
 * 
 * @author dam1
 */
public class Boletin33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SeleccionFutbol seleccionFutbol;
        
        System.out.println("**entrenador**");
        seleccionFutbol = new Entrenador();
        chamadas(seleccionFutbol);
        System.out.println("");
        
        System.out.println("**masajista**");
        seleccionFutbol = new Masajista();
        chamadas(seleccionFutbol);
        System.out.println("");
        
        System.out.println("**seleccionador**");
        seleccionFutbol = new Seleccionador();
        chamadas(seleccionFutbol);
        System.out.println("");
        
        System.out.println("**futbolista**");
        seleccionFutbol = new Futbolista();
        chamadas(seleccionFutbol);
        System.out.println("");

    }
    
    /**
     * utilizamos este metodo para reflejar los metodos de este tipo que van a ser 
     * distintos en funcion del objeto que creemos. De esta forma reflejariamos el 
     * polimorfismo
     * @param seleccionFutbol 
     */
    public static void chamadas(SeleccionFutbol seleccionFutbol){
        seleccionFutbol.concentrarse();
        seleccionFutbol.entrenar();
        seleccionFutbol.viajar();
        seleccionFutbol.jugarPartido();
        seleccionFutbol.toString();
    }
    
}
