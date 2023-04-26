/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcuacionSegundoGrado;

/**
 *
 * @author Home
 */
public class EcSegundoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EcSegService raiz=new EcSegService();
        Raices resultado=raiz.coeficientes();
        raiz.Discriminante(resultado);
        /*Estos son los otros métodos pero no hace falta llamarlos
        
        raiz.tieneRaices(resultado);
        raiz.tieneRaiz(resultado);
        raiz.obtenerRaices(resultado);
        raiz.obtenerRaiz(resultado);*/
        
        raiz.calcular(resultado);
    }
    
}
