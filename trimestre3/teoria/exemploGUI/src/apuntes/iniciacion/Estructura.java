/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes.iniciacion;

/**
 *
 * @author ubuntu
 */
import javax.swing.*;
public class Estructura {
    public static void main(String[] args) {
        // CODIGO PILDORAS
        //MiMarco miMarco = new MiMarco();
        
        MiMarco_vNina miMarco_vNina = new MiMarco_vNina();
        miMarco_vNina.iniciarComponentes();
        
    }
    
}

class MiMarco extends JFrame{
    MiPanel miPanel = new MiPanel();
    public MiMarco(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(this);
        add(miPanel);

    }
}

class MiPanel extends JPanel{
    JButton boton = new JButton("Azul");
    public MiPanel(){
        add(boton);
    }
}


class MiMarco_vNina {
    JFrame marco;
    JPanel panel;
    JButton boton;
    
    public void iniciarComponentes(){
        iniciar();
        panel.add(boton);
        marco.add(panel);
        cerrar();
    }
    
    public void iniciar(){
        marco = new JFrame();
        panel = new JPanel();
        boton = new JButton("Azul");
        marco.setSize(500, 300);
    }
    
    public void cerrar(){
        marco.setDefaultCloseOperation(3);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
    }
}

