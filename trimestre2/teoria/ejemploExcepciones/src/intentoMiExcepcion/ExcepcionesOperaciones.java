/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intentoMiExcepcion;

/**
 *
 * @author casty
 */
public class ExcepcionesOperaciones {
    
    public void raizRadicandoNegativo (double radicando)throws MiExcepcion{
        if (radicando < 0) {
            throw new MiExcepcion("No puedes hacer la raiz de un num negativo");
        }
    }
}
