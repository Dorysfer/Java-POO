/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
import java.util.Arrays;
import java.util.Scanner;

public class Ensayo {

    public static void main(String[] args) {
//        int arr1[] = {1, 2, 3}; 
//        int arr2[] = {1, 2, 8}; 
//        if (Arrays.equals(arr1, arr2)) 
//            System.out.println("IGUALES"); 
//        else
//            System.out.println("NO IGUALES"); 

        Scanner lire = new Scanner(System.in);
        int r;
        System.out.println("Ingrese un número");
        int r1 = lire.nextInt();
        System.out.println("Ingrese un segundo número");
        int r2 = lire.nextInt();
         if(r2>r1)   {
            do {
                r=r1;
                r1= r2 % r1;
                r2 = r;
            } while (r1!=0);
            System.out.println("el mcd es " +r);
        }
    }
    }
    

