/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;

import Enum.TipoUsuario;

/**
 *
 * @author User
 */
public abstract class Usuario {
    /*
    cedula,nombre,apellido,user,contraseña,celular,tipoUsuario
    */
    protected String cedula;
    protected String nombre;
    protected String apellido;
    protected String user;
    protected String contraseña;
    protected String celular;
    protected TipoUsuario tipoU;
    

    public Usuario(String cedula, String nombre, String apellido, String user, String contraseña, String celular, TipoUsuario tipoU) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.contraseña = contraseña;
        this.celular = celular;
        this.tipoU = tipoU;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUser() {
        return user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getCelular() {
        return celular;
    }

    public TipoUsuario getTipoU() {
        return tipoU;
    }
    
    public abstract void consultarReservas();

    @Override
    public String toString() {
        return "Usuario{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", user=" + user + ", contrase\u00f1a=" + contraseña + ", celular=" + celular + ", tipoU=" + tipoU + '}';
    }
    
}
