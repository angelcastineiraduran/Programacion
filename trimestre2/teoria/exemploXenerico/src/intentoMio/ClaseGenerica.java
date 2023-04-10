
package intentoMio;

public class ClaseGenerica <T> { // indico el tipo generico
    // definimos el tipo generico:
    private T objeto;// el tipo del atributo no lo sabremos hasta el momento de utilizar nuestra clase
    
    public ClaseGenerica (T objeto){
        this.objeto = objeto;
    }
    
    public void obtenerTipo () {
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
    
}

class Test {
    public static void main(String[] args) {
        // indicamos el tipo con el que vamos a trabajar:
        ClaseGenerica <Integer> objInteger; // solo tipo primitivos. int -> NO
        objInteger = new ClaseGenerica (15); // de manera automatica se convierte a un tipo Integer
        
        objInteger.obtenerTipo();
        
        // cambio el tipo de la variable. Deben coincidir el que indicamos y proporcionamos
        ClaseGenerica <String> objString; // <tipo-que-indicamos>
        objString = new ClaseGenerica("Juan"); // "tipo que proporcionamos"
        
        objString.obtenerTipo();
    }
}
