/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoExtra;

import java.util.Date;

/**
 *
 * @author Dorys Erazo Ortega
 */
public class Auto {
    private String propietario, color, modelo;
    private int km;
    private Date vencimiento;

    public Auto() {
    }

    public Auto(String propietario, String color, String modelo, int km, Date vencimiento) {
        this.propietario = propietario;
        this.color = color;
        this.modelo = modelo;
        this.km = km;
        this.vencimiento = vencimiento;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    @Override
    public String toString() {
        return "Nombre del propietario: " + propietario + ", Color del auto:" + color + ", Modelo: " + modelo + ", Kilometraje" + km + " km, Fecha de caducidad de su licencia:" + vencimiento + '}';
    }
    
    
}
