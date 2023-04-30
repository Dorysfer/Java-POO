/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fracciones;

import java.util.Scanner;

/**
 *
 * @author DorysErazo Ortega
 */
public class Fracciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        FraccioneService resultado = new FraccioneService();
        FraccionesObjeto calculo = resultado.ingresarFracciones();
//       
    }
}
