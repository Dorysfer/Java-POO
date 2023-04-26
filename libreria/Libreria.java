/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner lire=new Scanner(System.in);
        
        
        Libro libro1 = new Libro();
        System.out.println("Ingrese el ISBN");
        libro1.ISBN=lire.next();
        System.out.println("Ingrese el autor");
        libro1.autor=lire.next();
        System.out.println("Ingrese el título del libro que requiere");
        libro1.titulo=lire.next();
        System.out.println("Ingrese el número de páginas del libro que requiere");
        libro1.paginas=lire.next();
        System.out.println("");
         System.out.println(libro1.toString());
    }
}
