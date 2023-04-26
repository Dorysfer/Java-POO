/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculoEdad;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Home
 */
public class PerEdadService {

    /*Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 */
    PerEdadObjeto p1 = new PerEdadObjeto();
    Scanner lire = new Scanner(System.in);
    LocalDate hoy = LocalDate.now();

    public PerEdadObjeto crearPersona() {
        System.out.println("Ingrese su nombre: ");
        p1.setPersona(lire.nextLine());
        System.out.println("Ingrese su fecha de nacimiento en el formato: aaaa/mm/dd");
        int anio = lire.nextInt(), mes = lire.nextInt(), dia = lire.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        p1.setFechanac(fecha);
        System.out.println("Su nombre es: " + p1.getPersona() + " y su fecha de nacimiento es: "
                + p1.getFechanac());
        return p1;
    }

    /*Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.*/
    public void calcularEdad(PerEdadObjeto p1) {
        LocalDate fecha = LocalDate.of(p1.getFechanac().getYear() + 1900, p1.getFechanac().getMonth() + 1,
                p1.getFechanac().getDate());
        Period periodo = Period.between(fecha, hoy);
        System.out.printf("Tu edad es: %s años, %s meses y %s días",
                periodo.getYears(), periodo.getMonths(), periodo.getDays());
        System.out.println("-------------------------");

    }

    /*Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.  */
    public void otraPersona(PerEdadObjeto p2) {
        System.out.println("Ingrese el nombre de otra persona");
        p2.setNombre(lire.next());
        System.out.println("Ingrese una nueva fecha: ");
        int anio = lire.nextInt(), mes = lire.nextInt(), dia = lire.nextInt();
        Date fechaNueva = new Date(anio - 1900, mes - 1, dia);
        p2.setFechanac2(fechaNueva);
        System.out.println(p2.getFechanac2());

    }

    public boolean mayorQue() {
       boolean result;
        result = p1.getFechanac().before(p1.getFechanac2());
//        switch (result){
//            case (-1):
//                return false;
//            case (1):
//                return true;
//            default:
                return result;
                
        }
        
    }
//   public boolean menorQue(){
//        boolean result;
//            result= p1.getFechanac().compareTo(p1.getFechanac2())<0;
//            return result;
// }         
//   public void compararFechas(boolean r1, boolean r2){
//        if (mayorQue()) {
//            System.out.println(p1.getPersona() + " Es menor que " + p1.getNombre() + " ? ," + r1);
//        } else if (menorQue()) {
//            System.out.println(p1.getNombre() + " Es mayor que " + p1.getPersona() + " ? ," + r2);
//        }
//
//    }

