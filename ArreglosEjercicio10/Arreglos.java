/*
 * Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package ArreglosEjercicio10;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 *
 * @author Home
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double vector1[], vector2[];
       vector1=new double[50];
       vector2=new double[20];
       
        for (int i = 0; i < vector1.length; i++) {
            vector1[i]= (Math.round((Math.random()*20)*10))/10;
        }
        Arrays.sort(vector1);
        for (int i = 0; i < vector1.length; i++) {
            System.out.print(vector1[i]+", ");  
        }
        
        for (int i = 0; i < vector2.length; i++) {
            if(i<10){
               System.arraycopy(vector1, 0, vector2, 0, 10);
            }
            if(i>=10){
            vector2[i]= 0.5; 
            }
        }
        for (int i = 0; i < vector2.length; i++) {
        System.out.print(vector2[i]+", ");    
        }
        System.out.println(""); 
        System.out.println("------------------------ Ð");   
    }
    
}
