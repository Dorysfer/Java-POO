/*
 * Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:

 
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package CalculoEdad;

import java.time.LocalDate;

/**
 *
 * @author Dorys Erazo Ortega
 */
public class PersonaEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PerEdadService persona = new PerEdadService();
        
        PerEdadObjeto p1=persona.crearPersona();
       
       
       
        persona.calcularEdad(p1);
        persona.otraPersona(p1);
       // persona.mayorQue();
           System.out.println(p1.getPersona() + " Es mayor que " + p1.getNombre() + " ? ," +persona.mayorQue());
                
    }
    
}
