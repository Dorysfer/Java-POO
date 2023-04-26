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
public class Metodos {
 Scanner lire = new Scanner(System.in);
    public Cliente Cuenta() {
        Cliente c1 = new Cliente();
        System.out.println("Ingrese su número de identificación");
        c1.setDNI(lire.nextLong());
        System.out.println("Ingrese su número de cuenta: ");
        c1.setNumeroDeCuenta(lire.next());
        System.out.println("Ingrese la cantidad de apertura");
        c1.setSaldoActual(lire.nextInt());
        System.out.println("Usted actualmente cuenta con un saldo de: " + c1.getSaldoActual() + "$");
        System.out.println("***************************");
        return c1;
    }

    public void IngresarDinero(Cliente c1) {
        System.out.println("Ingrese la cantidad de dinero que quiere depositar");
        int deposito = lire.nextInt(), total = 0;
        total = deposito + c1.getSaldoActual();
        c1.setSaldoActual(total);
        System.out.println("Su saldo actual es; " + c1.getSaldoActual());
        System.out.println("***************************");
    }

    public void RetirarDinero(Cliente c1) {
        System.out.println("Ingrese la cantidad de dinero que quiere retirar");
        int retiro = lire.nextInt(), total = 0;
        if (c1.getSaldoActual() < retiro) {
            c1.setSaldoActual(0);
            System.out.println("Su saldo actual es: " + c1.getSaldoActual());
        } else {
            total = c1.getSaldoActual() - retiro;
            c1.setSaldoActual(total);
            System.out.println("Su saldo actual es: " + c1.getSaldoActual());
        }
        System.out.println("***************************");
    }

    public void RetirarDineroRapido(Cliente c1) {
        System.out.println("Ingrese la cantidad de dinero que quiere retirar");
        int retiro = lire.nextInt(), total = 0;
        if (0.2 * c1.getSaldoActual() < retiro) {
            System.out.println("No puede realizar esta transacción. Su saldo actual es: " + c1.getSaldoActual());
        } else {
            total = c1.getSaldoActual() - retiro;
            c1.setSaldoActual(total);
            System.out.println("Transacción efectuada");
            System.out.println("Su saldo actual es: " + c1.getSaldoActual());
        }
        System.out.println("***************************");
    }

    public void ConsultaSaldo(Cliente c1) {
        System.out.println("Su saldo actual es; " + c1.getSaldoActual());
        System.out.println("***************************");
    }

    public String ConsultarCuenta(Cliente c1) {
        System.out.println(c1.toString());
        return c1.toString();

    }
}
