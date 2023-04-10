/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin16;

/**
 *
 * @author dam1
 */
public class Persoa {
     private String nome;
     private String apelidos;
     private String NIF;
     
    public Persoa(){
        
    }
    
    public Persoa (String nome, String apelidos, String NIF) {
        this.NIF = NIF;
        this.apelidos = apelidos;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persoa{");
        sb.append("nome=").append(nome);
        sb.append(", apelidos=").append(apelidos);
        sb.append(", NIF=").append(NIF);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
