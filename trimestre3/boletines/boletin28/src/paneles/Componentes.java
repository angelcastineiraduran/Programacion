/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paneles;

import javax.swing.*;

/**
 *
 * @author dam1
 */
public class Componentes {
    JFrame marco;
    JPanel panel;
    JButton premer, limpiar;
    JTextField nome;
    JPasswordField password;
    JLabel passwordTexto, nomeTexto;
    JTextArea areaTexto;
    
    public void definirComponentes() {
        marco = new JFrame();
        panel = new JPanel();
        premer = new JButton("premer");
        limpiar = new JButton("limpiar");
        nome = new JTextField();
        password = new JPasswordField();
        nomeTexto = new JLabel("NOME");
        passwordTexto = new JLabel("PASSWORD");
        areaTexto = new JTextArea("Area de texto");
    }
    
    public void caracteristicasComponentes() {
        marco.setBounds(0, 0, 800, 800);
        panel.setBounds(5, 5, 750, 750);
        areaTexto.setBounds(100, 300, 500, 200);
        nome.setBounds(300, 100, 200, 50);
        password.setBounds(300, 200, 200, 50);
        nomeTexto.setBounds(100, 100, 200, 50);
        passwordTexto.setBounds(100, 200, 200, 50);
        premer.setBounds(100, 600, 100, 50);
        limpiar.setBounds(400, 600, 100, 50);
    }
    
    public void aniadirComponentes() {
        panel.setLayout(null);
        panel.add(areaTexto);
        panel.add(nome);
        panel.add(password);
        panel.add(nomeTexto);
        panel.add(passwordTexto);
        panel.add(premer);
        panel.add(limpiar);
    }
    
    public void aniadirPanel() {
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
}
