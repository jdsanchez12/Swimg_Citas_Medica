/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP
 */
public class MedicoModelo1 extends PacienteModelo {
    public Especialidad modelo;

    public MedicoModelo1(Especialidad modelo, String Cedula, String nombre, int edad, boolean sexo) {
        super(Cedula, nombre, edad, sexo);
        this.modelo = modelo;
    }

    public Especialidad getModelo() {
        return modelo;
    }

    public void setModelo(Especialidad modelo) {
        this.modelo = modelo;
    }


  
    
}
