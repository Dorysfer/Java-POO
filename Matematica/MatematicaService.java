/*
 * Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:*/




package Matematica;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class MatematicaService {

    Matematica mat = new Matematica();
    Scanner lire = new Scanner(System.in);
    public Matematica generarNumeros(){
        mat.setNum1(Math.random()*10);
        System.out.println("El primer número es: "+mat.getNum1());
        mat.setNum2(Math.random()*10);
        System.out.println("El segundo número es: "+mat.getNum2());
        return mat;
    }
/*a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor*/
    public void devolverMayor (Matematica r) {
        System.out.println((mat.getNum1() > mat.getNum2()) ? "El número mayor es: "+mat.getNum1() : mat.getNum2());
    }
  /*b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.*/
    public void calcularPotencia(Matematica r1){
        mat.setNum1(Math.round(mat.getNum1()));
        mat.setNum2(Math.round(mat.getNum2()));
        double r;
        if (mat.getNum1()>=mat.getNum2()) {
            r=Math.pow(mat.getNum1(), mat.getNum2());
            System.out.println(+mat.getNum1()+" elevado a "+mat.getNum2()+" es: "+r);
        } else {
            r=Math.pow(mat.getNum2(), mat.getNum1());
            System.out.println(+mat.getNum2()+" elevado a "+mat.getNum1()+" es: "+r);
        }
    }
    /*c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
  public void calcularRaiz (Matematica r1){
        mat.setNum1(Math.abs(Math.round(mat.getNum1())));
        mat.setNum2(Math.abs(Math.round(mat.getNum2())));
        double r;
        if (mat.getNum1()>=mat.getNum2()) {
            r=Math.sqrt(mat.getNum1());
            System.out.println("La raíz cuadradaa de "+mat.getNum1()+" es: "+r);
        } else {
            r=Math.sqrt(mat.getNum2());
            System.out.println("La raíz cuadradaa de "+mat.getNum2()+" es: "+r);
        }
    }
    
}
