/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin33;

/**
 *
 * @author dam1
 */
public class Futbolista extends SeleccionFutbol{
    private Integer dorsal;
    private String demarcacion;

    @Override
    public void concentrarse() {
        System.out.println("concentrase o futbolista");
    }

    @Override
    public void viajar() {
        System.out.println("viaja o futbolista");
    }

    @Override
    public void entrenar() {
        System.out.println("entrena o futbolista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("xoga o futbolista");
    }
    
    public void entrevista(){
        System.out.println("Entrevista o futbolista");
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Futbolista{");
        sb.append("dorsal=").append(dorsal);
        sb.append(", demarcacion=").append(demarcacion);
        sb.append(", =").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
   
    
}
