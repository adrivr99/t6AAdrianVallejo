/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo;

import java.time.LocalDate;
import java.util.Objects;
/**
 *
 * @author adriv
 */
public class Lateral extends Defensa{
    private int peso;// peso en kilogramos
    private int altura;// altura en centimetros
    private int velocidadPuntaMaxima;// velocidad punta en kilometros/hora
    private String actitud;// actitud ofensiva, defensiva o equilibrada
    
    public Lateral() {
        super();
        this.peso = 70; 
        this.altura = 171; 
        this.velocidadPuntaMaxima = 59; 
        this.actitud = "Ofensivo";
    }

    public Lateral(int peso, int altura, int velocidadPuntaMaxima, String actitud, String nombre, String apellidos, LocalDate fechaNacimiento, int dorsal, boolean titular) {
        super(nombre, apellidos, fechaNacimiento, dorsal, titular);
        this.peso = peso;
        this.altura = altura;
        this.velocidadPuntaMaxima = velocidadPuntaMaxima;
        this.actitud = actitud;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getVelocidadPuntaMaxima() {
        return velocidadPuntaMaxima;
    }

    public void setVelocidadPuntaMaxima(int velocidadPuntaMaxima) {
        this.velocidadPuntaMaxima = velocidadPuntaMaxima;
    }

    public String getActitud() {
        return actitud;
    }

    public void setActitud(String actitud) {
        this.actitud = actitud;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.peso;
        hash = 29 * hash + this.altura;
        hash = 29 * hash + this.velocidadPuntaMaxima;
        hash = 29 * hash + Objects.hashCode(this.actitud);
        return hash;
    }

    @Override
    public boolean equals(Object objeto) {
        if (!super.equals(objeto)) {
            return false;
        }
        final Lateral other = (Lateral) objeto;
        if (this.velocidadPuntaMaxima != other.velocidadPuntaMaxima) {
            return false;
        }
        return true;
    }

    @Override
    public void entrenamiento() {
        super.entrenamiento();
        System.out.println("Centros en largo");
    }
    
     public String cambiarActitud() {
        return this.actitud;
    }
    
}
