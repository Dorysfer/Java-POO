/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frase;

/**
 *
 * @author Dorys Erazo Ortega
 */
public class Frase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Fraseservice fs = new Fraseservice();
       Frasedatos f1=fs.Ingresarfrase();
        
       fs.Contarvocales(f1);
       fs.Invertirfrase(f1);
       fs.vecesRepetido(f1);
       fs.compararFrase(f1);
       fs.reemplazar(f1);
       fs.contieneLetra(f1);
       
       
    }
    
}
