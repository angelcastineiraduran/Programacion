/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import java.util.Arrays;
import nosaLibreria.PedirDatos;

/**
 * Ejercicio Boletin 22
 *
 * @author casty
 */
public class Metodos {
    // corregir: importar el jar de pedirdatos en vez de la clase

    private int golesMarcados[][] = new int[2][3];
    private String xornada[] = {"x1", "x2", "x3"};
    private String equipo[] = {"celta", "depor"};

    public int golesEquipo[] = new int[2];

    /**
     * Ejercicio 1.1 Devuelve de dos dimensiones dando valores aloatorios a los
     * indices
     *
     * @return int [][]
     */
    public int[][] creaArray() {
        for (int i = 0; i < golesMarcados.length; i++) {
            for (int j = 0; j < golesMarcados[i].length; j++) {
                golesMarcados[i][j] = PedirDatos.getNumeroRandom(0, 5);
            }
        }
        return golesMarcados;
    }

    /**
     * Ejercicio 1.2 Printea la array de 2 dimensiones con sus respectivos
     * encabezados
     */
    public void mostrarArray() {
        System.out.print("    ");
        for (int j = 0; j < golesMarcados[0].length; j++) {
            System.out.print(" " + xornada[j]);
        }
        System.out.println();

        for (int i = 0; i < golesMarcados.length; i++) {
            System.out.print(equipo[i]);

            for (int j = 0; j < golesMarcados[i].length; j++) {
                System.out.print(" ");
                System.out.print(golesMarcados[i][j]); // NO utiliza println()
                System.out.print(" ");
            }
            System.out.println();

        }

    }

    /**
     * Apartado 3_1 Matriz bidimensional que va a sumar los
     */
    public int[] equiposGoles() {
        System.out.println("***metodo equipoGOles**");
        System.out.print("    ");
        System.out.println();

        for (int i = 0; i < golesMarcados.length; i++) {
            System.out.print(equipo[i] + " = "); // encabezado eje x

            for (int j = 0; j < golesMarcados[i].length; j++) {
                golesEquipo[i] = golesEquipo[i] + golesMarcados[i][j];

            }

            System.out.print(golesEquipo[i]);
            System.out.println();

        }
        return golesEquipo;

    }

    public void ordenarMatriz_v2(int golesEquipo[]) {
        this.golesEquipo = golesEquipo;
        int auxGoles;
        String auxEquipo;

        if (golesEquipo[0] > golesEquipo[1]) {
            // ordena el resultado de goles totales
            auxGoles = golesEquipo[0];
            golesEquipo[0] = golesEquipo[1];
            golesEquipo[1] = auxGoles;

            auxEquipo = equipo[0];
            equipo[0] = equipo[1];
            equipo[1] = auxEquipo;

            for (int i = 0; i < golesMarcados[0].length; i++) {
                int auxArrayBi[][] = new int[2][3]; // se declara aqui para que cada vez que lea una fila se reinicie
                for (int x = 0; x < golesMarcados.length; x++) { // max los golesMarcados y no los goleEquipo pq si no solo ordena el eje y
                    for (int y = x + 1; y < golesMarcados.length; y++) { // max los golesMarcados por la misma razon

                        // ordena resultado tabla
                        auxArrayBi[x][i] = golesMarcados[x][i];
                        golesMarcados[x][i] = golesMarcados[y][i];
                        golesMarcados[y][i] = auxArrayBi[x][i];

                    }

                }
            }
        }
    }

    public void ordenarMatriz(int golesEquipo[]) {
        this.golesEquipo = golesEquipo;
        int aux;
        String aux2;
        for (int x = 0; x < golesEquipo.length; x++) {
            for (int y = x + 1; y < golesEquipo.length; y++) {

                // ordena el resultado de goles totales
                if (golesEquipo[x] > golesEquipo[y]) {
                    aux = golesEquipo[x];
                    golesEquipo[x] = golesEquipo[y];
                    golesEquipo[y] = aux;

                    // ordena el resultado nombre equipo
                    aux2 = equipo[x];
                    equipo[x] = equipo[y];
                    equipo[y] = aux2;

                }
                System.out.println("Despues de entrar");
                System.out.println("golesEquipo = " + equipo[x] + equipo[y]);

            }
        }
    }

    public void verGolesEquipos() {
        System.out.println("**ver goles");
        for (int i = 0; i < golesMarcados.length; i++) {
            System.out.println("golesEquipo[i] = " + golesEquipo[i]);
        }
    }

}
