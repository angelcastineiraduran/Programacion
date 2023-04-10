import javax.swing.*;

public class Metodos {
    int numeroJugador;
    int numeroCorrecto;
    String mensajePistaMuyLejos = "Estas muy lejos de acertar";
    String mensajePistaLejos = "Estas lejos de acertar";
    String mensajePistaCerca = "Estas cerca de acertar";
    String mensajePistaMuyCerca = "Estas muy cerca de acertar";

    public int claseRandom(int min, int max) {
        min = (int) Math.ceil(min);
        max = (int) Math.floor(max);
        return numeroCorrecto = (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public int pedirNumero(String textoInterfaz) {
        numeroJugador = Integer.parseInt(JOptionPane.showInputDialog(textoInterfaz));
        return this.numeroJugador;
    }

    public void pista(){
        if (20<Math.abs(numeroJugador-numeroCorrecto)){
            System.out.println(this.mensajePistaMuyLejos);
        }
        else if ((20>Math.abs(numeroJugador-numeroCorrecto))&&(10<Math.abs(numeroJugador-numeroCorrecto))){
            System.out.println(this.mensajePistaLejos);
        }
        else if ((10>Math.abs(numeroJugador-numeroCorrecto))&&(5<Math.abs(numeroJugador-numeroCorrecto))){
            System.out.println(this.mensajePistaCerca);
        }
        else if (5>=Math.abs(numeroJugador-numeroCorrecto)){
            System.out.println(this.mensajePistaMuyCerca);
        }
    }
}
