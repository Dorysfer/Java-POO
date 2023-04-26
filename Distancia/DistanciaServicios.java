/*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
 */
package Distancia;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class DistanciaServicios {
    Scanner lire = new Scanner(System.in);
        
    public DistanciaMetodos generarObjeto(){
        DistanciaMetodos dist= new DistanciaMetodos();
        System.out.println("Ingrese el valor de X1");
        dist.setX1(lire.nextDouble());
        System.out.println("Ingrese el valor de X2");
        dist.setX2(lire.nextDouble());
        System.out.println("Ingrese el valor de y1");
        dist.setY1(lire.nextDouble());
        System.out.println("Ingrese el valor de y2");
        dist.setY2(lire.nextDouble());
       return dist;
    }
    public void calcularDistancia(DistanciaMetodos dist){
        
       double resultado=Math.sqrt(Math.pow(dist.getX1()-dist.getX2(),2)+(Math.pow(dist.getY1()-dist.getY2(),2)));
        System.out.println("El resultado es: "+resultado);
    }
}
    
  