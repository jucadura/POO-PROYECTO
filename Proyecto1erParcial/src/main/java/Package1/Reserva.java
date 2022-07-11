/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;

import Enum.TipoServicio;
import java.util.Date;

/**
 *
 * @author User
 */
public class Reserva {
    private String codigo;
    private Cliente cliente;
    private TipoServicio tipoReserva;
    private double costo;

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Reserva(Cliente cliente) {
        this.cliente = cliente;
    }

    public Reserva( String codigo,Cliente cliente, TipoServicio tipoReserva, LocalDate fechaInicio, LocalDate fechaFin) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.tipoReserva = tipoReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getCodigo() {
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public TipoServicio getTipoReserva() {
        return tipoReserva;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setTipoReserva(TipoServicio tipoReserva) {
        this.tipoReserva = tipoReserva;
    }
}
