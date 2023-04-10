/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploPildoras.serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author casty
 */
public class Serializadora {
    Plantilla plantilla = new Plantilla();
    String ruta = 
            "C:\\Users\\casty\\OneDrive\\Documentos\\NetBeansProjects\\programacion_2tri_v2\\teoria\\teoriaFicherosUndmy\\archivosGenerados\\objetoPrueba.txt";
    Empleado[] personal = plantilla.creacionPlantilla();
    public void escribirObjecto() {
        try{
            var escribiendo = new ObjectOutputStream(new FileOutputStream(this.ruta));
            for(int i = 0;i < this.personal.length; i++) {
                escribiendo.writeObject(this.personal[i]);
            }
            escribiendo.close();
        } catch(IOException ex) {
            System.out.println("fallo escribiendo");
            ex.printStackTrace();
        }
    }
    // COMO SOLUCIONO ESTO (parecido al de pildoras):
//    public void leerObject() {
//        try {
//           var leyendo = new ObjectInputStream(new FileInputStream(this.ruta));
//           Empleado[] plantilla = (Empleado[])leyendo.readObject();
//           leyendo.close();
//           for(int i = 0;i < plantilla.length; i++){
//               System.out.println(plantilla);
//           }
//        } catch(IOException ex){
//            System.out.println("error  no se encontro file");
//        } catch(Exception ex){
//            System.out.println("class not found");
//            ex.printStackTrace();
//        }
//    }
    public void leerObject() {
    try {
        var leyendo = new ObjectInputStream(new FileInputStream(this.ruta));
        Empleado[] plantilla = new Empleado[3]; // Crear array para almacenar los empleados
        for(int i = 0; i < plantilla.length; i++){
            plantilla[i] = (Empleado)leyendo.readObject(); // Leer cada objeto y almacenarlo en el array
        }
        leyendo.close();
        for(int i = 0; i < plantilla.length; i++){
            System.out.println(plantilla[i]);
        }
    } catch(IOException ex){
        System.out.println("error  no se encontro file");
    } catch(Exception ex){
        System.out.println("class not found");
    }
}
}
