/*
 Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package CafeteraNespresso;
import java.util.Scanner;

/**
 *
 * @author Dorys Erazo Ortega
 */
public class Nespressoservice {
    Scanner lire = new Scanner(System.in);
    public Nespressodatos llenarCafetera(){
        Nespressodatos cafet=new Nespressodatos();
        int total=2000;
        cafet.setCapacidadMaxima(total);
        System.out.println("La capacidad máxima de la cafetera es: "+cafet.getCapacidadMaxima()+" ml");
        cafet.setCantidadActual(cafet.getCapacidadMaxima());
        return cafet;
    }
    public void servirTaza(Nespressodatos cafet){
        System.out.println("Ingrese el tamaño de la taza de café que desea tomar");
        int taza = lire.nextInt(),total=0;
        if (taza>cafet.getCantidadActual()) {
            total=taza -cafet.getCantidadActual();
            System.out.println("No es posible servirle esta taza de "+taza+" ml, únicamente "+cafet.getCantidadActual()+" ml");
            cafet.setCantidadActual(total);
            } else {
            total=cafet.getCantidadActual()-taza;
            cafet.setCantidadActual(total);
            cafet.getCantidadActual();
            System.out.println("El volumen de café restante es: " + cafet.getCantidadActual()+ " ml");
        }
        System.out.println("***************************");
    }
    public void vaciarCafetera(Nespressodatos cafet) {
        int total=0;
        total=cafet.getCantidadActual()-cafet.getCantidadActual();
        cafet.setCantidadActual(total);
        System.out.println("La cafetera ha sido vaceada, tiene: "+cafet.getCantidadActual()+" ml");
        System.out.println("***************************");
    }
    public void agregarCafe(Nespressodatos cafet) {
        System.out.println("Ingrese la cantidad de café que quiere agregar");
        int agreg = lire.nextInt(), total = 0;
        total = agreg + cafet.getCantidadActual();
        if (total <= cafet.getCapacidadMaxima()) {
            cafet.setCantidadActual(total);
            System.out.println("La cafetera contiene: " + cafet.getCantidadActual() + " ml");
        } else {
            total=cafet.getCapacidadMaxima();
            cafet.setCantidadActual(total);
            System.out.println("La cafetera esta llena, ¡DETÉNGASE! Contiene "+cafet.getCantidadActual()+" ml");
        }
    System.out.println("***************************");
    }
}    

