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
public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
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

    public void crearRectangulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base y la altura del rectangulo:");
        System.out.println("base:");
        setBase(sc.nextInt());
        System.out.println("Altura:");
        setAltura(sc.nextInt());
    }

    public int superficie() {
        int superficie;
        superficie = base * altura;
        return superficie;
    }

    public int perimetro() {
        int perimetro;
        perimetro = (base + altura) * 2;
        return perimetro;
    }

    public void dibujar() {
        int n, m, i, j;
        m = base;
        n = altura;
        String [][] matriz = new String [n][m];
        
        System.out.println("RECTANGULO:\n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                matriz[i][j] = "*";
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
    
    public void dibujarB(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if ((i == 0) || (i == altura - 1)) {
                    System.out.print("*");
                } else if ((j == 0) || (j == base - 1)) {
                    System.out.print("*");
                } else {   System.out.print(" ");
                }            
            }
            System.out.println("");
        }

    }
}
