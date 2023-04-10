/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenprogramacionpractico;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class CastineiraAngel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FeiraCoches coche1 = new FeiraCoches();
        
        // creo la variable que me introduce en el bucle
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Itroducir un numero"));
        do {
            System.out.println("Coche sen desconto:");
            coche1.setObxecto(new Coche("CitroenC4", 7000)); 
            coche1.amosar();
            System.out.println("\nCoche con desconto:");
            coche1.baixaPrezo(15);
            coche1.amosar();
            // Creo esta variable para no hacerlo tan largo
            float prezoComprador = Float.parseFloat(JOptionPane.showInputDialog("Canto prezo estas disposto a pagar?"));
            if (coche1.getObxecto().getPrezo() > prezoComprador) {
                System.out.println("Non podes mercalo");
            } else {
                System.out.println("Podes mercalo");
            }

            numero = Integer.parseInt(JOptionPane.showInputDialog("Itroducir de nuevo un numero"));
            System.out.println("");
            
        } while (numero != 0);
        System.out.println("Programa finalizado");

    }

}
