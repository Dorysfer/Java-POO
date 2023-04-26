/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaIMC;

/**
 *
 * @author Home
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService person = new PersonaService();
        /*A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores*/

        int n = 4;//numero de personas que se quiere conocer los atributos
        // contador para la edad y el IMC.
        int cont = 0, cont1 = 0, cont2 = 0, contador2 = 0, contador3 = 0;
        for (int i = 0; i < n; i++) {
            PersonaObjeto per = person.datosResumidos();
            if (person.esMayorDeEdad()) {
                ++contador2;
            } else {
                ++contador3;
            }
            if (person.calcularIMC(per) == -1) {
                cont++;
                System.out.println("Usted tiene un peso por debajo del ideal :( ");
            }
            if (person.calcularIMC(per) == 0) {
                cont1++;
                System.out.println("Usted tiene un peso ideal :) ");
            }
            if (person.calcularIMC(per) == 1) {
                cont2++;
                System.out.println("Usted tiene sobrepeso :( ");
            }
            System.out.println("--------------------------");
        }
        System.out.println("--------------------------");
        double porcent1 = (contador2 * 100) / n;
        double porcent2 = 100 - porcent1;
        System.out.println("El porcentaje de personas mayores de edad es: " + porcent1 + "%");
        System.out.println("El porcentaje de personas menores de edad es: " + porcent2 + "%");
        double percent = (cont * 100) / n;
        double percent1 = (cont1 * 100) / n;
        double percent2 = (cont2 * 100) / n;
        System.out.println("El porcentaje de personas con bajo peso es: " + percent + "%");
        System.out.println("El porcentaje de personas con peso ideal es: " + percent1 + "%");
        System.out.println("El porcentaje de personas con sobrepeso es: " + percent2 + "%");
        System.out.println("--------------------------");

    }
}
