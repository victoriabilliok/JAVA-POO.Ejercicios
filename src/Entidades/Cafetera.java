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
public class Cafetera {

    /*Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos: 
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void crearCafetera() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la capacidad máxima:");
        setCapacidadMaxima(sc.nextInt());
        System.out.println("Ingrese la cantidad actual de líquido:");
        setCantidadActual(sc.nextInt());
    }

    public void llenarCafetera() {
        setCantidadActual(capacidadMaxima);
    }

    public int servirTaza() {
        Scanner sc = new Scanner(System.in);
        int taza;
        System.out.println("Ingrese la capacidad de la taza:");
        taza = sc.nextInt();

        if (cantidadActual >= taza) {
            setCantidadActual(cantidadActual - taza);
            System.out.println("La taza se llenó.");
        } else if (cantidadActual < taza) {
            System.out.println("La taza no se llenó. Quedó en " + cantidadActual);
            setCantidadActual(0);
        }
        return cantidadActual;
    }

    public void vaciarCafetera() {
        setCantidadActual(0);
    }

    public int agregarCafe() {
        Scanner sc = new Scanner(System.in);
        int ingreso, capacidad;
        System.out.println("Ingrese la cantidad de café que desea agregar:");
        ingreso = sc.nextInt();

        capacidad = capacidadMaxima - cantidadActual;

        if (ingreso <= capacidad) {
            setCantidadActual(cantidadActual + ingreso);
        } else {
            System.out.println("La cantidad de café supera la capacidad máxima.");
        }
return cantidadActual;
    }
    
    public String consultarDatos(){
        return "DATOS DE LA CAFETERA:\n" + "CAPACIDAD=" + capacidadMaxima + "ml, CANT ACTUAL=" + cantidadActual+"ml";
    }
}
