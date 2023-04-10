package exemplomatriz;

import java.util.Random;
import nosaLibreria.PedirDatos;

public class Metodos {

    float[][] notas = new float[3][4];
    Random r = new Random();
    float sumaNotas;
    float media;
    float mediaColumna;
    float sumaColumna;
    float mediaFilas;

    /*
    Hizo metodo en clase para cambiar enteramente una fila y una columna???? -> 
    preguntar NINA si lo puede pasar: paso marcos foto por el grupo
    */
    
    public float[][] crearMatriz() {
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
//                notas[i][j] = PedirDatos.pedirFloat("introduce "
//                        + "la posicion " + "[" + i + "]" + "[" + j + "]" + " = " + "de la matriz");
                this.notas[i][j] = r.nextFloat() * 10.0f + 1.0f;
            }
        }
        return this.notas;
    }

    public void verMatriz() {
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("matriz "
                        + "[" + i + "]" + "[" + j + "]" + " = " + notas[i][j]);
            }
        }
    }

    public float mediaMatriz() {
        int tamañoMatriz = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                this.sumaNotas = sumaNotas + notas[i][j];
                tamañoMatriz++;
            }
        }
        this.media = (sumaNotas / tamañoMatriz);
        return media;
    }

//    public float sumaCol() {
//        int tamañoMatriz = 0;
//        for (int i = 0; i < notas[0].length; i++) {
//            for (int j = 0; j < notas.length; j++) {
//                this.sumaColumna = sumaColumna + notas[j][i];
//
//            }
//            System.out.println("sumaColumna = " + sumaColumna);
//            sumaColumna = 0;
//        }
//
//        return sumaColumna;
//    }
    
    public float sumaCol() {
        int tamañoMatriz = 0;
        for (int i = 0; i < notas[0].length; i++) {
            for (int j = 0; j < notas.length; j++) {
                this.sumaColumna = sumaColumna + notas[j][i];

            }
            System.out.println("sumaColumna = " + sumaColumna);
            this.mediaColumna = sumaColumna / notas.length;
            System.out.println("this.mediaColumna = " + this.mediaColumna);
            sumaColumna = 0;
        }

        return sumaColumna;
    }
    
   
        
}
