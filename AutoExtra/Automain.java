/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoExtra;

/**
 *
 * @author Dorys Erazo Ortega
 */
public class Automain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AutoServicio datos = new AutoServicio();
        Auto pres = datos.crearFicha();
        datos.cambioUsuario(pres);
        datos.recorrido(pres);
        datos.mantenimiento(pres);
        System.out.println("Gracias por usar este servicio :) Ð");
    }

}
