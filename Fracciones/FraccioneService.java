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
public class FraccioneService {
    FraccionesObjeto frac= new FraccionesObjeto();
    
public void crearPrimo(){    
    int v[] = new int[100];
    int a=0;// es la variable de cada uno de los elementos del vector
      
    int contador;
    for (int i=0; a < v.length;i++){ 
        contador=0;
        for(int j=1;j<=i;j++){ // debe ir de uno en uno.
            if(i%j==0){ // ejemplo:6/2, resultado es 3 y el resto es 0, 6/3, resto es 0 y resultado 2
                contador++;// por lo anterior el contador debe ser menor o igual que 2
            }
        }
        if(contador==2){ //si es divisible por el y por 1 entrara
            v[a]=i; // guardo numero el en vector
            a++; // aumento una posicion para el sgte numero
        }
    }


    for(int i=0;i<v.length;i++) {
        System.out.print(" " + v[i]);
    }
}
}
    

