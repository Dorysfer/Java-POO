/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectángulo;

/**
 *
 * @author Dorys Erazo Ortega
 */
public class Rectangulomain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangservice rectang =new Rectangservice();
        Rectangdatos rec=rectang.crearRectang();
        rectang.areaRectangulo(rec);
        rectang.perimetroRectangulo(rec);
        rectang.dibujarRectangulo(rec);
    }
    
}
