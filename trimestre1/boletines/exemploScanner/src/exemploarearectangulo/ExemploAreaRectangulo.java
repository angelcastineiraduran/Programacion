
package exemploarearectangulo;

public class ExemploAreaRectangulo {
    float resultado; //variable que me sirve para todos los metodos

    public static void main(String[] args) {
        //proyecto area del rectangulo
        //float base = 2 el int no me da problemas por que es un int que cabe en float
        //la altura si por que un double no cabe en float
        float base = 2f , altura = 5.0f , area; // variables locais, morren al acabar o metodo
        area = base * altura;
        System.out.println("area = " + area);   
    }
    
}
