/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin33;

/**
 *
 * @author dam1
 */
public class Seleccionador extends SeleccionFutbol{

    @Override
    public void concentrarse() {
        System.out.println("concentrase en seleccionar bos xogadores");
    }

    @Override
    public void viajar() {
        System.out.println("viaja para seleccinar xogadores");
    }

    @Override
    public void entrenar() {
        System.out.println("seleccionador no entrena cos xogadores");
    }

    @Override
    public void jugarPartido() {
        System.out.println("seleccionador no xoga os partidos");
    }
    
    public void seleccionarXogador(){
        System.out.println("selecciona xogador");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Seleccionador{");
        sb.append(", =").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
