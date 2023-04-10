/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheroSerializable;

import java.io.File;

/**
 *
 * @author dam1
 */
public class Main {
    public static void main(String[] args) {
        File f = new File ("serializado.txt");
        EscrituraFicheirosSerializados escritura = new EscrituraFicheirosSerializados();
        //escritura.escribirSeri(f);
        
        LecturaFicheirosSerializados lectura = new LecturaFicheirosSerializados();
        //lectura.lerSerializable(f);
        //lectura.lerSerializable_intento2(f);
        
        // no esta bien, preguntar:
//        escritura.engadirSeri(f);
//        lectura.lerSerializable_intento2(f);
        
        
        
        
        
    }
    
    
    
}
