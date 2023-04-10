/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin15;

/**
 *
 * @author dam1
 */
public class Pelicula extends Multimedia{
    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula() {
        super();
    }

    public Pelicula(String actorPrincipal, String actrizPrincipal, String titulo, String autor, String formato, double duracion) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }

    @Override
    public String toString() {
        return super.toString() + "Pelicula{" + "actorPrincipal=" + actorPrincipal + ", actrizPrincipal=" + actrizPrincipal + '}';
    }
    
    

    
    
    
}
