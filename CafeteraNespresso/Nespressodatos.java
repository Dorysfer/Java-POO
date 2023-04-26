/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CafeteraNespresso;

/**
 *
 * @author Dorys Erazo Ortega
 */
public class Nespressodatos {
    private int capacidadMaxima;
    private int cantidadActual;

    public Nespressodatos() {
    }

    public Nespressodatos(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Nespresso características: " + "Capacidad máxima: " + capacidadMaxima + ", Cantidad actual: " + cantidadActual;
    }
    
    
    
}
