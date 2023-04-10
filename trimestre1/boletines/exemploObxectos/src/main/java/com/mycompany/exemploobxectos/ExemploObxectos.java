
package com.mycompany.exemploobxectos;

public class ExemploObxectos {

    public static void main(String[] args) {
        
        Rectangulo obxRec = new Rectangulo();
        //no es necesario poner 2f porque un int cabe en un float
        float resultado = obxRec.calcularArea(2, 3.0f);
        System.out.println("resultado = " + resultado);
        
        /*float resultado2 = obxRec.calcularPerimetro(3, 5); asi no se puede
        ya que es void no le puedo asignar ninguna variable
        */
        obxRec.calcularPerimetro(3, 5);
        //no hace falta poner lo de println por que ya lo pongo en el metodo
        
        //instancio obxecto tipo rectangulo co constructor parametrizado
        Rectangulo obxRec2 = new Rectangulo(5, 8);
        float base = obxRec2.getBase();
        float altura = obxRec2.devolverValorAltura();
        
        float re = obxRec2.calcularArea(base, altura);
        System.out.println("novo area = " + re);
        
        //obxRec2.calcularArea(resultado, resultado)
                /*
                no puedo utilizar este metodo si no tengo creadas las variables
                de base y altura
                */
        
    }
}
