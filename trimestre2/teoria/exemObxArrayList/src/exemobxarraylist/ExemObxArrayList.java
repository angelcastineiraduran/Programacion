/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemobxarraylist;

import java.util.ArrayList;
import nosaLibreria.PedirDatos;

/**
 *
 * @author dam1
 */
public class ExemObxArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Xogador> listXog = new ArrayList<>();
        Metodos obx = new Metodos();
        int opcion;
        do {
             opcion = PedirDatos.pedirInt("\"***MENU***:\n1--> "
                + "Engadir xogador\n2--> Amosar\n3--> Buscar\n4--> Eliminar"
                     + "\n5--> Ordenar por dorsal\n6--> Ordenar por nome\nTeclar una opcion");
            switch (opcion) {
                case 1:
                    obx.engadir(listXog);
                    break;
                case 2:
                    obx.amosar1(listXog);
                    break;
                case 3:
                    obx.buscar(listXog, "Introduce dorsal a buscar");
                    break;
                case 4: 
                    // metodo un poco absurdo porque tienes que introducir dorsal y nombre
                    obx.eliminar(listXog, "Dorsal do xogador a eliminar");
                    break;
                case 5: obx.ordenar(listXog);
                    break;
                    
                default: System.out.println("Opcion incorrecta");
                
                
            }
        } while (opcion != 0);
    }

}
