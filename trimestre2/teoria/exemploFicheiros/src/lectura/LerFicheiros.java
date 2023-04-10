package lectura;

import eficheiros.Alumno;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NSteuerberg
 */
public class LerFicheiros {
    /**
     * declaramos valor de tipo scanner
     */
    Scanner sc;
    
    /**
     * Lee por palabras
     * - Scanner(File source) para leer el archivo y useDelimiter() para establecer
     * delimitador que se utiliza para separa palabras.
     * - "\\s*" cadena que representa cualquier cantidad de espacios en blanco (ej. tab,
     * salto linea...)
     * - hasNext() devuelve true si hay mas palabras y next() lee el contenido por palabra
     * 
     * @param ficheiro objeto de tipo File que representa archivo que se va a leer
     * @param del delimitador(cadena) que se usara para separar las palabras en el archivo
     */
    public void lerPalabras(File ficheiro, String del){
        try {
            sc = new Scanner(ficheiro).useDelimiter("\\s*" + del + "\\s*");
            //sc = new Scanner(ficheiro).useDelimiter(del); // prueba
            while(sc.hasNext()){
                String dato = sc.next();
                System.out.println(dato);
            }
        }catch (FileNotFoundException ex) {
            System.out.println("erro 1 " + ex.getMessage());
        }
        finally{
            sc.close();
        }
    }
    
    /**
     * Lee por lineas
     * le tal cual el contenido del fichero por lo que despues tambien imprime
     * los espacios en blanco y los saltos de linea
     * 
     * @param ficheiro 
     */
    public void lerLiñas(File ficheiro){
        try {
            sc = new Scanner(ficheiro);
            while(sc.hasNext()){
                String dato = sc.nextLine();
                System.out.println(dato);
            }
        }catch (FileNotFoundException ex) {
            System.out.println("erro 2 " + ex.getMessage());
        }
        finally{
            sc.close();
        }
    }
    
    /**
     * Lee ArrayList
     * - lista.add(num) va añadiendo en la array "lista" los tipo int que les llega.
     * - al utilizar nextInt() no guarda los espacios ni enter (daria error de todas creo)
     * - foreach para que imprima el ArrayList "lista"
     * @param ficheiro
     * @return 
     */
    public ArrayList<Integer> lerNumero(File ficheiro){
        int num;
        //int aux;
        ArrayList<Integer> lista=new ArrayList<>();
        try{
            sc = new Scanner(ficheiro);
            while(sc.hasNext()){
                num=sc.nextInt();
                //aux = Integer.parseInt(num);
                lista.add(num);
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("error leer numero"+ex.getMessage());
        }
        finally{
                sc.close();
        }
       
        for(Integer ele:lista){
            System.out.println(ele);
        }
       
        return lista;
    }
    
    public ArrayList<Integer> lerNumeroDelimitadores(File ficheiro){
        int num;
        //int aux;
        ArrayList<Integer>lista=new ArrayList<>();
        try{
            sc = new Scanner(ficheiro).useDelimiter(",");
            while(sc.hasNext()){
                num=sc.nextInt();
                //aux = Integer.parseInt(num);
                lista.add(num);
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("error leer numero"+ex.getMessage());
        }
        finally{
                sc.close();
        }
       
        for(Integer ele:lista){
            System.out.println(ele);
        }
       
        return lista;
    }
    /**
     * Lee el objeto
     * - aux es una array que ira almacenando String de las lineas que va leyendo
     * sc. con split() divido las lineas que me llegan cada vez que encontro una coma
     * - lista.add voy almacenando los objectos Alumno de aux
     * @param ficheiro 
     */
    public void lerObxecto(File ficheiro){
        ArrayList<Alumno> lista = new ArrayList();
        String []aux = new String[2];
        try{
            sc = new Scanner(ficheiro);
            while(sc.hasNextLine()){
                aux = sc.nextLine().split(", ");
                lista.add(new Alumno(aux[0], Integer.parseInt(aux[1])));
            }
        }catch (FileNotFoundException ex){
            System.out.println("non se pode ler do ficheiro");
        }finally{
            sc.close();
        }
        for(Alumno al:lista){
            System.out.println(al);
        }
            
    }
    
    
    //3º xeito
}