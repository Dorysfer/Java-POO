/*
 * Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
 Métodos getters y setters para el número de DNI y la letra.
 Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
 Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).

POSICIÓN LETRA

0 T
1 R
2 W
3 A
4 G
5 M
6 Y
7 F
8 P
9 D
10 X
11 B
12 N
13 J
14 Z
15 S
16 Q
17 V
18 H
19 L
20 C
21 K
22 E
 */
package Dnif;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class NifService {
    Scanner lire = new Scanner(System.in);
    Nifdatos ident=new Nifdatos();
    
    public Nifdatos crearNif(){
        System.out.println("Ingrese su DNI");
        ident.setDni(lire.nextLong());
        String[] caracteres=new String[23];
        String let="TRWAGMYFPDXBNJZSQVHLCKE";
        for (int i = 0; i < caracteres.length; i++) {
          caracteres[i]=let.substring(i, i+1);
        }
        int resultado= (int) ident.getDni() % 23;
        ident.setLetra(caracteres[resultado]);
        System.out.println("La letra que le corresponde es: "+ident.getLetra());
    return ident;   
    }
    public void mostrarNif(Nifdatos id){
        System.out.println("Su NIF es: " +ident.getDni()+"-"+ident.getLetra());
    }
}
