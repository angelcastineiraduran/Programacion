/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheroSerializable;

import escritura.*;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.PrintWriter;

/**
 *
 * @author dam1
 */
public class LecturaFicheirosSerializados {
    /*
    hay que declararlo antes para que lo pueda utilizar en el try y en el catch
    */
    ObjectInputStream lec = null;

    /**
     * Leo objetos serizalizados
     * 
     * cuando no encuentra ningun objeto me salta al error 5 en vez de darme null
     * probe con el codigo de nico y pasa lo mismo
     * @param fich 
     */
    public void lerSerializable(File fich) { // recibo el obj dd quiero escribir
        AlumnadoSerializado al = null;
        
        try {
            this.lec = new ObjectInputStream (new FileInputStream(fich));
            al = (AlumnadoSerializado)lec.readObject(); // para entrar en while
            while (al!=null){
                System.out.println(al);
                al = (AlumnadoSerializado)this.lec.readObject(); // leo los objetos
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("erro escritura: " + ex.getMessage());
        } catch (FileNotFoundException ex){
            System.out.println("erro 2");
            ex.getStackTrace();
        } catch (IOException ex){
            System.out.println("erro 3 " + ex.getStackTrace());
        } finally {
            try {
                this.lec.close();
            }catch (IOException ex){
                System.out.println("erro o pechar o fich");
            }
                
        }
       
    }
        /**
         * realmente no es ningun error, simplemente indica que se ha acabado la
         * lectura de objetos. para solucionarlo capturamos el siguiente error:
         * EOFException
         * @param fich 
         */
        public void lerSerializable_intento2(File fich) { // recibo el obj dd quiero escribir
        AlumnadoSerializado al = null;
        
        try {
            this.lec = new ObjectInputStream (new FileInputStream(fich));
            al = (AlumnadoSerializado)lec.readObject(); // para entrar en while
            while (al!=null){
                System.out.println(al);
                al = (AlumnadoSerializado)this.lec.readObject(); // leo los objetos
            }   

        } catch (ClassNotFoundException ex) {
            System.out.println("erro escritura: " + ex.getMessage());
        } catch (FileNotFoundException ex){
            System.out.println("erro 2" +  ex.getMessage());
        } catch (EOFException ex) {
            System.out.println("Fin de lectura de objetos");
        } catch (IOException ex){
            System.out.println("erro 3 " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                this.lec.close();
            }catch (IOException ex){
                System.out.println("erro o pechar o fich");
            }
                
        }
       
    }
    
}
