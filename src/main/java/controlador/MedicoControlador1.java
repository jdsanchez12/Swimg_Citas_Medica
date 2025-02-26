/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Especialidad;
import modelo.MedicoModelo1;

/**
 *
 * @author HP
 */
public class MedicoControlador1 {
    ArrayList<MedicoModelo1> medicoModelo;
    private static MedicoControlador1 instancia;

    private MedicoControlador1() {
        this.medicoModelo = new ArrayList<>();
    }
    public static MedicoControlador1 getInstancia(){
        if(instancia==null){
            instancia= new MedicoControlador1();
        }
    return instancia;
    }
    
    public MedicoModelo1 guardar(Especialidad modelo, String Cedula, String nombre, int edad, boolean sexo){
        MedicoModelo1 mm=new MedicoModelo1(modelo, Cedula, nombre, edad, sexo);
        medicoModelo.add(mm);
        return mm;
    }
    public ArrayList<MedicoModelo1> listadoCompleto(){
        return medicoModelo;
    }
}
