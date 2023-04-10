
package manejoexcepcionesundemy;

public class OperacionExcepcion extends Exception {
    
    public OperacionExcepcion (String mensaje){
        super (mensaje); // lo propagamos a la clase padre
    }
    
}
