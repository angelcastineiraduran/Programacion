/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploabstractas;

/**
 *
 * @author dam1
 */
public class ExemploAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("**rectangulo**");
        Rectangulo re = new Rectangulo(4, 2);
        System.out.println("area: " + re.calcularArea());
        System.out.println("peri: " + re.calcularPeri());
        
        System.out.println("**tringulo**");
        Triangulo tri = new Triangulo(5, 3);
        System.out.println("area: " + tri.calcularArea());
        System.out.println("peri: " + tri.calcularPeri());
        
        System.out.println("**rectangulo**");
        // FigurasXeometricas fi = new FigurasXeometricas (3, 6); // da error porque es abstracta
        FigurasXeometricas obxRec = new Rectangulo(4, 2); // forma correcta
        System.out.println("area: " + obxRec.calcularArea());
    }
    
}
