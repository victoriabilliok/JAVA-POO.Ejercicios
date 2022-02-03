/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.*/
        int menu;
        Scanner sc = new Scanner(System.in);
        Operacion calc = new Operacion();

        calc.crearOperacion();

        System.out.println("Qué operación desea realizar?\n 1.SUMA\n 2.RESTA\n 3.MULTIPLICACIÓN\n 4.DIVISIÓN\n 5.SALIR");
        menu = sc.nextInt();

        while (menu!=5) {
        switch (menu) {
            case 1: System.out.print("Resultado: "+calc.suma());
            System.out.println("\nQué operación desea realizar?");
            menu = sc.nextInt();
            break;
            case 2: System.out.print("Resultado: "+calc.resta());
            System.out.println("\nQué operación desea realizar?");
            menu = sc.nextInt();
            break;
            case 3: System.out.print("Resultado: "+calc.multiplicar());
            System.out.println("\nQué operación desea realizar?");
            menu = sc.nextInt();
            break;
            case 4: System.out.print("Resultado: "+calc.dividir());
            System.out.println("\nQué operación desea realizar?");
            menu = sc.nextInt();
            break;
        }  
    }
        System.out.println("Operación finalizada.");
    }
    
}
