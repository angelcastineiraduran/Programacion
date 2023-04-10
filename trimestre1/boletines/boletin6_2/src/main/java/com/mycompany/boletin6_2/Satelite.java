
package com.mycompany.boletin6_2;

public class Satelite {
 
    private double meridiano ;
    private double paralelo;
    private double distanciaTerra ;
     
    public Satelite ( ) {
        //siempre de dereita a izq 
        meridiano = paralelo = distanciaTerra = 0;
    }
    
    public Satelite ( double m, double p, double d ){    
        this.meridiano = m ;
        this.paralelo = p;
        this.distanciaTerra = d ;
    }
    
    public void verPosicion ( ) {
        System.out.println (" o satelite atopase  no paralelo " + paralelo + " meridiano " + meridiano + " a unha distancia da terra " + distanciaTerra); 
    }
}
        

    


    


