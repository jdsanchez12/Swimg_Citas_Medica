/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Especialidad;

/**
 *
 * @author HP
 */
public class especialidad {
    ArrayList<Especialidad>modelo;
    private static especialidad instancia;
    private especialidad(){
        this.modelo= new ArrayList<>();
    }
    public static especialidad getInstancia(){
        if(instancia==null){
            instancia=new especialidad();
            
        }
        return instancia;
    }
    public Especialidad guardar(String nombre){
        Especialidad e=new Especialidad(nombre);
        modelo.add(e);
        return e;
    }
    public ArrayList<Especialidad> listado(){
        return modelo;
    }
    public Especialidad obtenerPorNombre(String nombre){
        for (Especialidad e : modelo) {
            if(e.getNombre().equals(nombre)){
                return e;
            }
        }
        return null;
    }
}
