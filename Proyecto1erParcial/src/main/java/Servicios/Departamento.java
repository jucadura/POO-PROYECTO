/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author User
 */
public class Departamento extends Hospedaje {
    private int numRooms;
    private boolean wifi;
    private boolean piscina;

    public Departamento() {
    }

    public Departamento(int habitaciones, boolean wifi, boolean piscina) {
        this.numRooms = habitaciones;
        this.wifi = wifi;
        this.piscina = piscina;
    }

    public Departamento(int habitaciones, boolean wifi, boolean piscina, LocalDate fechaInicio, LocalDate fechaFin) {
        super(fechaInicio, fechaFin);
        this.numRooms = habitaciones;
        this.wifi = wifi;
        this.piscina = piscina;
    }

    public int getHabitaciones() {
        return numRooms;
    }

    public void setHabitaciones(int habitaciones) {
        this.numRooms = habitaciones;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    
    
    
}
