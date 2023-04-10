package com.mycompany.exemploobxectos;

public class Rectangulo {
    
    //declaro atributos
    //aun asi puedo utilizar los metodos sin tener que declararlos
    private float base;
    private float altura;
    
    //defino metodos
    public float calcularArea ( float b, float a) {
        float area = b * a;
        return area;
    }
    
    public void calcularPerimetro ( float b, float a ) {
        float peri = 2 * b + 2 * a;
        System.out.println("perimetro = " + peri);/*Solo lo pongo para
        visualizarlo, aunque podria no poner nada pero no lo veria
        */
        
        //otra opcion
//    public void calcularPerimetro ( float b, float a ) {
//        System.out.println("perimetro = " + (2 * b + 2 * a) );
        
    }
    
    
     //constructores
    public Rectangulo(float ba, float al){//construc parametrizado
        base = ba;
        altura = al;
    }
    
    public Rectangulo(){//const vacio
        
    }
    
    //metodos de acceso getter e setters
    public void darValorAltura(float al){//equivale a setAltura
        altura = al;
    }
    
    public float devolverValorAltura(){//equivale a getAltura
        return altura;
    }
    
    public void setBase(float bas){//base de atributo
        base = bas;//base que recibo
    }
    //tambien se puede poner de esta forma
//    public void setBase(float base){//base de atributo
//        this.base = base;//base que recibo
//    }
    
    public float getBase(){
        return base;
    }
    
}
