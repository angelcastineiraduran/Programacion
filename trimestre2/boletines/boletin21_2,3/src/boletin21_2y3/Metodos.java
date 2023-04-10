/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin21_2y3;
import nosaLibreria.PedirDatos;
/**
 *
 * @author dam1
 */
public class Metodos {
    private float arrayNotas[] = new float [6];
    private String arrayNomes[] = {"angel","juan","paco","jorge","alberto","fede"};
    private int numeroAprobados;
    private int numeroSuspensos;
    private float media;
    private float sumaNotas;
    
    /**
     * boletin21_2 
     * 
     */
    public void crearArray(){
        for (int i = 0; i < this.arrayNotas.length; i++){
            this.arrayNotas[i] = PedirDatos.pedirFloat("Introducir nota del alumno: " + arrayNomes[i]);
            System.out.println("La nota del alumno " + arrayNomes[i] + " es " +  arrayNotas[i]);
        }
    }
    /**
     * boletin21_2
     * apartado1
     */
    public void aprobadosSuspensos(){
        for (int i = 0; i < this.arrayNotas.length; i++){
            if (this.arrayNotas[i] >= 5){
                this.numeroAprobados = this.numeroAprobados + 1;
            }
            else {
                this.numeroSuspensos = this.numeroSuspensos + 1;
            }
        }
        System.out.println("numeroAprobados = " + numeroAprobados);
        System.out.println("numeroSuspensos = " + numeroSuspensos);
    }
    /**
     * boletin21_2
     * apartado2
     */
    public void notaMedia(){
        for (int i = 0; i < this.arrayNotas.length; i++){
            this.sumaNotas = this.sumaNotas + this.arrayNotas[i]; 
        }
        this.media = this.sumaNotas / this.arrayNotas.length;
        System.out.println("Nota media = " + this.media);
    }
    /**
     * boletin21_2
     * apartado3
     */
    public void notaAlta(){
        MetodosArrays obx = new MetodosArrays();
        obx.ordenacion(this.arrayNotas); // Arrays.sort (notas) // para ordenar
        System.out.println("Nota mas alta = "  + arrayNotas[arrayNotas.length - 1]);
    }
    
    /**
     * boltein21_3
     * apart_4: Visualiza a nota dun alumno determinado que pides por teclado
     * @param alumno 
     */
    public void notaAlumnoPedido(String alumno){
        for (int i = 0; i < arrayNomes.length; i++){
            if (this.arrayNomes[i].equals(alumno)){
                System.out.println("La nota de " + arrayNomes[i] +
                        " es " + arrayNotas[i]);
            }
        }
        
    }
    
    /**
     * boletin21_3
     * apart_2: Visualiza unha lista co nome dos alumnos aprobados
     */
    public void nomeAprobado (){
        System.out.println("Los alumnos aprobados son:");
        for (int i = 0; i < this.arrayNotas.length; i++){
            if (this.arrayNotas[i] >= 5){
                System.out.println(arrayNomes[i]);
            }
        }
    }
    
    /**
     * boletin21_4
     * apart_3: Fai unha lista ordenada por orden crecente de notas
     */
    public void odenacion (){
        MetodosArrays obx = new MetodosArrays();
        obx.ordenacion(this.arrayNotas); /* los aux los declaramos antes
        del for porque cuando la declaramos estamos cogiendo un espacio en memoria del 
        tamaño de las interaciones - siempre que tengo varias listas. si la declaro antes del for
        estoy solo declarando 1 espacio en memoria.
        */
        for (int i = 0; i < arrayNotas.length; i++){
            System.out.println(arrayNotas[i]);
        }
    }
    
    /**
     * boletin21_3
     * apart_1: Visualiza a nota dun alumno determinado
     */
    public void notaAlumno(){
        for (int i = 0; i < arrayNomes.length; i++){
            if (this.arrayNomes[i].equals("angel3")){ // porque me deja con == en vez de equals
                /*
                me deja eso porque esta apuntando a la misma direccion de memoria creo 
                pero no tiene mucho sentido, aunque me funcione el programa en esta ocasion
                */
                System.out.println("La nota de " + arrayNomes[i] +
                        " es " + arrayNotas[i]);
            }
        }
    }
}
