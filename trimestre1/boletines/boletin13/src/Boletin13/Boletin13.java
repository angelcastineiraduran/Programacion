/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin13;

import com.nina.Persoal;

public class Boletin13 {
    
    public static void main(String[] args) {
        //meti esos valores por poner algo
        Persoal obxPersoal = new Persoal("3948857", "casy@gmail.com");
        Academica obxAcademica = new Academica("angel", 10, obxPersoal);
        
        String datosPersoa = obxPersoal.toString();
        System.out.println("datosPersoa = " + datosPersoa);
        String resultadosPersoa = obxAcademica.toString();
        System.out.println("resultadosPersoa = " + resultadosPersoa);
        
    }

 
}
