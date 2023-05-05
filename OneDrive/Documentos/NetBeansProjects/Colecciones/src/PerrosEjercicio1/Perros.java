/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PerrosEjercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Perros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> perro = new ArrayList<>();
        Scanner lire = new Scanner(System.in).useDelimiter("\n");
        String respuesta;
        do {
            System.out.println("Ingrese una raza de perro");
            perro.add(lire.next());
            System.out.println("Desea ingresar otra raza? S / N");
            respuesta = lire.next();
        } while ("s".equalsIgnoreCase(respuesta));

        perro.forEach((perrito) -> {
            System.out.println(perrito);
        });

        Iterator itera = perro.iterator();
        int t1=perro.size();
        // si se pone así, se sigue copiando la lista original y así se quite, no funciona.
//        while (itera.hasNext()) {
//            System.out.print(itera.next() + ",");
//        }
        
        System.out.println("***************");
        System.out.println("Ingrese la raza de perro que desea eliminar de la lista");
        String razaEliminada = lire.next();
        
        while (itera.hasNext()) {
            if (itera.next().equals(razaEliminada)) {
                itera.remove();
            }
        }
        if(perro.size()==t1){
            System.out.println("Raza no encontrada");
        
        }
            Collections.sort(perro);
            System.out.println("*****************");
       perro.forEach((perrito) -> {
           System.out.println(perrito);
       });
        
        }
    }