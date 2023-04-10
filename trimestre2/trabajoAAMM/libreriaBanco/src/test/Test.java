package test;

import Libreria.ValidacionDato;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {

        Integer n= ValidacionDato.validarEntero("puedes introducir");
        System.out.println(n);
        //String nombre=ValidacionDato.validarString("introduce nombre");
        //System.out.println(nombre);
        //Integer numero=ValidacionDato.validarEntero("·");
        //System.out.println(numero);

        /*Double numero2=ValidacionDato.validarDouble("ijaeife");
        System.out.println("numero2 = " + numero2);*/

       /* String dato =PedirDatos.pedirCadena("");
        System.out.println("dato = " + dato);*/
    }
}
