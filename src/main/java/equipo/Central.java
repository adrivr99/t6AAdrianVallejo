/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo;


import java.time.LocalDate;
/**
 *
 * @author adriv
 */
public class Central extends Defensa{
    private int peso;// peso en kilogramos
    private int altura;// altura en centimetros
    private int velocidadPuntaMaxima;// velocidad punta en kilometros/hora

    public Central() {
        super();
        this.peso = 84; 
        this.altura = 183; 
        this.velocidadPuntaMaxima = 40; 
    }

    public Central(String nombre, String apellidos, LocalDate fechaNacimiento, int dorsal, boolean titular, int peso, int altura, int velocidadPuntaMaxima) {
        super(nombre, apellidos, fechaNacimiento, dorsal, titular);
        this.peso = peso;
        this.altura = altura;
        this.velocidadPuntaMaxima = velocidadPuntaMaxima;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.peso;
        hash = 29 * hash + this.altura;
        hash = 29 * hash + this.velocidadPuntaMaxima;
        return hash;
    }

    @Override
    public boolean equals(Object objeto) {
        if (!super.equals(objeto)) {
            return false;
        }
        final Central other = (Central) objeto;
        if (this.velocidadPuntaMaxima != other.velocidadPuntaMaxima) {
            return false;
        }
        return true;
    }

    @Override
    public void entrenamiento() {
        super.entrenamiento();
        System.out.println("Posicionamiento");
    }
    
     public int mejorarVelocidad() {
        return this.velocidadPuntaMaxima;
    }
}
