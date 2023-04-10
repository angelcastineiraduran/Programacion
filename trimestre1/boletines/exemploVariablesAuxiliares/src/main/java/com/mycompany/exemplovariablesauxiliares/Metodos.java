
package com.mycompany.exemplovariablesauxiliares;

public class Metodos {
    int i = 0, acuPar = 0, acuImpar = 1;
    public void calcularParesImpares(int i){
    while 
            (i <= 10){
        if (i % 2 == 0){
            acuPar = acuPar + i;
        }
        else {
            acuImpar = acuImpar * i;
        }
        i++;
    }
    /*
    No deberia borrar las variables cuando se sale del if o del bucle while?
    no ya que la estoy declarando fuera, si la delarara dentro del if o del while
    las variables seria locales a esa funcion
    */
        System.out.println("acuPar = " + acuPar);
        System.out.println("acuImpar = " + acuImpar);
    }
    
}
