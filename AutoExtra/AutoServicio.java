/*
Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.
 */
package AutoExtra;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Dorys Erazo Ortega
 */
public class AutoServicio {

    Auto ficha = new Auto();
    Scanner lire = new Scanner(System.in);

    public Auto crearFicha() {
        System.out.println("Ingrese su usuario por favor");
        ficha.setPropietario(lire.next());
        System.out.println("Bienvenido " + ficha.getPropietario() + " ingrese los datos de su auto");
        System.out.println("¿El modelo de su auto es?");
        ficha.setModelo(lire.next());
        ficha.getModelo();
        System.out.println("Ingrese la fecha de caducidad de su licencia dd/mm/aaaa");
        int d = lire.nextInt();
        int m = lire.nextInt();
        int a = lire.nextInt();
        Date fecha = new Date(a - 1900, m - 1, d);
        ficha.setVencimiento(fecha);
        ficha.getVencimiento();
        ficha.setKm(7500);
        System.out.println("-------------------------");
        System.out.println("Su nombre es: " + ficha.getPropietario());
        System.out.println("El modelo de su auto es: " + ficha.getModelo());
        System.out.println("Su licencia vence en: " + ficha.getVencimiento());
        System.out.println("El kilometraje de su auto es: " + ficha.getKm() + " km");

        return ficha;
    }

    public void cambioUsuario(Auto auto) {
        System.out.println("Ingrese el nuevo nombre");
        auto.setPropietario(lire.next());
        System.out.println("El nuevo nombre asignado es: " + auto.getPropietario());
    }

    public void recorrido(Auto auto) {
        System.out.println("Ingrese los kilómetros que ha recorrido");
        int kmrecor = lire.nextInt();
        auto.setKm(auto.getKm() + kmrecor);
        System.out.println("Usted tiene en total " + auto.getKm() + "km recorridos");
    }

    public void mantenimiento(Auto auto) {
        System.out.println((auto.getKm() >= 10000) ? "Es necesario realizar un mantenimiento" : "Por el momento no requiere mantenimiento ");
    }

}
