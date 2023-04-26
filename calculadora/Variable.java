/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Home
 */
public class Variable {
    private double num1;
    private double num2;

    public Variable() {
    }
    

    public Variable(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
       this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        //if (num1!=0) {
            this.num2 = num2;
        //} else {
        //    System.out.println("número no válido");
        //}
    }

    @Override
    public String toString() {
        return "Variable{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
}
    

