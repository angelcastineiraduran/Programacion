/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_18;

/**
 *
 * @author dam1
 */
public class ConversorTemperaturas {
    public final static float TEMPERATURA = 80;
    
    public float centigradosAFharenheit (float temperaturaUsuario) throws TemperaturaErrada{
        float farenheit =  (float) (9.0 / 5.0 * temperaturaUsuario + 32.4);
        if (temperaturaUsuario < TEMPERATURA) {
            throw new TemperaturaErrada("temperatura inferior a permitida");
        }
        return farenheit;
    }
        
    public void centigradosAReamur (float temperaturaUsuario) throws TemperaturaErrada{
        float reamur =  (float) (4.0 / 5.0 * temperaturaUsuario);
        if (temperaturaUsuario < TEMPERATURA) {
            throw new TemperaturaErrada("temperatura inferior a permitida");
        } else {
            System.out.println("reamur = " + reamur);
        }
        
    } 

}
