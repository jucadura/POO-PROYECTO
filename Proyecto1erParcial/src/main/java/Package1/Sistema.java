/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;

import Enum.TipoUsuario;
import static Package1.ManejoArchivos.LeeFichero;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Sistema {
    static int indice;
    static String[] atributos;
    public static boolean ingresar(){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> usuarios = LeeFichero("usuarios.txt");
        System.out.println("USUARIO:");
        String usuario = sc.nextLine();    
        ArrayList<String> userList = new ArrayList<>();    
        ArrayList<String> contrasenas = new ArrayList<>();
        for (int i=0; i<usuarios.size(); i++){
            String[] line = usuarios.get(i).split(",");
            userList.add(line[3]);
            contrasenas.add(line[4]);            
        }
        if (userList.contains(usuario)){
            indice = userList.indexOf(usuario);
            atributos = usuarios.get(indice).split(",");
            System.out.println("CONTRASEÑA:");
            String contrasena = sc.nextLine();
            if (contrasenas.contains(contrasena)){
                if (contrasenas.indexOf(contrasena)==indice)
                   return true;
                else System.out.println("Contraseña incorrecta");
            }
            else System.out.println("Contraseña incorrecta");
        }
        else {
            System.out.println("Usuario ingresado no existe");
            return false;
        }
        return false;
    }
    
    public static void registrarCliente(Cliente c){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> clientes = LeeFichero("clientes.txt");
        ArrayList<String> cedulas = new ArrayList<>();
        for (int i=0; i<clientes.size();i++){
            String[] line = clientes.get(i).split(",");
            cedulas.add(line[0]);
        }
        if (cedulas.contains(c.getCedula()))
            System.out.println("Bienvenido "+c.getNombre());
        else {
            System.out.println("Para completar registro: \nIngrese su edad");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese numero de Tarjeta de Credito");
            String numTarjeta = sc.nextLine();
            c.setEdad(edad);
            c.setNumTarjeta(numTarjeta);
            String datosTxt = c.getCedula()+","+edad+","+numTarjeta;
            ManejoArchivos.EscribirArchivo("clientes.txt",datosTxt);
        }
    }
    public static LocalDate formatearFecha(String linea){
        String[] enteros = linea.split("-");
        LocalDate resp = LocalDate.of(Integer.valueOf(enteros[2]), Integer.valueOf(enteros[1]),Integer.valueOf(enteros[0]));
        return resp;
    }
    
    
    public static void main(String[] args) {
        System.out.println("+++++++++++++++++++++++++++++\n    BIENVENIDO AL SISTEMA\n+++++++++++++++++++++++++++++");
        boolean correcto = false;
        while (correcto == false){
            correcto = ingresar();
        }
        System.out.println("/***********MENU***********/\n/*                        */\n/**************************/");
        if (atributos[6].equals("C")){
                Cliente c = new Cliente(atributos[0],atributos[1],atributos[2],atributos[3],atributos[4],atributos[5],TipoUsuario.valueOf(atributos[6]));
                registrarCliente(c);
                Scanner sc = new Scanner(System.in);
                int opcion = 0;
                while (opcion!=5){
                    System.out.println("1. Reservar hospedaje\n2. Reservar transporte\n3. Reservar entretenimiento\n4. Pagar reserva\n5. Salir\n \n Elija una opción:");
                    opcion=sc.nextInt();
                    switch (opcion){
                        case 1:
                            System.out.println("/*****RESERVACION*****/\n/*                      */\n/*********************/");
                            System.out.println("Ingrese fecha de entrada (dd-MM-AAAA): ");
                            sc.nextLine();
                            String entrada = sc.nextLine();
                            System.out.println("Ingrese fecha de salida(dd-MM-AAAA): ");
                            String salida = sc.nextLine();
                            LocalDate fechaInicio = formatearFecha(entrada);
                            System.out.println(fechaInicio);
                            break;
                            
                            
                        
                    }
                }
                
        }            
    }
}
