/*
 * Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package AlumnosEjercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Home
 */
public class AlumnoService {

    ArrayList<AlumnObjeto> alum = new ArrayList();
    Scanner lire = new Scanner(System.in);
    String respuesta;
    AlumnObjeto alu = new AlumnObjeto();

    public AlumnObjeto crearAlumno() {
        do {
            System.out.println("Ingrese el nombre del alumno");
            alu.setNombre(lire.next());
            alum.add(new AlumnObjeto(alu.getNombre(), alu.getNota()));
            Promedio(alu);
            System.out.println("Desea ingresar otro alumno? S / N");
            respuesta = lire.next();
        } while (!"n".equalsIgnoreCase(respuesta));

//        alum.forEach((nombre) -> System.out.println(nombre.getNombre() + " su promedio es:  " + Promedio(alu)));
        System.out.println("**********************");
        return alu;
    }

    public int Promedio(AlumnObjeto ac) {
        ArrayList<Integer> notas = new ArrayList<>();
        System.out.println("Ingrese la primera nota ");
        notas.add(lire.nextInt());
        System.out.println("Ingrese la segunda nota ");
        notas.add(lire.nextInt());
        System.out.println("Ingrese la tercera nota ");
        notas.add(lire.nextInt());
        double prom = 0;
        for (int i = 0; i < notas.size(); i++) {
            prom += notas.get(i);
        }
        prom = prom / notas.size();
        ac.setPromedio(prom);
        //notas.add((int)prom);
        //notas.forEach((note) -> System.out.print(note + ", "));
        return (int) prom;
    }

    public void notaFinal(AlumnObjeto cc) {
       System.out.println("Ingrese el nombre del alumno que quiere consultar su nota");
       String var=lire.next();
       int cont=0;
        Iterator <AlumnObjeto> iter=alum.iterator();
        
        while(iter.hasNext()){
            if (iter.next().getNombre().equals(var)) {
                cont++;
                System.out.println(cc.getNombre()+ " su promedio es:  " + cc.getPromedio());
            }
        }
            if(cont==0)
               System.out.println("Alumno no encontrado"); 
        } 
       
        
//        alum.forEach((nombre) -> {
//            if (nombre.getNombre().equals(var)) {
//                System.out.println(nombre.getNombre() + " su promedio es:  " + Promedio(prom));
//            }
//        });
       
            
        }
   