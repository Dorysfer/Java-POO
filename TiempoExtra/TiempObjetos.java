/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiempoExtra;

import java.time.LocalTime;

/**
 *
 * @author Home
 */
public class TiempObjetos {
    
    private LocalTime horActual;

    public TiempObjetos() {
    }

    public TiempObjetos(int hora, int minutos, int segundos) {
        
        this.horActual= LocalTime.of(hora, minutos, segundos);
    }

    public LocalTime getHorActual() {
        return horActual;
    }

    public void setHorActual(LocalTime horActual) {
        this.horActual = horActual;
    }

    @Override
    public String toString() {
        return horActual.toString();

    }
    
}
