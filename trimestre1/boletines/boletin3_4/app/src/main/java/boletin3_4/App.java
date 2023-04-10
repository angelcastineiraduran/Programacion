package boletin3_4;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introducir dinero en euros");
        int dinero = consola.nextInt();
        int billetes100 = dinero / 100; 
        System.out.println("billetes de 100 = " + billetes100);
        int resto100 = dinero % 100;
        int billetes20 = resto100 / 20;
        System.out.println("billetes de 20 = " + billetes20);
        //Esto son variable auxiliares
        int resto20 = resto100 % 20;
        int billetes5 = resto20 / 5;//int billetes5 = ( dinero % 100 % 20 ) / 5;
        System.out.println("billetes de 5 = " + billetes5);
        int resto5 = resto20 % 5;
        System.out.println("monedas de 1 = " + resto5);

    }
}
