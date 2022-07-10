/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Enum.Estado;

/**
 *
 * @author User
 */
public class Habitacion {
     //tipo, precio, capacidad, número de habitación y estado 
     //individual (permite una persona), doble (permite dos personas), familiar(permite hasta 4 personas)
    private double precio;
    private int capacidad;
    private String numeroHab;
    private Estado estado;

    public Habitacion(double precio, int capacidad, String numeroHab, Estado estado) {
        this.precio = precio;
        this.capacidad = capacidad;
        this.numeroHab = numeroHab;
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getNumeroHab() {
        return numeroHab;
    }

    public void setNumeroHab(String numeroHab) {
        this.numeroHab = numeroHab;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
}
