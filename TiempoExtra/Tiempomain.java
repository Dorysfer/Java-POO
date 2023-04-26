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
public class Tiempomain {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
      TiempoService time=new TiempoService();
      TiempObjetos t = time.validarHora();
      time.imprimirHora(t.getHorActual());

    }
}
