/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.PacienteModelo;

/**
 *
 * @author HP
 */
public class PacienteControlador {
    public ArrayList<PacienteModelo>pacientemodeloLista;
    private static PacienteControlador instancia;
    
    private PacienteControlador(){
        this.pacientemodeloLista=new ArrayList<>();
    }
    public static PacienteControlador getInstancia(){
        if(instancia==null){
            instancia=new PacienteControlador();
        }
        return instancia;
    }
    
public PacienteModelo guardarDatos(String cedula, String nombres, int edad, boolean sexo) {
        PacienteModelo modelo = new PacienteModelo(cedula, nombres, edad, sexo);
        pacientemodeloLista.add(modelo);
        return modelo;
    }
   public ArrayList<PacienteModelo> listadoCompleto(){
    return pacientemodeloLista;
}
   
 public ArrayList<PacienteModelo> listadoCompletoPorCedula(String cedula){
    ArrayList<PacienteModelo>nuevoListado=new ArrayList<>();
     for (PacienteModelo pacienteModelo : pacientemodeloLista) {
         if(pacienteModelo.getCedula().contains(cedula)){
             nuevoListado.add(pacienteModelo);   
         }
     }
     return nuevoListado;
}
 public ArrayList<PacienteModelo> getPacientes() {
    return pacientemodeloLista;
}
 public PacienteModelo buscarPacientePorNombre(String nombre) {
    for (PacienteModelo paciente : listadoCompleto()) {
        if (paciente.getNombre().equals(nombre)) {
            return paciente;
        }
    }
    return null;
}
}
