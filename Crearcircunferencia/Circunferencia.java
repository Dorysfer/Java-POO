/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crearcircunferencia;


/**
 *
 * @author Home
 */
public class Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Circunfservece cs = new Circunfservece();
        Circunf c1 = cs.crearCircunfer();
        cs.calcularPerimetro(c1);
        cs.calcularArea(c1);
    }

}
