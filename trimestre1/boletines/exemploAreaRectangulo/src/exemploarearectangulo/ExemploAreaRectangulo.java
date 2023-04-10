package exemploarearectangulo;
//añadimos el paquete util donde se encuentra la clase scanner
import java.util.Scanner;

public class ExemploAreaRectangulo {

    public static void main(String[] args) {
      float base , altura;
        //instanciamos un obxeto de tipo Scanner con new
        Scanner obxScanner = new Scanner (System.in);
        //ahora elegimos como nos va a devolver el dato y guardamos
        System.out.println("Teclee base");
        base = obxScanner.nextFloat();
        System.out.println("Teclee altura");
        altura = obxScanner.nextFloat();
        float area = base * altura;
        System.out.println("area = " + area);
      
    }
}  
