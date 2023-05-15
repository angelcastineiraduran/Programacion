/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes.iniciacion;

/**
 *
 * @author ubuntu
 */
import java.awt.Frame;
import javax.swing.*; // IMPRESCINDIBLE

public class PrimerosPasos {
    public static void main(String[] args) {
        MiMarco miMarco = new MiMarco();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MiMarco extends JFrame{
    public MiMarco(){
        setSize(500, 300);
        //setLocation(200,300);
        setResizable(true);
        //setExtendedState(Frame.MAXIMIZED_BOTH);
        // otra posibilidad, definirlos en constructor
//        setVisible(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
    }
}