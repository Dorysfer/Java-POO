/*
 * Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.

 */
package PersonaIMC;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class PersonaService {

    /* Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje*/
    Scanner lire = new Scanner(System.in);
    PersonaObjeto per = new PersonaObjeto();

    public void crearPersona(PersonaObjeto p) {

        System.out.println("¿Cuál es su nombre?");
        per.setNombre(lire.next());
        System.out.println("¿Cuál es su sexo? H(hombre), M(mujer) u O(otro)");
        char var = lire.next().toUpperCase().charAt(0);
        while (var != 'H' && var != 'M' && var != 'O') {
            System.out.println("Opción no válida. Ingrese otro caracter");
            var = lire.next().toUpperCase().charAt(0);
        }
        per.setSexo(var);
        System.out.println("¿Cuál es su edad?");
        per.setEdad(lire.nextInt());
        System.out.println("¿Cuál es su altura?");
        per.setAltura(lire.nextDouble());
        System.out.println("¿Cuál es su peso?");
        per.setPeso(lire.nextInt());

    }

    /*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.*/
    public int calcularIMC(PersonaObjeto p1) {
        double IMC;
        int a=0;
        IMC = p1.getPeso() / Math.pow(p1.getAltura(), 2);
        if (IMC < 20) {
            a=-1;
            return a;
        }
        if (IMC >= 20 && IMC <= 25) {
            a=0;
           return a;
        } 
        if (IMC > 25) {
            a=1;
            return a;
        }
        return a;
        
    }

    /*Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.*/
    public boolean esMayorDeEdad() {
        return per.getEdad() >= 18;
    }

    public PersonaObjeto datosResumidos() {
        // String vectorPersona[] = {"per.getNombre()", "per.getEdad()", "per.getSexo()", "per.getPeso()", "per.getAltura()"};

        crearPersona(per);
        calcularIMC(per);
        System.out.println("¿Es la persona mayor de edad? " + esMayorDeEdad());
       
        return per;
    }

    

}
