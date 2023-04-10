/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.boletin6_3;

public class Circulo {

    private double radio;
    private final static double PI = 3.14;
    
    //constructores
    public Circulo(){
        
    }
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    //metodos de acceso
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){ 
        return radio;
    }
    
    //pongo get con el PI porque lo tengo en privado, si fuera public no haria falta
    public double getPI(){
        return PI;
    }
    
    //otro metodos
    public double calcularArea(){
        return 2 * PI * Math.pow(radio, 2);
    }
    
    public double calcularLonxitude(){
        return 2 * PI * radio;
    }
    
    
}
