/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin13;

import com.nina.Persoal;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Academica {
    public static int numReferencia = 2018;
    private String nome;
    private int nota;
    private Persoal alum;
    
    public Academica() {
        numReferencia++;
    }
    
    public Academica(String nome, int nota, Persoal alum){
        Academica.numReferencia ++;
        this.nome = nome;
        this.nota = nota;
        this.alum = alum;
    }

    //click derecho, insert code, toString, generate
    @Override
    public String toString() {
        return "Academica{" + "nome=" + nome + ", nota=" + nota + ", alum=" + alum + '}';
    }
    
    public static int getNumReferencia(){
        return numReferencia;
    }
    
    public static void String(int numReferencia){
        Academica.numReferencia = numReferencia;
    } 
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getNota(){
        return nota;
    }
    
//    public void amosar() {
//        System.out.println(toString());
//    }
    
//    public void ver(){
//        System.out.println("numReferencia: " +  numReferencia + "nome: " + nome + "nota:" + nota + "tlf:" + alum.getClass);
//    }
    
    public int pedirEnteiro(){
        do{
            nota = Integer.parseInt(JOptionPane.showInputDialog("teclee nota entre 1 e 10"));            
        }while (nota < 1 || nota > 10);
        return nota;
    }
}
