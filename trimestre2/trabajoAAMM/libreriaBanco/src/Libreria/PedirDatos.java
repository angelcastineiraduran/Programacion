package Libreria;



import javax.swing.*;

public class PedirDatos {
    /*
   To do:
   Escribir en fichero un string ?
   Leer del Fichero ?
   ingresar dinero
   Validar DNI
   validar Correo

    */
    static String msg;


    //static Double decimal = Double.parseDouble(JOptionPane.showInputDialog(msg));
    static final String MENSAJE_ERROR="** Error: el formato introducido no es válido **";
    /**
     * pide entero y devuelve null si el formato no es valido o si el numero es negativo
     *
     * @param msg
     * @return
     */
    public static Integer pedirEntero(String msg) {
        Integer entero;
        try {
            entero=Integer.parseInt(JOptionPane.showInputDialog(msg));
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
     * @param msg mensaje que queremos que le aparezca al usario
     * @return null o String dependiende de si la cadena es valida
     */

    public static String pedirCadena(String msg) {
        String cadenaTexto;
        try {
            cadenaTexto = JOptionPane.showInputDialog(msg);
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

    public static Double pedirDouble(String msg) {
        Double decimal;
        try {
            decimal=Double.parseDouble(JOptionPane.showInputDialog(msg));
            if(ErroresDatos.contieneNegativo(decimal))
                return null;
            return decimal;
        } catch(Exception ex) {
            System.out.println(MENSAJE_ERROR);
            return null;
        }
    }


}
