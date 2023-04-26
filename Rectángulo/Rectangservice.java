/*
 *Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
 */
package Rectángulo;

import java.util.Scanner;

/**
 *
 * @author Dorys Erazo Ortega
 */
public class Rectangservice {
    Scanner lire=new Scanner(System.in);
    
    public Rectangdatos crearRectang(){
        Rectangdatos r=new Rectangdatos();
        System.out.println("Ingrese la base del rectángulo deseado");
        r.setBase(lire.nextInt());
        r.getBase();
        System.out.println("Ingrese la altura del rectángulo deseado");
        r.setAltura(lire.nextInt());
        r.getAltura();
        return r;
    }
    public void areaRectangulo(Rectangdatos rec){
        rec.setArea(rec.getAltura()*rec.getBase());
        rec.getArea();
        System.out.println("El área del rectángulo es: "+rec.getArea()+" unidades cuadradas");
        
    }
    public void perimetroRectangulo(Rectangdatos rec){
        rec.setPerimetro(2*(rec.getAltura()+rec.getBase()));
        rec.getPerimetro();
        System.out.println("El perímetro del rectángulo es: "+rec.getPerimetro()+" unidades");
        
    }
    public void dibujarRectangulo(Rectangdatos rec) {
        System.out.println("Este es su rectángulo");
        for (int i = 0; i < rec.getAltura(); i++) {
            for (int j = 0; j < rec.getBase(); j++) {
            if (i == 0 || i == rec.getAltura()-1 ||j == 0 || j == rec.getBase()-1)
                   System.out.print(" * ");
                 else 
                    System.out.print("   ");
                }
            System.out.println("");
            }
        
        }
    
    }


