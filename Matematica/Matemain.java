/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematica;

/**
 *
 * @author Home
 */
public class Matemain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematicaService resultado=new MatematicaService();
        Matematica r=resultado.generarNumeros();
        resultado.devolverMayor(r);
        resultado.calcularPotencia(r);
        resultado.calcularRaiz(r);
    }
    
}
