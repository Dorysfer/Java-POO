/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fracciones;

import java.util.Scanner;

/**
 *
 * @author Dorys Erazo Ortega.
 */
public class FraccioneService {

    FraccionesObjeto frac = new FraccionesObjeto();
    Scanner lire = new Scanner(System.in);

    public FraccionesObjeto ingresarFracciones() {
        System.out.println("Ingrese el primer numerador");
        frac.setNumerador1(lire.nextInt());
        System.out.println("Ingrese el primer denominador");
        frac.setDenominador1(lire.nextInt());
        System.out.println("Ingrese el segundo numerador");
        frac.setNumerador2(lire.nextInt());
        System.out.println("Ingrese el segundo denominador");
        frac.setDenominador2(lire.nextInt());
        System.out.println("Las fracciones ingresadas son: " + frac.getNumerador1()
                + "/" + frac.getDenominador1() + " y " + frac.getNumerador2()
                + "/" + frac.getDenominador2());
        menuCompleto(frac);
        System.out.println("*************************");
        return frac;
    }

    public static int maxComDiv(int r2, int r1) {
        int r;
//        System.out.println("Ingrese un número");
//        r1 = lire.nextInt();
//        System.out.println("Ingrese un segundo número");
//        r2 = lire.nextInt();
        if (r2 > r1) {
            do {
                r = r1;
                r1 = r2 % r1;
                r2 = r;
            } while (r1 != 0);
            //System.out.println("el mcd es " + r);
        } else {
            do {
                r = r2;
                r2 = r1 % r2;
                r1 = r;
            } while (r2 != 0);
            //System.out.println("el mcd es " + r);
        }
        return r;
    }

    public int simplificar(int respuesta, int a, int b) {
        if (respuesta > 0) {
            System.out.print("La respuesta es: " + (respuesta) + " " + (a % b) + "/" + b);
        } else {
            System.out.println("La respuesta es: " + a + "/" + b);
        }
        System.out.println(" ");
        return respuesta;
    }

    public void sumaFraccion(FraccionesObjeto f1) {
        int rnumer, rdenom;
        rnumer = f1.getNumerador1() * f1.getDenominador2() + f1.getNumerador2() * f1.getDenominador1();
        rdenom = f1.getDenominador1() * f1.getDenominador2();
        int rfnum = rnumer / maxComDiv(rnumer, rdenom);
        int rfden = rdenom / maxComDiv(rnumer, rdenom);
        int result = rfnum / rfden;
        simplificar(result, rfnum, rfden);
        System.out.println("*****************************");
    }

    public void restaFraccion(FraccionesObjeto f1) {
        int rnumer, rdenom;
        rnumer = f1.getNumerador1() * f1.getDenominador2() - f1.getNumerador2() * f1.getDenominador1();
        rdenom = f1.getDenominador1() * f1.getDenominador2();
        int rfnum = rnumer / maxComDiv(rnumer, rdenom);
        int rfden = rdenom / maxComDiv(rnumer, rdenom);
        int result = rfnum / rfden;
        simplificar(result, rfnum, rfden);
        System.out.println("*****************************");
    }

    public void multiplicacionFraccion(FraccionesObjeto f1) {
        int rnumer, rdenom, rfnum, rfden;
        rnumer = f1.getNumerador1() * f1.getNumerador2();
        rdenom = f1.getDenominador1() * f1.getDenominador2();
        rfnum = rnumer / maxComDiv(rnumer, rdenom);
        rfden = rdenom / maxComDiv(rnumer, rdenom);
        int result = rfnum / rfden;
        simplificar(result, rfnum, rfden);
        System.out.println("*****************************");
    }

    public void divisionFraccion(FraccionesObjeto f1) {
        int rnumer, rdenom, rfnum, rfden;
        rnumer = f1.getNumerador1() * f1.getDenominador2();
        rdenom = f1.getDenominador1() * f1.getNumerador2();
        rfnum = rnumer / maxComDiv(rnumer, rdenom);
        rfden = rdenom / maxComDiv(rnumer, rdenom);
        int result = rfnum / rfden;
        simplificar(result, rfnum, rfden);
        System.out.println("*****************************");
    }

    public void menuCompleto(FraccionesObjeto f1) {
        int opcion = 0;
        do {
            System.out.println("Escoja la opción de una operación que quiera realizar");
            System.out.println("1. Suma de fracciones");
            System.out.println("2. Resta de fracciones");
            System.out.println("3. Multiplicación de fracciones");
            System.out.println("4. División de fracciones");
            System.out.println("5. Salir");
            opcion = lire.nextInt();
            switch (opcion) {
                case 1:
                    sumaFraccion(f1);
                    break;
                case 2:
                    restaFraccion(f1);
                    break;
                case 3:
                    multiplicacionFraccion(f1);
                    break;
                case 4:
                    divisionFraccion(f1);
                    break;
                case 5:
                    System.out.println("Gracias por usar esta calculadora. Ð");
                    break;
                default:
                    System.out.println("Opción no válida. Ingrese otra opción.");
            }
        } while (opcion != 5);

    }

}
