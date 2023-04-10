/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplostring;

/**
 *
 * @author dam1
 */
public class Metodos {
    private String nome;
    private int numeroLetras;
    
    public int numeroLetras (String nome){
        this.nome = nome;
        this.numeroLetras = nome.length();
        return numeroLetras;
    }
    
    public String capitalLetters (String nome){
        return this.nome = nome.toUpperCase();
    }
    
    public String lowerLetters (String nome){
        return this.nome = nome.toLowerCase();
    }
    
    public void comparar (String nome1, String nome2){
        boolean resultado = nome1.equalsIgnoreCase(nome2);
        if (resultado == true){
            System.out.println("Ambas cadenas de texto son iguales");
        }
        else {
            System.out.println("Las cadenas de texto son distintas");
        }
    }
    
    public void compararExacto (String nome1, String nome2){
        boolean resultado = nome1.equals(nome2);
        if (resultado == true){
            System.out.println("Ambas cadenas de texto son iguales");
        }
        else {
            System.out.println("Las cadenas de texto son distintas");
        }
    }
    
    public char[] passToArray (String nome){
        return this.nome.toCharArray();
    }
    
    public String cortar (String nome){
        return this.nome.substring(0, 3);
    }
}
