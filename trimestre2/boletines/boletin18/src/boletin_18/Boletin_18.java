/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_18;

/**
 *
 * @author dam1
 */
public class Boletin_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConversorTemperaturas obx = new ConversorTemperaturas();
        try {
            float fharenheit = obx.centigradosAFharenheit(90.0f);
            System.out.println("fharenheit = " + fharenheit);
        } catch (TemperaturaErrada e) {
            System.out.println("aumentar temperatura" + e.toString());
        }
        try {
            obx.centigradosAReamur(90.0f);
        } catch (TemperaturaErrada e2) {
            System.out.println("aumentar temperatura" + e2.toString());
        }
    
    }
    
}
