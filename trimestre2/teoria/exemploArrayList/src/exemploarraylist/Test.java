/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploarraylist;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
   
        distintosTipos obx = new distintosTipos();
        obx.crear();
        

        mismosTipos obx2 = new mismosTipos();
        obx2.engadir();
        obx2.amosar();

        // EJERCICIOS
        // 1.
        System.out.println("**AÑADIR ELEMENTO POR POSICION**");
        mostrarArrayAntes(obx2);
        obx2.engadirNumero(2, 2);
        mostrarArrayDespues(obx2);
        // 2. 
        System.out.println("**ELIMINAR POR POSICION**");
        mostrarArrayAntes(obx2);
        obx2.eliminarPorPosicion(1);
        mostrarArrayDespues(obx2);
        // 3. 
        System.out.println("**BUSCA UN ELEMENTO**");
        mostrarArrayAntes(obx2);
        obx2.verElemento(5);
        System.out.println("");
        // 4,6. borrar el 5
        System.out.println("**BORRA POR ELEMENTO**");
        mostrarArrayAntes(obx2);
        obx2.borrarPorElemento(2);
        mostrarArrayDespues(obx2);
        // otra forma para borrar
        System.out.println("**BORRA POR ELEMENTO - 2 FORMA**");
        mostrarArrayAntes(obx2);
        obx2.borrarPorNumero_v2(1);
        mostrarArrayDespues(obx2);
        // el 5 no lo hice por que es similar al 1
        
        
    }
    
    public static void mostrarArrayAntes (mismosTipos obx2) {
        System.out.println("antes: ");
        obx2.amosar();
    }
    public static void mostrarArrayDespues (mismosTipos obx2) {
        System.out.println("despues: ");
        obx2.amosar();
        System.out.println("");
    }
    

}
