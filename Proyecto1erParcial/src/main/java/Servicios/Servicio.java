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
public class Servicio {
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
    
    public void makeID(){
        double cod= (Math.random()*(1000));
        System.out.println(cod);
        this.id= (int)cod+" l";
    }

    public Servicio() {
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

    
    public void mostrarDatosReserva(Reserva r){
        System.out.println("/*****Reserva Generada*****/\n/**************************/");
        System.out.println("Codigo Reserva: "+r.getCodigo()+"\nCliente: "+r.getCliente().getNombre()+"\nTipo Reserva: "+r.getTipoReserva()+"\nFechas: "+r.getFechaInicio()+"-"+r.getFechaFin()+"\nCiudad"+this.getCiudad());
    }
    
}
