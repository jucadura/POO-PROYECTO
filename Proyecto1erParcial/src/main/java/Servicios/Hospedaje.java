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
public class Hospedaje extends Servicio {
    protected LocalDate fechaInicio;
    protected LocalDate fechaFin;

    public Hospedaje() {
    }

    public Hospedaje(LocalDate fechaInicio, LocalDate fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Hospedaje{" + "fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }
    
    public  void mostrarInfo(){
        System.out.println("Fecha Inicial: " + fechaInicio + "\n Fecha Final: " + fechaFin);
    }

    
    
    
}
