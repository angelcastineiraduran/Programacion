/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplomatriz;

/**
 *
 * @author dam1
 */
public class ExemploMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos obx = new Metodos();
        float notas[][] = obx.crearMatriz();
        obx.verMatriz();
        float media = obx.mediaMatriz();
        System.out.println("media = " + media);
        
        obx.sumaCol();
        
        
    }
    
}
