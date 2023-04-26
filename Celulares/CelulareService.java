/*
 *Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package Celulares;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class CelulareService {
    CelularesObjeto celu= new CelularesObjeto();
   Scanner lire=new Scanner(System.in);
    public CelularesObjeto cargarCelular(){
        System.out.println("Ingrese la marca de su equipo móvil");
        celu.setMarca(lire.nextLine());
        System.out.println("Ingrese el modelo de su equipo móvil");
        celu.setModelo(lire.nextLine());
        System.out.println("Ingrese el tamaño de la memoria RAM");
        celu.setMemoriaRam(lire.nextInt());
        System.out.println("Ingrese el tamaño del almacenamiento");
        celu.setMemoriaRam(lire.nextInt());
        System.out.println("Ingrese el precio");
        celu.setPrecio(lire.nextDouble());
        ingresarCodigo(celu.getCodigo());
        System.out.println("");
        System.out.println("Ð :)");
        return celu;
    }
    public void ingresarCodigo(int[] a ){//mi vector se llama a, es un valor por referencia
        System.out.println("Ingrese cada uno de los dígitos del código de su teléfono");
        for (int i = 0; i <a.length ; i++){
            a[i]= lire.nextInt();
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+".");
        }
    }
    
}
