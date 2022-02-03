/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Arrays;

/**
 *
 * @author Vicky
 */
public class Vectores {

    /*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.*/
    private double vectorA[];
    private double vectorB[];

    public Vectores() {
        /*Los arrays que se usan como atributos, se deben inicializar
        en el constructor sin parametros*/
        vectorA = new double[50];
        vectorB = new double[20];
    }

    public Vectores(double[] vectorA, double[] vectorB) {
        this.vectorA = vectorA;
        this.vectorB = vectorB;
    }

    public double[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(double[] vectorA) {
        this.vectorA = vectorA;
    }

    public double[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(double[] vectorB) {
        this.vectorB = vectorB;
    }

    public void crearArreglo() {
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (Math.random() * 10);
        }
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print(vectorA[i] + " ");
        }
    }

    public void ordenar() {
        double auxiliar;

        for (int i = 0; i < vectorA.length; i++) {
            /*Le tenemos que restar -1 al for interno, para que con el j+1
            que representa al elemento siguiente, no cause un desbordamiento*/
            for (int j = 0; j < vectorA.length - 1; j++) {
                /*Sí el elemento actual, es mayor que el siguiente, se intercambian.*/
                if (vectorA[j] > vectorA[j + 1]) {
                    auxiliar = vectorA[j];
                    vectorA[j] = vectorA[j + 1];
                    vectorA[j + 1] = auxiliar;
                }
            }
        }
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print(vectorA[i] + " ");
        }
    }

    public void crearArregloB() {
        for (int i = 0; i < 10; i++) {
            vectorB[i] = vectorA[i];
        }
        for (int i = 10; i < vectorB.length; i++) {
            vectorB[i] = 0.5;
    }
            for (int i = 0; i < vectorB.length; i++) {
            System.out.print(vectorB[i] + " ");
        }

    }
}
