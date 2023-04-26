/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pass;

/**
 *
 * @author Dorys Erazo Ortega
 */
public class PassObjetos {
    private String[] pass;
    private String nombre;
    private int DNI;

    public PassObjetos() {
    }

    public PassObjetos(String[] pass, String nombre, int DNI) {
        this.pass = pass;
        this.nombre = "Bryan";
        this.DNI = 123456789;
    }

    public String[] getPass() {
        return pass;
    }

    public void setPass(String[] pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "PassObjetos{" + "pass=" + pass + ", nombre=" + nombre + ", DNI=" + DNI + '}';
    }

   
    
}
