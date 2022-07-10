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

    public Hotel(String codigo, String nombre, int rating, boolean desayuno, boolean parqueo, boolean cancelacionGratis,LocalDate fechaInicio, LocalDate fechaFin) {
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
    @Override
    public void mostrarInfo(){
        String stars="";
        for(int i=0; i<this.rating;i++){
            stars+="*";
        }
        System.out.println("Datos del"+this.nombre+"\n/*******************/\nDirección: "+this.direccion+"\nEstrellas: "+stars+"\nIncluye Desayuno: "+Sistema.booleanoInfo(this.desayuno)+"\nIncluye Parqueo: "+Sistema.booleanoInfo(parqueo)+"\nPermite cancelacion gratis: "+Sistema.booleanoInfo(this.cancelacionGratis)+"/*******************/");
    }
    
    public void buscarHabitaciones(){
        ArrayList<Habitacion> habs = new ArrayList<>();
        ArrayList<String> lineas = LeeFichero("habitaciones.txt");
        for (int i=1; i<lineas.size();i++){
            String[] line = lineas.get(i).split(",");
            if (line[0].equals(codigo)){
                Habitacion hab = new Habitacion(line[0],TipoHabitacion.valueOf(line[1]),Double.valueOf(line[2]),Integer.valueOf(line[3]),line[4],Estado.valueOf(line[5]));
                habs.add(hab);
            }
        }
        this.setHabitaciones(habs);
    }
    
    public ArrayList<Habitacion> habitacionesDisponibles(TipoHabitacion tipo){
        ArrayList<Habitacion> disp = new ArrayList<>();
        for (int i =0; i<this.habitaciones.size();i++){
            if(this.habitaciones.get(i).getEstado()==Estado.DISPONIBLE && this.habitaciones.get(i).getTipo()==tipo)
                disp.add(this.habitaciones.get(i));
        }
        return disp;
    }
    
    public void mostrarTipo(){
        double ind=0;
        double dob=0;
        double fam=0;
        for(int i=0; i<this.habitaciones.size();i++){
            Habitacion hab = this.habitaciones.get(i);
            if(hab.getTipo()==TipoHabitacion.INDIVIDUAL)
                ind = hab.getPrecio();
            else if (hab.getTipo()==TipoHabitacion.DOBLE)
                dob = hab.getPrecio();
            else fam = hab.getPrecio();           
        }
        System.out.println("1.- Individual - 1 persona - "+ind+"\n2.- Doble - 2 personas - "+dob+"\n3.- Familiar - 4 personas -"+fam);
    }
}
    

