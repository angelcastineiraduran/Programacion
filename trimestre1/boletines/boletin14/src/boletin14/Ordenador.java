
package boletin14;
import partes.*;

public class Ordenador {
 
    
        
    //creo objetos del paquete partes
    private Cpu obxProcesador = new Cpu();
    private Monitor obxMonitor = new Monitor();
    private Teclado obxTeclado = new Teclado();

    float precio;
    
    public Ordenador(){
    }
    
    public Ordenador(float precio, int pro, float mo, String te){
    this.precio = precio;
    obxProcesador.setVelocidad(pro);
    obxMonitor.setPulgadas(mo);
    obxTeclado.setMarca(te);
    } 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ordenador{");
        sb.append("obxProcesador=").append(obxProcesador);
        sb.append(", obxTeclado=").append(obxTeclado);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
    
    
 
    
}
