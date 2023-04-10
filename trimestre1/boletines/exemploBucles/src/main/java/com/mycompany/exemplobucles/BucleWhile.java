
package com.mycompany.exemplobucles;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class BucleWhile {
    
    public static int pedirNumeroConsola(String mensaje){
        Scanner consola = new Scanner(System.in);
        return consola.nextInt();
    }
    
    public void bucle(){
        int numero = pedirNumeroConsola("tecleear un numero");
        while (numero >= 0){
            System.out.println("numero = " + numero);
            numero = Integer.parseInt(JOptionPane.showInputDialog("teclea un nuevo numero"));
        }
        System.out.println("se acabo el progrema");
    }
    
}
