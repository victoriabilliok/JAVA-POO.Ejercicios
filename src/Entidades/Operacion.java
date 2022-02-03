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
public class Operacion {

    private Integer numero1;
    private Integer numero2;

    public Operacion() {
    }

    public Operacion(Integer numero1, Integer numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los números con los que desea operar:");
        System.out.println("numero 1:");
        setNumero1(sc.nextInt());
        System.out.println("numero 2:");
        setNumero2(sc.nextInt());
    }

    public int suma() {

        int suma = numero1 + numero2;

        return suma;
    }

    public int resta() {

        int resta = numero1 - numero2;

        return resta;
    }

    public double multiplicar() {
        int multi;
        if (numero1 == 0 || numero2 == 0) {
            multi = 0;
            System.out.println("Error. No es posible multiplicar por cero.");
        } else {
            multi = numero1 * numero2;
        }
        return multi;
    }
    
    public double dividir() {
        double division;
        if (numero1 == 0 || numero2 == 0) {
            division = 0;
            System.out.println("Error. No es posible dividir por cero.");
        } else {
            division = numero1 * numero2;
        }
        return division;
    }
    
    

}
