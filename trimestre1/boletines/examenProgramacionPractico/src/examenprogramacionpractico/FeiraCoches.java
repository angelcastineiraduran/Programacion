/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprogramacionpractico;

/**
 *
 * @author dam1
 */
public class FeiraCoches {

    private Coche obxecto;

    public void amosar() {
        System.out.println("O coche ten un prezo de: " + obxecto.getPrezo());
        System.out.println("A marca do coche é: " + obxecto.getMarca());
    }

    public float baixaPrezo(float porcentaxe) {
        obxecto.modificarPrezo(obxecto.getPrezo() - obxecto.getPrezo() * (porcentaxe / 100));
        return obxecto.getPrezo();

    }
    
    // Creo acceso a los metodos para poder acceder a ellos
    public Coche getObxecto() {
        return obxecto;
    }

    public void setObxecto(Coche obxecto) {
        this.obxecto = obxecto;
    }

}
