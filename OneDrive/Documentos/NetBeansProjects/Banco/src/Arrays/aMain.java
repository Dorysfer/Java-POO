/*
 *  Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author Dorys Erazo Ortega
 */
public class aMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        No es necesario crear las clases de entidades ni servicios, en el main se realiza todo.
        
        Scanner lire = new Scanner(System.in);
//    
        String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String meSecreto = meses[7];
        System.out.println("Este es un juego para adivinar uno de los doce meses del año");
        System.out.println("La única regla es escribir el nombre del mes que usted escoja");
        System.out.println("----------------------------");
        System.out.println("");
        
        System.out.println("Escriba uno de los doce meses del año");
        
        do {
            meSecreto = lire.next();
            if (meSecreto.equalsIgnoreCase(meses[7])) {
                System.out.println("Acertó, este es el mes secreto");
            } else {
                System.out.println("Mes equivocado, intente otra vez");
            }
        } while (!meSecreto.equalsIgnoreCase(meses[7]));
        System.out.println("Adiós :) Ð");
        
        
    }
    
}
