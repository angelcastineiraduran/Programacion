
package exemploarrays;

import javax.swing.JOptionPane;

public class ExemploArrays {

    public static void main(String[] args) {
        Metodos obx = new Metodos ();
        
        // primer dia
//        float []aux;
//        aux = obx.crearArrayFloat();
//        obx.amosarArray(aux);
//        obx.amosarPorPosicion(aux, 1);
        
        // segundo dia 18/01/23
        float []aux = null;
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n1-> crear array"
                    + "\n2-> amosar\n3-> busqueda\n4-> ordenar\n5-> ordenar 2"
                    + "\n6-> añadir numero\nTeclea una opcion"));
            switch(opcion){
                case 1: aux = obx.crearArrayFloat();
                        break;
                case 2: obx.amosarArraySegundoMetodo(aux);
                        break;
                case 3: obx.buscarElemento(aux);
                        break;
                case 4: obx.ordenacion(aux);
                        break;
                case 5: obx.ordenacionSegundo(aux);
                        break;
            }
        }while(opcion <= 7);
        
        
    }
    
}
