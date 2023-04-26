/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fracciones;

/**
 *
 * @author Home
 */
public class Fracciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FraccioneService resultado= new FraccioneService();
       
    int v[] = new int[100];
    int posicion=0;
   
    //hallando un numero primo
    int divisibles;
    for(int i=0;posicion<v.length;i++){ //no sale de este for sino esta lleno el vector
        divisibles=0;
        for(int j=1;j<=i;j++){ // aqui este for, recorre todos los numeros detras de el
            if(i%j==0){ //los numero primos solo son divisible por 1 y por ellos mismo
                divisibles++;
            }
        }
        if(divisibles<=2){ //si es divisible por el y por 1 entrara
            v[posicion]=i; // guardo numero el en vector
            posicion++; // aumento una posicion para el sgte numero
        }
    }


    for(int i=0;i<v.length;i++) {
        System.out.print(" " + v[i]);
    }
}
}


        
    