
package com.mycompany.libro;

public class Main {
    public static void main(String[] args) {
        
        //constructor por defecto
        System.out.println("Datos do libro do constructor vacio:");
        
        Libro obxLibro1 = new Libro();
        obxLibro1.titulo = "El nombre del viento";
        obxLibro1.autor = "Patrick Rothfuss";
        obxLibro1.ano = 2010;
        obxLibro1.numPaginas = 1200;
        obxLibro1.valoracion = 9.0f;
        
        var titulo1 = obxLibro1.titulo;
        var autor1 = obxLibro1.autor;
        var ano1 = obxLibro1.ano;
        var numPaginas1 = obxLibro1.numPaginas;
        var valoracion1 = obxLibro1.valoracion;
       
        obxLibro1.amosarLibro1(titulo1, autor1, ano1, numPaginas1);
        
        //dar espacio
        System.out.println("");
        
        //constructor parametrizado
        System.out.println("Datos do libro do constructor parametrizado:");
        
        Libro obxLibro2 = new Libro("IT", "Stephen King", 1984, (short)1400);
        /*var titulo = obxLibro2.setTitulo(); 
        con eso me daria error ya que el valor ya se lo estamos dando arriba
        el set es unicamente para modificar
        var titulo = obxLibro2.setTitulo("Los renglones torcidos de Dios");
        De esta forma si estaría bien y estariamos cambiando el valor de titulo
        */
        
        var titulo2 = obxLibro2.getTitulo();
        var autor2 = obxLibro2.getAutor();
        var ano2 = obxLibro2.getAno();
        var numPaginas2 = obxLibro2.getNumPaginas();
        
        obxLibro2.amosarLibro1(titulo2, autor2, ano2, numPaginas2);
    
        
        /*!!!!!! metodo amosar queda pendiente AUN DE HACER. poner el metodo amosar tanto
        en el objeto 1 como en el 2
        */
        
        
        

    }
    
}
