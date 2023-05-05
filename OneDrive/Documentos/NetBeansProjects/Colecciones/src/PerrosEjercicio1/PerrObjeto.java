/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PerrosEjercicio1;

/**
 *
 * @author Home
 */
public class PerrObjeto {
    private String raza;

    public PerrObjeto() {
    }

    public PerrObjeto(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return  raza;
    }
    
    
    
}
