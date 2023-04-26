/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CafeteraNespresso;

import java.util.Scanner;

/**
 *
 * @author Dorys Erazo Ortega
 */
public class Nespressomain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lire=new Scanner(System.in);
        Nespressoservice cant = new Nespressoservice();
        Nespressodatos cafet = cant.llenarCafetera();
        int opt=0;
        do {   
        System.out.println("Escoja una opción");
        System.out.println("1.- Llenar taza");
        System.out.println("2.- Vaciar cafetera");
        System.out.println("3.- Agregar café");
        System.out.println("4.- Salir");
        opt=lire.nextInt();
            switch (opt){
                case 1:
                    cant.servirTaza(cafet);
                    break;
                case 2:
                    cant.vaciarCafetera(cafet);
                    break;
                case 3:
                    cant.agregarCafe(cafet);
                    break;
                case 4:
                    System.out.println("Disfrute de su café. Buen provecho. ¡Adiós!");  
                    break;
                
                default:
                    System.out.println("Opción incorrecta, escoja una opción válida");
               }
        } 
        while(opt!=4);
    }
    
}
