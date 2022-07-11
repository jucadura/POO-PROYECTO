/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

/**
 *
 * @author User
 */
public abstract class Servicio {
    protected String ciudad;
    protected String id;
    protected int puntuacion;
    protected int valor;

    public Servicio(String ciudad, String id, int puntuacion, int valor) {
        this.ciudad = ciudad;
        this.id = id;
        this.puntuacion = puntuacion;
        this.valor = valor;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getId() {
        return id;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public int getValor() {
        return valor;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    public abstract void mostrarInfo();

    public void reservar(){
        //falta
    }
}
