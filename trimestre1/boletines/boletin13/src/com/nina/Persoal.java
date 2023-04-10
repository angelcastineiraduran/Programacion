/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nina;


public class Persoal{
    private String telefono;
    private String correo;

    public Persoal() {
    }

    public Persoal(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public String getCorreo(){
        return this.correo;
    }

    @Override
    public String toString() {
        return "Persoal{" + "telefono=" + telefono + ", correo=" + correo + '}';
    }

   
    
    
}
