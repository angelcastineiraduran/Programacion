package exemplomath;

import java.util.Scanner;

public class ExemploMath2 {
    //declaramos cte
    /*
    La declaramos arriba por que es estatica por tanto no puede estar dentro de
    un metodo main
    */
    public static final double PI = 3.14;
    public static void main(String[] args) {
        //calcular longitSud y area circunferencia
        Scanner obxScanner = new Scanner (System.in);
        System.out.println("introduce el radio");
        float radio = obxScanner.nextFloat();
        float longitudCircunferencia , areaCircunferencia;
        longitudCircunferencia = (float) (radio*PI );
        areaCircunferencia = (float) ( PI*Math.pow(radio, 2));
        System.out.println("longitud = " + longitudCircunferencia +
                "\n area = " + areaCircunferencia);
    }
    
}
