/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class Circunferencia {
    
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el valor del radio:");
        setRadio(sc.nextDouble());
    }
    
    public double area() {
        
        return Math.PI * Math.pow(radio,2);
    }
    public double perimetro() {
        
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Resultado:\nPerimetro=" + perimetro() + ", Area=" + area()+".\n";
    }
    
    
    
    
}
