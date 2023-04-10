package Libreria;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ErroresDatos {



    static Pattern pattern_acentos = Pattern.compile("[áéíóú]");
    static Pattern pattern_acentosMayus = Pattern.compile("[ÁÉÍÓÚ]");
    static Pattern pattern_numeros = Pattern.compile("\\d");

    /**
     * recibe cadena de texto devuelve un booleano que depende de si la cadena tiene acento
     * @param cadenaTexto
     * @return true si hay acento y false si no tiene
     */
    public static boolean contieneAcentos(String cadenaTexto) {
        Matcher matcher = pattern_acentos.matcher(cadenaTexto);
        Matcher matcherMayus = pattern_acentosMayus.matcher(cadenaTexto);
        if(matcher.find() || matcherMayus.find()) {
            System.out.println("La cadena no puede contener un caracter acentuado");
            return true;
        }
        return false;
    }
    /**
     * recibe cadena de texto devuelve un booleano que depende de si la cadena tiene "ñ"
     * @param cadenaTexto
     * @return true si hay ñ y false si no tiene
     */
    public static boolean contieneEnhe(String cadenaTexto){
        if(cadenaTexto.contains("ñ") || cadenaTexto.contains("Ñ")) {
            System.out.println("El dato introducido no puede contener una 'ñ'");
            return true;
        }
        return false;
    }
    /*
    // de momento no funciona:
    public static boolean contieneNumero(String cadenaTexto){
        Matcher matcher = pattern_acentos.matcher(cadenaTexto);
        if (matcher.find()) {
            System.out.println("La cadena no puede contener números");
            return true;
        }
        return false;
    }
    */

    /**
     * valida si tiene numero negativo o no
     *
     * @param numero puse un tipo Double para que puedas validar cualquier numero
     * @return true si es numero negativo
     */
    public static boolean contieneNegativo(Double numero) {
        if (numero < 0.0) {
            System.out.println("No puedes introducir numeros negativos");
            return true;
        }
        return false;
    }
}
