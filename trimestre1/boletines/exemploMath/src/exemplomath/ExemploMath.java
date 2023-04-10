package exemplomath;

import java.util.Scanner;

public class ExemploMath {
    public static void main(String[] args) {
        //calcular longitSud y area circunferencia
        Scanner obxScanner = new Scanner (System.in);
        System.out.println("introduce el radio");
        float radio = obxScanner.nextFloat();
        float longitudCircunferencia , areaCircunferencia;
        //hay que importar la clase Math con el metodo PI
        /*PI es estatica es una variable de clase no depende de los objetos, 
        no tengo que crear objetos. PI no lo tengo que instanciar*/
        /* Hay un problema ya que PI es de tipo double, 2 opciones:
        1. pasar la longitud como double;
        2. Hacer conversion de float a double, hacer un casteo;
        tengo que ponerlo entre parentesis todo lo que quiero convertir
        */
        longitudCircunferencia = (float) (radio*Math.PI);
        //vamos a ver si la libreria Math hay opcion para hacer potencia
        areaCircunferencia = (float) (Math.PI*Math.pow(radio, 2));
        System.out.println("longitud = " + longitudCircunferencia +
                "\n area = " + areaCircunferencia);
    }
    
}
