package nosaLibreria;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class PedirDatos {

    public static float pedirFloat(String Mensaje) { // static para poder utilizar directamente nome clase
        return Float.parseFloat(JOptionPane.showInputDialog(Mensaje));
    }

    public static int getNumeroRandom(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }

    public static int pedirInt(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }

    public static String pedirString(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

}
