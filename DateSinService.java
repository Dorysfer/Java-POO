
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class DateSinService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner lire = new Scanner(System.in);
        System.out.println("Por favor ingrese una fecha em el formato: aaaa/mm/dd ");
        int d = lire.nextInt();
        int m = lire.nextInt();
        int a = lire.nextInt();
        LocalDate fecha= LocalDate.
        LocalDate hoy= LocalDate.now();
        Period periodoEntre= Period.between(fecha,hoy);
        System.out.printf("El tiempo transcurrido entre la fecha ingresada y hoy, es: %s años, %s meses y %s días",
                    periodoEntre.getYears(), periodoEntre.getMonths(), periodoEntre.getDays());
    }

    
    
}
