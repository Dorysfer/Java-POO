/*
 * 

 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
package EcuacionSegundoGrado;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class EcSegService {
    Scanner lire = new Scanner(System.in);
    Raices discri=new Raices();
    /*Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:*/
    
    public Raices coeficientes(){
        System.out.println("Ingrese el valor del coeficiente 'a'");
        discri.setA(lire.nextDouble());
        System.out.println("Ingrese el valor del coeficiente 'b'");
        discri.setB(lire.nextDouble());
        System.out.println("Ingrese el valor del coeficiente 'c'");
        discri.setC(lire.nextDouble());
    return discri;
    }
    /*Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c*/
    
    public void Discriminante(Raices discri){
        discri.setDiscriminante((Math.pow(discri.getB(), 2)-4*discri.getA()*discri.getC()));
        System.out.println("El valor del discriminante es: "+discri.getDiscriminante());
    }
    /*Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.*/
    public boolean tieneRaices(Raices discri){
        boolean respuesta=(discri.getDiscriminante()>0);
        return respuesta;
    }
    /*Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.*/
    public boolean tieneRaiz(Raices discri){
        boolean respuesta=(discri.getDiscriminante()==0);
        return respuesta;
    }    
        /*Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.*/
    public void obtenerRaices(Raices discri){
        double x1;
        x1 = (-1*discri.getB()+Math.sqrt(discri.getDiscriminante()))/2*discri.getA();
        double x2;
        x2 = (-1*discri.getB()-Math.sqrt(discri.getDiscriminante()))/2*discri.getA();
        System.out.println("La ecuacion tiene dos soluciones reales y diferentes");
        System.out.println("X1 es: "+x1+" y X2 es: "+x2);
        }
    /*Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.*/
        
     public void obtenerRaiz(Raices discri){
        double x1;
        x1 = (-1*discri.getB()+Math.sqrt(discri.getDiscriminante()))/2*discri.getA();
            System.out.println("La ecuacion tiene dos raices reales iguales" );
            System.out.println("x1 es igual a X2 y es: "+x1);
     }
     /*Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
     public void calcular(Raices discri){
       if(tieneRaices(discri)){
           obtenerRaices(discri);
       }else if(tieneRaiz(discri)){
           obtenerRaiz(discri);
       } else{
           System.out.println("La ecuación no tiene soluciones reales,"
                   + " está en el campo de los complejos");
       }
     }
     }
  
    
    
    
    
    
    