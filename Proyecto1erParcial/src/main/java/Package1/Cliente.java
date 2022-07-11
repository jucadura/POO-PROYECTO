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
public class Cliente extends Usuario {
    private int edad;
    private String numTarjeta;
   

    public Cliente(String cedula, String nombre, String apellido, String user, String contraseña, String celular, TipoUsuario tipoU) {
        super(cedula, nombre, apellido, user, contraseña, celular, tipoU);
    }

    public int getEdad() {
        return edad;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    @Override
    public String toString() {
        return super.toString()+" Cliente{" + "edad=" + edad + ", numTarjeta=" + numTarjeta ;
    }
    public Reserva generarReserva(Hotel hotel,Habitacion hab){
        Reserva r = new Reserva(this);
        double cod= Math.random()*10000;
        r.setCodigo((int)cod+"");
        Date date = new Date();  
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        String strDate = formatter.format(date);  
        String resStr = r.getCodigo()+","+strDate+","+TipoServicio.HOSPEDAJE.toString().toLowerCase()+","+r.getCliente().getNombre()+","+hab.getPrecio();
        EscribirArchivo("reservas.txt",resStr);
        String resHStr = r.getCodigo()+","+hotel.getCodigo()+","+hab.getTipo().toString().toLowerCase()+","+hab.getPrecio();
        EscribirArchivo("reservasHospedaje.txt",resHStr);
        return r;
    }
}
