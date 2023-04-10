
package com.mycompany.boletin5_1;

public class Consumo {
    
//Atributos
    private int km;
    private int litros;
    private int vMed;
    private float pGas;

//Constructores
    public Consumo(){
        
    }
    
    public Consumo(int km, int litros, int vMed, float pGas){
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }
    
//Metodos
    public float getTempo(){
        return (1/vMed * km);//tempo viaxe
    }
    
    public float consumoMedio(){
        return (litros * 100 / km);
    }
    
    public float consumoEuros(){
        return ((litros * 100 / km) * pGas);
    }

    public void setKms(int km){
        this.km = km;
    }
    
    public void setLitros(int litros){
        this.litros = litros;
    }
    
    public void setVMed(int vMed){
        this.vMed = vMed;
    }
    
    public int getVMed(){
        return vMed;
    }
    
     public void setPGas(float pGas){
        this.pGas = pGas;
    }
    
}
