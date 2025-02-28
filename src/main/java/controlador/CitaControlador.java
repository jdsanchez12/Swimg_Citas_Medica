/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.CitaModelo;

/**
 *
 * @author HP
 */
public class CitaControlador {
  public ArrayList<CitaModelo> citamodeloLista;
    private static CitaControlador instancia;

    private CitaControlador() {
        this.citamodeloLista = new ArrayList<>();
    }

    public static CitaControlador getInstancia() {
        if (instancia == null) {
            instancia = new CitaControlador();
        }
        return instancia;
    }

    public CitaModelo guardarDatos(String descripcion, String fecha, String hora, String paciente, String medico, String especialidad) {
        CitaModelo modelo = new CitaModelo(descripcion, fecha, hora, paciente, medico, especialidad);
        citamodeloLista.add(modelo);
        return modelo;
    }

    public ArrayList<CitaModelo> listadoCompleto() {
        return citamodeloLista;
    }
     public ArrayList<CitaModelo> listadoCompletoPorHora(String hora){
    ArrayList<CitaModelo>nuevoListado=new ArrayList<>();
     for (CitaModelo cm : citamodeloLista) {
         if(cm.getHora().contains(hora)){
             nuevoListado.add(cm);   
         }
     }
     return nuevoListado;
}
}
