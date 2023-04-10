/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dividirExcepciones;

import nosaExcepcion.NosaExcepcion;

/**
 *
 * @author dam1
 */
public class DividirExcepciones {
    /**
     * metodo que divide dos numeros pedidos al usuario
     * No esta controlado el flujo por lo que si salta un error
     * aparareceran letras en rojo parando el programa
     * 
     * @param numerador
     * @param denominador 
     */
    public void dividir(int numerador, int denominador){
        int resultado = numerador / denominador;
        System.out.println("resultado = " + resultado);
    }
    /**
     * metodo que divide dos numeros pedidos al usuario controlando el flujo
     * del programa. si lanza un error lo capturo con el try/catch
     * 
     * @param numerador
     * @param denominador 
     */
    public void dividirTratandoExcepcion(int numerador, int denominador){
        try { // intenta hacer lo que hay en este bloque
            int resultado = numerador / denominador;
            System.out.println("resultado = " + resultado);
        }catch (Exception error){ // capturo error en var de tipo Error llamada: error
            System.out.println("Error dividir" + 
                    error.getLocalizedMessage()); // devuelvo un mensaje
        }
        System.out.println("Finaliza el programa");
    }
    /**
     * Creo que no trato el error si no que lo lanzo (lo propago), lo tengo que capturar
     * y tratar
     * 
     * @param numerador
     * @param denominador
     * @throws ArithmeticException que debe ser capturado con un try/catch 
     */
    public void dividirPropagandoExcepcion(int numerador, int denominador) throws ArithmeticException { // indico que puede que lance un error de ese tipo
        if (denominador == 0)
            throw new ArithmeticException("ojo non dividas entre 0"); // me la lanzaria al main, tengo que capturarla con el try/catch
        /* estaria lanzando ese objeto a donde yo le llame */
        else{
            int resultado = numerador / denominador;
            System.out.println("resultado = " + resultado);
        }
        System.out.println("Finaliza el programa");
    }
    /**
     * metodo que divide dos numeros y puede que lance una  excepcion de un tipo 
     * que hemos creado nosotros
     * 
     * Creo que no puedo hacerlo directamente con try/catch porque estaria creando
     * un objeto de tipo Excepcion ( de manera automatica) y no uno de tipo NosaExcepcion
     * @param numerador
     * @param denominador
     * @throws NosaExcepcion 
     */
    public void dividirNosaExcepcion(int numerador, int denominador) throws NosaExcepcion { /* con la "_s" 
    para decirle al compilador que no trate la excep, que la trate el objeto que lanzamos */
        if (denominador == 0)
            throw new NosaExcepcion("*****Non podemos dividir entre cero****"); // Creo el objeto
        else {
            int resultado = numerador / denominador;
        }
        System.out.println("Finaliza o programa");
    }
    
    public void dividirNosaExcepcion_sinElse(int numerador, int denominador) throws NosaExcepcion { /* con la "_s" 
    para decirle al compilador que no trate la excep, que la trate el objeto que lanzamos */
        if (denominador == 0)
            throw new NosaExcepcion("*****Non podemos dividir entre cero****"); // Creo el objeto
        System.out.println("Finaliza o programa");
    }
    
    
    
    
    
    
}
