/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;

/**
 *
 * @author User
 */
public class Admin extends Usuario{
    private int totalReservas;
    
    public Admin(int totalReservas, String cedula, String nombre, String apellido, String user, String contraseña, String celular, TipoUsuario tipoU) {
        super(cedula, nombre, apellido, user, contraseña, celular, tipoU);
        this.totalReservas = totalReservas;
    }

    public int getTotalReservas() {
        return totalReservas;
    }

    public void setTotalReservas(int totalReservas) {
        this.totalReservas = totalReservas;
    }

    @Override
    public void consultarReservas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
