/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlumnosEjercicio3;

import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class AlumnObjeto {
    private String nombre;
    private ArrayList <Integer> nota;
    private double promedio;

    public AlumnObjeto() {
    }

    public AlumnObjeto(String nombre, ArrayList<Integer> nota) {
        this.nombre = nombre;
        this.nota = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    
    
}
