/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploabstractas;

import exemploabstractas.superClases.FigurasXeometricas;

/**
 *
 * @author dam1
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("**rectangulo**");
        Rectangulo re = new Rectangulo(4, 2);
        // FigurasXeometricas re = new Rectangulo(4, 2); // no podria implementar interfaces
        System.out.println("area: " + re.calcularArea());
        System.out.println("peri: " + re.calcularPeri());
        
        
        System.out.println("**tringulo**");
        Triangulo tri = new Triangulo(5, 3);
        System.out.println("area: " + tri.calcularArea());
        System.out.println("peri: " + tri.calcularPeri());
        
        
        System.out.println("**rectangulo**");
        // no puedo instancir una clase abs:
        // FigurasXeometricas fi = new FigurasXeometricas (3, 6); // da error porque es abstracta
        // si no voy a implementar la interfaz utilizo:
        FigurasXeometricas obxRec = new Rectangulo(4, 2); // forma correcta
        System.out.println("area: " + obxRec.calcularArea());
        
        // Nuevas aportaciones: 
        re.dibuxar();
        
        // si no utilizo las interfaces:
        FigurasXeometricas obxTri = new Triangulo(3, 0); // forma correcta
        int ob = 2;
        
    }
    
}
