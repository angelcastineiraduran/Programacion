

package com.mycompany.libro;

public class Libro {
    //atributos
    //LA PROFE PONE PRIVADO PREGUNTAR
    public String titulo;
    public String autor;
    public int ano;
    public short numPaginas;
    public float valoracion;
    
    //constructor vacio
    public Libro(){
        
    }
    
    //constructor con parametros
    public Libro(String titulo, String autor, int ano, short numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
    }
    
    //constructores set
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }    
    
    public void setAutor(String autor){
        this.autor = autor;
    }   
    
    public void setAno(int ano){
        this.ano = ano;
    }   
    
    public void setNumPaginas(short numPaginas){
        this.numPaginas = numPaginas;
    }   
    
    public void setValoracion (short valoracion){
        this.valoracion = valoracion;
    }
    
    //constructores get + amosar
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getAno(){
        return ano;
    }
    
    public short getNumPaginas(){
        return numPaginas;
    }
    
    public float getValoracion(){
        return valoracion;
    }
    

    public void amosarLibro1(String titulo, String autor, int ano, short numPaginas){
        System.out.println("Titulo do libro = " + titulo);
        System.out.println("Autor = " + autor);
        System.out.println("Ano de publicacion = " + ano);
        System.out.println("Numero de paxinas = " + numPaginas);
        System.out.println("Valoracion = " + valoracion);
    }

  
}
