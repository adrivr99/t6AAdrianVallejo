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
public class Defensa extends Futbolista{
    private int dorsal;
    private boolean titular;

    public Defensa() {
        super();
        this.dorsal = 4;
        this.titular = true;
    }

    public Defensa(String nombre, String apellidos, LocalDate fechaNacimiento, int dorsal, boolean titular ) {
        super(nombre, apellidos, fechaNacimiento);
        this.dorsal = dorsal;
        this.titular = titular;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.dorsal;
        hash = 71 * hash + (this.titular ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Defensa other = (Defensa) obj;
        if (this.dorsal != other.dorsal) {
            return false;
        }
        if (this.titular != other.titular) {
            return false;
        }
        return true;
    }

    @Override
    public void entrenamiento() {
        super.entrenamiento();
        System.out.println("Trabajo defensivo");
    }
    
     public boolean alineacion() {
        return this.titular;
    }
        
}
