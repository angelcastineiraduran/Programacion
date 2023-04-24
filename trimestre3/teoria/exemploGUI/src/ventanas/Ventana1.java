/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

import javax.swing.JFrame;

public class Ventana1 {
    
    JFrame marco;
    public void iniciarVentana() {
        marco = new JFrame("Primeira ventana");
        marco.setSize(800, 400);
        marco.setLocationRelativeTo(marco); // me centra la ventana
        
        //lineas importantes
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
    } 
    
}
