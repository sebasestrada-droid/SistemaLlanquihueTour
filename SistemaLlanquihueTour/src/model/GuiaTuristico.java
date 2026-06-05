/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class GuiaTuristico extends Persona {

    private String especialidad;
    private int experiencia;

    public GuiaTuristico(String nombre,
                         String rut,
                         String telefono,
                         Direccion direccion,
                         String especialidad,
                         int experiencia) {

        super(nombre, rut, telefono, direccion);

        this.especialidad = especialidad;
        this.experiencia = experiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {

        if (especialidad != null && !especialidad.trim().isEmpty()) {
            this.especialidad = especialidad;
        }
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {

        if (experiencia >= 0) {
            this.experiencia = experiencia;
        }
    }

    @Override
    public String toString() {

        return "GuiaTuristico{" +
                "\nNombre: " + getNombre() +
                "\nRUT: " + getRut() +
                "\nTelefono: " + getTelefono() +
                "\nDireccion: " + getDireccion() +
                "\nEspecialidad: " + especialidad +
                "\nExperiencia: " + experiencia + " años" +
                "\n}";
    }
}
