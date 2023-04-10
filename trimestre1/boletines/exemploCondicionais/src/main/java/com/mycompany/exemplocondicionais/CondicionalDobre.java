
package com.mycompany.exemplocondicionais;

public class CondicionalDobre {
    
    public void consultarEdade(int edad){
        if(edad>=18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
        System.out.println("remata o if");
    }
    
    public void consultarEdade2(int edad){
        String res = (edad >= 18)?"maior":"menor";
        System.out.println(res);
    }
}
