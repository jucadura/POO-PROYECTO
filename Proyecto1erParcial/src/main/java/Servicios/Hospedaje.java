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
public class Hospedaje {
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

    
    public Reserva generarReserva(Cliente c,LocalDate fechaInicio, LocalDate fechaFinal,int valor){
        this.setValor(valor);
        Date date = new Date();  
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        String strDate = formatter.format(date);  
        System.out.println(strDate);
        Reserva r = new Reserva(this.getId(),c,TipoServicio.HOSPEDAJE,fechaInicio,fechaFinal);        
        String resStr = r.getCodigo()+","+strDate+","+TipoServicio.HOSPEDAJE.toString().toLowerCase()+","+r.getCliente().getNombre()+","+this.valor;
        EscribirArchivo("reservas.txt",resStr);
        return r;
    }
    
}
