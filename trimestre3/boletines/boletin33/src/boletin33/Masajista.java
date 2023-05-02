/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin33;

/**
 *
 * @author dam1
 */
public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private Integer aniosExperiencia;

    @Override
    public void concentrarse() {
        System.out.println("concentrase o masajista");
    }

    @Override
    public void viajar() {
        System.out.println("viaja o masajista");
    }

    @Override
    public void entrenar() {
        System.out.println("masajista non entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("masajista non xoga partidos");
    }
    
    public void darMasaje(){
        System.out.println("da masaje o masajista");
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Masajista{");
        sb.append("titulacion=").append(titulacion);
        sb.append(", aniosExperiencia=").append(aniosExperiencia);
        sb.append(", =").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
