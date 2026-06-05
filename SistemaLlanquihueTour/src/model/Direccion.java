/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Direccion {

    private String calle;
    private String ciudad;
    private String region;

    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        if (calle != null && !calle.trim().isEmpty()) {
            this.calle = calle;
        }
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        if (ciudad != null && !ciudad.trim().isEmpty()) {
            this.ciudad = ciudad;
        }
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        if (region != null && !region.trim().isEmpty()) {
            this.region = region;
        }
    }

    @Override
    public String toString() {
        return calle + ", " + ciudad + ", " + region;
    }
}