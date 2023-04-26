/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Home
 */
class Operaciones {

    public Variable CrearOperacion() {
        Variable op = new Variable();
        Scanner lire = new Scanner(System.in);
        System.out.println("El primer número es: ");
        op.setNum1(lire.nextInt());
        System.out.println("El segundo número es: ");
        op.setNum2(lire.nextInt());
        return op;
    }
    public void Sumar(Variable calc) {
        double resultado = calc.getNum1() + calc.getNum2();
        System.out.println("El resultado de la suma es: " + resultado);
    }
    public void Restar(Variable calc) {
        double resultado = calc.getNum1()-calc.getNum2();
        System.out.println("El resultado de la resta es: " + resultado);
    }
    
    public void Multiplicar(Variable calc) {
        if (calc.getNum1() != 0 && calc.getNum2() != 0) {
            double resultado = calc.getNum1() * calc.getNum2();
            System.out.println("El resultado de la multiplicación es: " + resultado);
        } else {
            System.out.println("El resultado de la multiplicación es: 0");
            System.out.println("*Todo número multiplicado por 0 es 0");
        }

    }

    public void Dividir(Variable calc) {
        if (calc.getNum1() != 0 && calc.getNum2() != 0) {
            double resultado = calc.getNum1() / calc.getNum2();
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            if (calc.getNum1() == 0) {
                System.out.println("El resultado de la división es: 0");
                System.out.println("*0 dividido para un número es 0");
            } else{
            if (calc.getNum2() == 0) {
                System.out.println("La división para 0 o no existe");
            }
            }
        }
    }
}

    

    
   