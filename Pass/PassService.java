/*
 * 

Ejercicio 3
Crear una clase Pass, donde declaremos los siguientes atributos:
● pass : Del tipo String
● nombre: Del tipo String
● dni: Del tipo int.
Métodos para desarrollar:
● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
teclado)
● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.


 */
package Pass;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dorys Erazo Ortega
 */
public class PassService {

    PassObjetos persona = new PassObjetos();
    Scanner lire = new Scanner(System.in);

    /*Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.*/
    public void crearPass() {
        System.out.println("Digite su contraseña");
        String[] b;//necesito una variable que sea leída por teclado

        do {
            b = lire.next().split("");
            System.out.println((b.length == 10) ? "Contraseña correcta" : "Contraseña incorrecta");
        } while (b.length != 10);
        persona.setPass(b);
        //System.out.println(Arrays.toString(persona.getPass()));
        System.out.println("-----------------------");
    }

    /*● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO*/
    public void analizarPass(PassObjetos p1) {
        int a = 0, z = 0; //contadores para las letras a y z respectivamente
        for (String pas : p1.getPass()) {
            if (pas.equalsIgnoreCase("a")) {
                a++;
            }
            if (pas.equalsIgnoreCase("z")) {
                z++;
            }
        }
        System.out.println(a >= 2 && z >= 1 ? "El nivel de su contraseña es ALTO" : z >= 1 ? "El nivel de su contraseña es MEDIO" : "Su contraseña tiene un nivel BAJO");
        System.out.println("-----------------------------");
    }

    /*● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
● A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambio*/
    public void modificarContrasena(PassObjetos p3) {
        System.out.println("Para continuar, por favor ingrese su contraseña");
        if (Arrays.equals(p3.getPass(), lire.next().split(""))) {
            crearPass();
            //System.out.println("Ingrese una nueva contraseña");
            //p3.setPass(lire.next().split(""));
            //p3.getPass();
            System.out.println("Su contraseña ha sido cambiada exitosamente.");
        }else{
            System.out.println("Operación no válida");
        }
        System.out.println("------------------------------");
    }

    public void modificarNombre(PassObjetos p3) {
        System.out.println("Para continuar, por favor ingrese su contraseña");
        if (Arrays.equals(p3.getPass(), lire.next().split(""))) {
            System.out.println("Digite su nuevo nombre");
            p3.setNombre(lire.next());
            p3.getNombre();
        } else {
            System.out.println("Operación no válida");
        }
    }

    public void modificarDni(PassObjetos p3) {
        System.out.println("Para continuar, por favor ingrese su contraseña");
        if (Arrays.equals(p3.getPass(), lire.next().split(""))) {
            System.out.println("Ingrese un nuevo DNI");
            p3.setDNI(lire.nextInt());
            p3.getDNI();
        } else {
            System.out.println("Operación no válida");
        }
    }
// Este programa es el principal, de tal forma que todos los métodos vayan en cada opción del Switch
    @SuppressWarnings("null")
    public PassObjetos cambioDatos() {
        String opcion = null;
        do {
            System.out.println("Elija una de las siguientes opciones:");
            System.out.println("A. Ingresar contraseña");
            System.out.println("B. Nivel de contraseña");
            System.out.println("C. Modificar contraseña");
            System.out.println("D. Modificar nombre");
            System.out.println("E. Modificar DNI");
            System.out.println("F. Salir");
            System.out.println("Seleccione una opción:");
            opcion = lire.next().toUpperCase();
            switch (opcion) {
                case "A":
                    crearPass();
                    break;
                case "B":
                    analizarPass(persona);
                    break;
                case "C":
                    modificarContrasena(persona);
                    break;
                case "D":
                    modificarNombre(persona);
                    break;
                case "E":
                    modificarDni(persona);
                    break;
                case "F":
                    System.out.println("Salir");;
                    break;
                default:
                    System.out.println("Opción no válida. Intente otra vez");
            }
        } while (!opcion.equalsIgnoreCase("F"));
        System.out.println("Gracias por usar este servicio. Ð");
        return persona;
    }

}
