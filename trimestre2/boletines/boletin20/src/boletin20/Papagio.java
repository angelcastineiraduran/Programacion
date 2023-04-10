/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin20;

/**
 *
 * @author casty
 */
public class Papagio extends Aves implements IPodeVolar, IPodeCaminiar{

    @Override
    public void volar() {
        System.out.println(" e tamen poden volar\n");
    }

    @Override
    public void caminiar() {
        System.out.print("Os papagaios poden camiñar");

    }
}

