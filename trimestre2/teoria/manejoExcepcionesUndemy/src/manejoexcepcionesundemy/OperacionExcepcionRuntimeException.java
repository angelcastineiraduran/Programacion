
package manejoexcepcionesundemy;

public class OperacionExcepcionRuntimeException extends RuntimeException {
    
    public OperacionExcepcionRuntimeException (String mensaje){
        super (mensaje); // lo propagamos a la clase padre
    }
    
}
