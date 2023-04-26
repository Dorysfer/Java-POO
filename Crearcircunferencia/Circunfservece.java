/*
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package Crearcircunferencia;

import java.util.Scanner;

/**
 *
 * @author Dorys Erazo Ortega
 */
class Circunfservece {
    
    
    public Circunf crearCircunfer(){
        Circunf c1=new Circunf();
        Scanner lire=new Scanner(System.in);
        System.out.println("Ingrese el valor del radio ");
        System.out.print("El radio es: ");
         c1.setRad(lire.nextDouble());
         c1.getRad();
         return c1;
     }
    public void calcularArea(Circunf c1){
        double area =Math.PI*Math.pow(c1.getRad(),2);
        System.out.println("El área es: "+area);
        System.out.println("----------------");
    }
    public void calcularPerimetro(Circunf c1){
        double perimetro =2*Math.PI*c1.getRad();
        System.out.println("El perímetro es: "+perimetro);
        System.out.println("----------------");
    }
}
