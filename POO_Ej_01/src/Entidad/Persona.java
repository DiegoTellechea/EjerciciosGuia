/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Diego T.
 */
public class Persona {
    
    private String Nombre;
    private Double Altura;
    private Double Peso;


    public Persona() {
    }

    public Persona(String Nombre, Double Altura, Double Peso) {
        this.Nombre = Nombre;
        this.Altura = Altura;
        this.Peso = Peso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Double getAltura() {
        return Altura;
    }

    public void setAltura(Double Altura) {
        this.Altura = Altura;
    }

    public Double getPeso() {
        return Peso;
    }

    public void setPeso(Double Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Altura=" + Altura + ", Peso=" + Peso + '}';
    }
    
    
    
}
