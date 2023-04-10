package Libreria;

import javax.swing.*;

public class ValidacionDatosRecibidos {
    static final String MENSAJE_ERROR="** Error: el formato introducido no es válido **";

    /**
     * pide entero y devuelve null si el formato no es valido o si el numero es negativo
     *
     * @param entero introducido por el usu
     * @return
     */
    public static Integer validarEntero(Integer entero) {
        try {
            if(ErroresDatos.contieneNegativo(Double.valueOf(entero)))
                return null;
            return entero;
        } catch(NumberFormatException ex) {
            System.out.println(MENSAJE_ERROR);
            return null;
        }

    }

    /**
     * Pide una cadena y comprueba si es valida
     * --me falta incorporar validacion de numeros---
     *
     * @param cadenaTexto introducida por el usu
     * @return null o String dependiende de si la cadena es valida
     */

    public static String validarCadena(String cadenaTexto) {
        try {
            if(ErroresDatos.contieneEnhe(cadenaTexto))
                return null;
            else if (ErroresDatos.contieneAcentos(cadenaTexto))
                return null;
            return cadenaTexto;
        } catch(Exception ex) {
            System.out.println(MENSAJE_ERROR);
            return null;
        }
    }

    public static Double validarDouble(Double decimal) {
        try {
            if(ErroresDatos.contieneNegativo(decimal))
                return null;
            return decimal;
        } catch(Exception ex) {
            System.out.println(MENSAJE_ERROR);
            return null;
        }
    }

}
