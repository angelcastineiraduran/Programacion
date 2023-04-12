/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin28;

import paneles.Componentes;

/**
 *
 * @author dam1
 */
public class Interfaz {
    Componentes componentes = new Componentes();
    public void crearGUI() {
        componentes.definirComponentes();
        componentes.caracteristicasComponentes();
        componentes.aniadirComponentes();
        componentes.aniadirPanel();
    }
    
}
