/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Celulares;

/**
 *
 * @author Home
 */
public class Celulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CelulareService movil=new CelulareService();
       CelularesObjeto celu= movil.cargarCelular();
    }
    
}
