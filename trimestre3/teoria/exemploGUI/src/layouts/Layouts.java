/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layouts;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author dam1
 */
public class Layouts {
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2, boton3, boton4, boton5;
    /**
     * metodo inicial para sabes como se hace 
     */
    public void distribuidorLayout() {
        boton1 = new JButton("BOTON1");
        boton2 = new JButton("BOTON2");
        boton3 = new JButton("BOTON3");
        boton4 = new JButton("BOTON4");
        boton5 = new JButton("BOTON5");
        
        panel = new JPanel();
        marco = new JFrame(" ** LAYOUTS ** ");
        marco.setSize(600, 400);
        
        panel.setLayout(new FlowLayout());
        
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        
        marco.setDefaultCloseOperation(3);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
        
    }
    
    /**
     * hace lo mismo que lo anterior pero de forma mas practica
     */
    public void distribuidorLayout_v2(){
        iniciarComponentes();
        panel.setLayout(new FlowLayout());
        
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        
        pecharVentana();
        
    }
    
    public void iniciarComponentes() {
        boton1 = new JButton("BOTON1");
        boton2 = new JButton("BOTON2");
        boton3 = new JButton("BOTON3");
        boton4 = new JButton("BOTON4");
        boton5 = new JButton("BOTON5");
        
        panel = new JPanel();
        marco = new JFrame(" ** LAYOUTS ** ");
        marco.setSize(600, 400);
    }
    
    public void pecharVentana(){
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
    }
    /**
     * metodo aplicando otro layout
     * tendra una distribucion vertical de los botones
     */
    public void distribuidorBoxLayout(){
        iniciarComponentes();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        pecharVentana();
    }
    
    public void distribucionBorderLayout(){
        iniciarComponentes();
        panel.setLayout(new BorderLayout());
        panel.add(boton1, BorderLayout.NORTH);
        panel.add(boton2, BorderLayout.SOUTH);
        panel.add(boton3, BorderLayout.CENTER);
        panel.add(boton4,  BorderLayout.EAST);
        panel.add(boton5,  BorderLayout.WEST);
        marco.add(panel);
        pecharVentana();
    }
    
    public void distribuidorGridLayout(){
        iniciarComponentes();
        panel.setLayout(new GridLayout(3,4));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        pecharVentana();
    }
    
    
}
