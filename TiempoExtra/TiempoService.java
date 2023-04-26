/*
 * Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola???
 */
package TiempoExtra;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Home
 */
public class TiempoService {

    Scanner lire = new Scanner(System.in);
    TiempObjetos tempo = new TiempObjetos();

    //LocalTime enEsteMomento= LocalTime.now();
    public TiempObjetos validarHora() {
        int h, m, s;
//Se hace para validar la hora, si los datos se ingresan mal, se repite cada campo hasta que sea el correcto.
        do {
            System.out.println("Ingrese la hora");
            h = lire.nextInt();
        } while (h >= 24);
        do {
            System.out.println("Ingrese los minutos");
            m = (lire.nextInt());
        } while (m >= 60);
        do {
            System.out.println("Ingrese los segundos");
            s = (lire.nextInt());
        } while (s >= 60);

        LocalTime horAct = LocalTime.of(h, m, s);
        tempo.setHorActual(horAct);
        System.out.println("La hora actual es: " + tempo.getHorActual().getHour() + ":" + tempo.getHorActual().getMinute() + ":" + tempo.getHorActual().getSecond());

//        System.out.println(enEsteMomento); Se podría poner esta hora desde aquí para que el programa corra desde ahí.
        return tempo;
    }

    public void imprimirHora(LocalTime t) {
        Timer execute = new Timer("Reloj por consola");
        TimerTask fechaImpresa;
        fechaImpresa = new TimerTask() {
            int ciclos = 0;

            @Override
            public void run() {
                if (ciclos == 10) {
                    execute.cancel();
                } else {
                    ciclos++;
                    tempo.setHorActual(tempo.getHorActual().plusSeconds(1));// el 1 indica que hay que sumar 1 segundo durante 10 ciclos(veces)
                    System.out.println((tempo.getHorActual().getSecond() == 0) ? tempo.toString() + ":00" : tempo.toString());
                }
            }
        };
        execute.scheduleAtFixedRate(fechaImpresa, 0, 1000);
    }
}

//public static Clock offset(Clock baseClock, Duration offsetDuration)

