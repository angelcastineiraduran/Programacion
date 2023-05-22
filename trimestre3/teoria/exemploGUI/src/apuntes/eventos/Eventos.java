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
 *
 * @author ubuntu
 */
public class Eventos {

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
// ANTES:
//class MiPanel extends JPanel { // 2. Porque el oyente tiene que implementar el ActionListener
// DESPUES:
class MiPanel extends JPanel implements ActionListener{ 
    JButton boton;

    public MiPanel() {
        boton = new JButton("Azul");
        this.add(boton);
        
        boton.addActionListener(this); // 1. Añadimos el action listener y nos da error --> paso 2
    }
    
    // 3. sobreescribimos metodos obligatoriamente de la interfaz implemetada
    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(Color.red);
    }
}
