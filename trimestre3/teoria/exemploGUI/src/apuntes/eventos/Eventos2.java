/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes.eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * añadimos mas objetos fuente del mismo tipo 
 * @author ubuntu
 */
public class Eventos2 {

    public static void main(String[] args) {
        MiMarco miMarco = new MiMarco();
    }
}

class MiMarco extends JFrame {

    MiPanel miPanel;

    public MiMarco() {
        miPanel = new MiPanel();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        this.setSize(500, 300);
        this.add(miPanel);
    }
}
class MiPanel extends JPanel implements ActionListener{ 
    JButton boton = new JButton("Rojo");
    JButton botonAmarillo = new JButton("amari");
    JButton botonAzul = new JButton("azul");

    public MiPanel() {
//////        boton = new JButton("Rojo");
//////        botonAmarillo = new JButton("Amarillo");
//////        botonAzul = new JButton("Azul");
        this.add(boton);
        this.add(botonAmarillo);
        this.add(botonAzul);
        
        boton.addActionListener(this); 
        botonAmarillo.addActionListener(this); 
        botonAzul.addActionListener(this); 
    }
    
    /**
     * Va a recibir un objeto de tipo ActionEvent, pero NO va a saber de quien lo recibe
     * @param e 
     */
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object botonPulsado = e.getSource(); // nos devuelve que boton es el pulsado
        if(botonPulsado == boton){
            setBackground(Color.red);
        } else if(botonPulsado == botonAmarillo){
            setBackground( Color.yellow);
        } else if(botonPulsado == botonAzul){
            setBackground(Color.blue);
        }
    }
    
}
