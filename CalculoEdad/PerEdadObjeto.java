/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculoEdad;

import java.util.Date;

/**
 *
 * @author Home
 */
public class PerEdadObjeto {
    private String persona;
    private String nombre;
    private Date fechanac;
    private Date fechanac2;
    

    public PerEdadObjeto() {
    }

    public PerEdadObjeto(String persona, String nombre, Date fechanac, Date fechanac2) {
        this.persona = persona;
        this.fechanac = fechanac;
        this.fechanac2 = fechanac2;
        this.nombre=nombre;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public Date getFechanac2() {
        return fechanac2;
    }

    public void setFechanac2(Date fechanac2) {
        this.fechanac2 = fechanac2;
    }

    @Override
    public String toString() {
        return "PerEdadObjeto{" + "persona=" + persona + ", fechanac=" + fechanac + ", fechanac2=" + fechanac2 + '}';
    }

    

    

}