/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author dam1
 */
public abstract class Empregado {
    protected String dni;
    protected String nome;
    protected String apelido;
    protected String dataIngreso;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empregado{");
        sb.append("dni=").append(dni);
        sb.append(", nome=").append(nome);
        sb.append(", apelido=").append(apelido);
        sb.append(", dataIngreso=").append(dataIngreso);
        sb.append('}');
        return sb.toString();
    }
    
}
