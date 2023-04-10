/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin24;

/**
 *
 * @author dam1
 */
public class Libro extends Libreria{

    public static int getNumUni() {
        return numUni;
    }

    private String titulo;
    private String autor;
    private String isbn;
    private float prezo;
    private static int numUni;

    public Libro(String titulo, String autor, String isbn, float prezo) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prezo = prezo;
        numUni = numUni + 1;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro{");
        sb.append("titulo=").append(titulo);
        sb.append(", autor=").append(autor);
        sb.append(", isbn=").append(isbn);
        sb.append(", prezo=").append(prezo);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
    
}
