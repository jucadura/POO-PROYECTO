/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Enum.Estado;
import Enum.Transmision;

/**
 *
 * @author User
 */
public class Vehiculo {
    /*identificador (código numérico aleatorio único), marca, modelo, 
placa, color, capacidad, estado (disponible u ocupada),el costo de alquiler por día, y si 
es manual o automático*/
    private String codigo;
    private String marca;
    private String modelo;
    private String placa;
    private String color;
    private int capacidad;
    private Estado estado;
    private double costo;
    private Transmision transmision;

    public Vehiculo(String codigo, String marca, String modelo, String placa, String color, int capacidad, Estado estado, double costo, Transmision transmision) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.capacidad = capacidad;
        this.estado = estado;
        this.costo = costo;
        this.transmision = transmision;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }
    
}
