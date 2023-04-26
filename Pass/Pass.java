/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pass;

/**
 *
 * @author Dorys Erazo Ortega
 */
public class Pass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PassService clave=new PassService();
        PassObjetos key= clave.cambioDatos();
       //clave.analizarPass(key);
    }
    
}
