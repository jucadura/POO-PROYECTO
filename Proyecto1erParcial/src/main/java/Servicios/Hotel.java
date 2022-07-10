/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class Hotel extends Hospedaje{
    private String codigo;
    private String nombre;
    private int rating;
    private boolean desayuno;
    private boolean parqueo;
    private boolean cancelacionGratis;
    private ArrayList<Habitacion> habitaciones;

    public Hotel() {
    }

    public Hotel(String codigo, String nombre, int rating, boolean desayuno, boolean parqueo, boolean cancelacionGratis,Date fechaInicio, Date fechaFin) {
        super(fechaInicio, fechaFin);
        this.codigo = codigo;
        this.nombre = nombre;
        this.rating = rating;
        this.desayuno = desayuno;
        this.parqueo = parqueo;
        this.cancelacionGratis = cancelacionGratis;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isDesayuno() {
        return desayuno;
    }

    public void setDesayuno(boolean desayuno) {
        this.desayuno = desayuno;
    }

    public boolean isParqueo() {
        return parqueo;
    }

    public void setParqueo(boolean parqueo) {
        this.parqueo = parqueo;
    }

    public boolean isCancelacionGratis() {
        return cancelacionGratis;
    }

    public void setCancelacionGratis(boolean cancelacionGratis) {
        this.cancelacionGratis = cancelacionGratis;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
   
    
}
