/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin16;

/**
 *
 * @author dam1
 */
public class Boletin16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persoa obxCliente = new Persoa("Angel", "Castineira", "489358C");
        String datosCliente = obxCliente.toString();
        System.out.println("datosCliente = " + datosCliente);
        
        CuentaCorriente obxCuentaCorriente = new CuentaCorriente(4898429, obxCliente);
        String cuentaCorriente = obxCuentaCorriente.toString();
        System.out.println("cuentaCorriente = " + cuentaCorriente);
        
        CuentaAhorro2 obxCuentaAhorro = new CuentaAhorro2(1.5, 1000, 439434, obxCliente);
        String datosCuentaAhorro = obxCuentaAhorro.toString();
        System.out.println("datosCuentaAhorro = " + datosCuentaAhorro);
        
        
        
        
    }
    
}
