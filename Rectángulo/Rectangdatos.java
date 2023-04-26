/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectángulo;

/**
 *
 * @author Dorys Erazo Ortega
 */
public class Rectangdatos {
    private int base, altura, area, perimetro;

    public Rectangdatos() {
    }

    public Rectangdatos(int base, int altura, int area, int perimetro) {
        this.base = base;
        this.altura = altura;
        this.area = area;
        this.perimetro = perimetro;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Rectángulo" + "base = " + base + ", altura = " + altura + ", área = " + area + ", perímetro=" + perimetro;
    }
    

   
    
}
