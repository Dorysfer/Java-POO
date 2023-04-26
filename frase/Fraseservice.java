/*
 Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package frase;

import java.util.Scanner;

/**
 *
 * @author Dorys Erazo Ortega
 */
public class Fraseservice {

    public Frasedatos Ingresarfrase() {
        Frasedatos f1 = new Frasedatos();
        Scanner lire = new Scanner(System.in);
        System.out.println("Por favor ingrese una frase cualquiera");
        f1.setFrase(lire.nextLine());
        f1.setLongitud(f1.getFrase().length());
        System.out.println(f1.getLongitud());
        return f1;
    }
// Se utiliza un contador llamado "a" para contar el número total de vocales.
    public void Contarvocales(Frasedatos f1) {
        int a = 0;
        for (int i = 0; i < f1.getLongitud(); i++) {
            if ("a".equals(f1.getFrase().substring(i,i+1)) || ("e".equals(f1.getFrase().substring(i,i+1))) || ("i".equals(f1.getFrase().substring(i,i+1)))
                    || ("o".equals(f1.getFrase().substring(i,i+1))) || ("u".equals(f1.getFrase().substring(i,i+1)))) {
                a++;
            } 
        }
        System.out.println("El número de vocales es: "+a);  
    }
    public void Invertirfrase(Frasedatos f1) {
        String invertida="";
        for (int i=f1.getLongitud()-1;i>=0; i--) {
            invertida+=f1.getFrase().substring(i,i+1);
        } 
        System.out.println("La frase invertida es: "+invertida);
    }
   // Se utiliza un contador llamado "a" para contar el número total de veces que se repite el caracter. 
    public void vecesRepetido(Frasedatos f1) {
       Scanner lire = new Scanner(System.in);
        int a = 0;
        String car;
        System.out.println("Ingrese un caracter cualquiera");
        car=lire.nextLine();
        for (int i = 0; i < f1.getLongitud(); i++) {
            if (car.equals(f1.getFrase().substring(i,i+1))) {
                a++;
            } 
        }
        System.out.println("El caracter "+car+" se repite "+a+" veces");  
    }
    public void compararFrase(Frasedatos f1){
        Scanner lire = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase2=lire.nextLine();
        if (f1.getLongitud()==frase2.length()) {
            System.out.println("Tienen la misma longitud");
        } else {
            System.out.println("No tienen la misma longitud");
        }
        System.out.println(unirFrase(f1,frase2));
    }
    public String unirFrase(Frasedatos f1, String frase2){
        return f1.getFrase()+" "+frase2;
    }
    public String reemplazar(Frasedatos f1){
        Scanner lire = new Scanner(System.in);
        System.out.println("Ingrese un caracter cualquiera a ser cambiado");
        String car2=lire.nextLine();
        String cambio=f1.getFrase().replace("a",car2);
        System.out.println("La nueva frase es: "+cambio);
       return cambio;
    }
    public void contieneLetra(Frasedatos f1) {
       Scanner lire = new Scanner(System.in);
        boolean a = false;
        String car;
        System.out.println("Ingrese una letra que quisiera ver si consta en la frase");
        car=lire.nextLine();
        for (int i = 0; i < f1.getLongitud(); i++) {
            if (car.equals(f1.getFrase().substring(i,i+1))) {
                a=true;
            } 
        }
        System.out.println("¿Se encuentra el caracter "+car+" en la frase? "+a); 
}
}