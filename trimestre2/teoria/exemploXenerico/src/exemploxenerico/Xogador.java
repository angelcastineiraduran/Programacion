/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploxenerico;

/**
 *
 * @author dam1
 */
public class Xogador implements Comparable{
    private String nome;
    private int dorsal;

    public Xogador(String nome, int dorsal) {
        this.nome = nome;
        this.dorsal = dorsal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Xogador{");
        sb.append("nome=").append(nome);
        sb.append(", dorsal=").append(dorsal);
        sb.append('}');
        return sb.toString();
    }
   

//    @Override
//    public int compareTo(Object o) {
//        //hrow new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        Xogador x = (Xogador)o;
//        if(this.dorsal > x.dorsal)
//            return 1;
//        else if (this.dorsal < x.dorsal)
//            return -1;
//        else
//            return 0;
//    }

    @Override
    public int compareTo(Object o) {
        Xogador x = (Xogador)o; // casteamos
        if (this.nome.compareToIgnoreCase(x.nome) > 0)
            return 1;
        else if (this.nome.compareToIgnoreCase(x.nome) < 0)
            return -1;
        else
            return 0;
    }
    
    
    
    
    
    
}
