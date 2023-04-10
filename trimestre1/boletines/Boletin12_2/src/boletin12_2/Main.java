public class Main {
    /**
     *
     * @version 1.0
     */
    public static void main(String[] args) {


        Metodos obx = new Metodos();

//        String mensajeIntentos = "Tienes 10 intentos";
        String mensajeRango = "Escribe un numero entre 1 y 50";
        String mensajeAcierto = "Has acertado el numero";
        int numeroCorrecto = obx.claseRandom(1, 50);
        System.out.println(numeroCorrecto);

        int numeroJugador;
//        System.out.println(mensajeIntentos);
        do {
            numeroJugador = obx.pedirNumero(mensajeRango);
            if(numeroCorrecto != numeroJugador){
                obx.pista();
            }
            else {
                System.out.println(mensajeAcierto);
            }

        } while (numeroCorrecto != numeroJugador);
        System.out.println("programa finalizado");
    }
}