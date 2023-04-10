/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import boletin19.Canario;
import boletin19.Galo;
import boletin19.IPodeCantar;
import boletin19.Persoa;

/**
 *
 * @author dam1
 */
public class testBoletin19 {

    public static void main(String[] args) {
        IPodeCantar obxPersoa = new Persoa();
        IPodeCantar obxGalo = new Galo();
        IPodeCantar obxCanario = new Canario();
        
        obxPersoa.cantar();
        obxGalo.cantar();
        obxCanario.cantar();

    }

}
