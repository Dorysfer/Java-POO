/*
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Metodos m1= new Metodos();
       Cliente c1= m1.Cuenta();
       Scanner lire=new Scanner(System.in);
        int opt=0;
        do {   
        System.out.println("Escoja una opción");
        System.out.println("1.- Depósito");
        System.out.println("2.- Retiro");
        System.out.println("3.- Retiro rápido");
        System.out.println("4.- Consulta de saldo");
        System.out.println("5.- Consulta de cuenta");
        System.out.println("6.- Salir");
        opt=lire.nextInt();
            switch (opt){
                case 1:
                    m1.IngresarDinero(c1);
                    break;
                case 2:
                    m1.RetirarDinero(c1);
                    break;
                case 3:
                    m1.RetirarDineroRapido(c1);
                    break;
                case 4:
                    m1.ConsultaSaldo(c1);
                    break;
                case 5:
                    m1.ConsultarCuenta(c1);
                    break;
                case 6:
                    System.out.println("Gracias por usar este servicio");
                    break;
                default:
                    System.out.println("Opción incorrecta, escoja una opción válida");
               }
        } 
        while(opt!=6);
    }
}
