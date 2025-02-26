/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP
 */
public class PacienteModelo {
    public String Cedula;
    public String nombre;
    public int edad;
    public boolean sexo;

    public PacienteModelo(String Cedula, String nombre, int edad, boolean sexo) {
        this.Cedula = Cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
       public String getSexo() {
        return sexo?"HOMBRE":"MUJER";
    }

    @Override
    public String toString() {
        return "PacienteModelo{" +"nombre=" + nombre + '}';
    }

}
