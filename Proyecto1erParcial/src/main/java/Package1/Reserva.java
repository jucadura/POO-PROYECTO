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
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Reserva(Cliente cliente) {
        this.cliente = cliente;
    }

    public Reserva(String codigo, Cliente cliente, TipoServicio tipoReserva, LocalDate fechaInicio, LocalDate fechaFin) {
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

    public LocalDate getFechaFin() {
        return fechaFin;
    }
    
    
}
