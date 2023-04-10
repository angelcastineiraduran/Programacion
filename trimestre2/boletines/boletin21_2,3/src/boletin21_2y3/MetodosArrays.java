
package boletin21_2y3;

import java.util.Arrays;
import nosaLibreria.PedirDatos;

public class MetodosArrays {
    float []temperaturas = new float [5];
    public float[] crearArrayFloat(){
        for(int i = 0; i < temperaturas.length; i++){
            /* previamente tenemos que importar nuestra libreria en el repo Libraries
             clean and build (nosaLibreria proyecto); click derecho Libraries
             (nuestro proyecto); add JAR; dist; y añadimos el .jar */
            temperaturas [i] = PedirDatos.pedirFloat("temperaturas: ");
        }
        return temperaturas;
                
    }
    
    public void amosarArray (float []temperaturas) {
        for(int i = 0; i < temperaturas.length; i++) {
            System.out.println("Temperatura posicion " +  i + ": " + temperaturas[i]);
        }
    }
    public void amosarArraySegundoMetodo (float []temperaturas) {
        // for each: mas facil y especial para recorrer colleciones (solo deben de ser de objetos)
        /* coge un dato basico (temperaturas) y lo pasa a un dato referenciado (elemento).
        Los dos puntos funcionamiento: cogen el array temperatura, lo va recorriendo dato a dato y cada uno de los
        datos los va pasando a la array elemento.
        */
        for(Float elemento:temperaturas) // siempre lo tiene que meter en una clase (en este caso: Float) 
            System.out.println("****" + elemento);
    }
    
    // Temperatura del martes? (posicion 1 programador <-> posicion 2 usuario
    public void amosarPorPosicion (float []temperaturas, int posicion) {
        System.out.println("La posicion " + posicion + " corresponde con la Ta: " + temperaturas[posicion -1]);
    }
    
    // Buscar elementos
    public void buscarElemento(float []temperaturas){
        int atopado = 0; // non se atopou o elemento
        float eleBuscar = PedirDatos.pedirFloat("numero a buscar");
        for (int i = 0; i < temperaturas.length; i++){
            if (eleBuscar == temperaturas [i]){
                System.out.println("A temperatura esta na posicio" + (i+1));
                atopado = 1;
                break;
            }
        }
        if (atopado == 0)
            System.out.println("esta temperatura non esta na lista");
    }
    
    // Ordenacion
    public void ordenacion (float [] temperaturas) {
        float aux;
        for (int i = 0; i < temperaturas.length; i++){
            for (int j = i + 1; j < temperaturas.length; j++){
                if (temperaturas[i] > temperaturas[j]){
                aux = temperaturas [i];
                temperaturas [i] = temperaturas [j];
                temperaturas [j] = aux;
                }
            }
        }
        System.out.println("Array ordenada");
    }
    
    public void ordenacionSegundo (float [] temperaturas) {
        Arrays.sort(temperaturas); // hace los mismo que el de ordenacion
        System.out.println("Array ordenado");
    }
    
   
}
