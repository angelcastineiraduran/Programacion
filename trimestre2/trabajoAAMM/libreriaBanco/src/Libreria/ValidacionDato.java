package Libreria;

/**
 * clase que tiene metodos con bucles que se repiten cada vez que el formato instroducido no es valido
 */
public class ValidacionDato {
    final static String MENSAJE_INTRODUCIR_BIEN="Vuelve a introducir el dato pedido";

    public static Integer validarEntero(String msg) {
        Integer numero;
        do {
            numero = PedirDatos.pedirEntero(msg);
            if(numero==null)
                msg="Vuelve a introducir dato";
        } while (numero == null);
        return numero;
    }

    public static String validarString(String msg) {
        String cadenaTexto;
        do {
            cadenaTexto = PedirDatos.pedirCadena(msg);
            if(cadenaTexto==null)
                msg="Vuelve a introducir dato";
        } while (cadenaTexto == null);
        return cadenaTexto;
    }

    public static Double validarDouble(String msg) {
        Double numero;
        do {
            numero = PedirDatos.pedirDouble(msg);
            if(numero==null)
                msg="Vuelve a introducir dato";
        } while (numero == null);
        return numero;
    }



}
