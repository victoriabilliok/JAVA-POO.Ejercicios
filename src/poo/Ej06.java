/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int menu;

        Cafetera coffe = new Cafetera();

        coffe.crearCafetera();

        System.out.println("Qué operación desea realizar?\n 1.VER DATOS\n 2.Llenar cafetera\n 3.Vaciar Cafetera\n 4.Servir Taza\n 5.Agregar café\n 6.SALIR");
        menu = sc.nextInt();

        while (menu != 6) {
            switch (menu) {
                case 1:
                    System.out.print(coffe.consultarDatos());
                    System.out.println("\nQué operación desea realizar?");
                    menu = sc.nextInt();
                    break;
                case 2:
                    coffe.llenarCafetera();
                    System.out.println("\nQué operación desea realizar?");
                    menu = sc.nextInt();
                    break;
                case 3:
                    coffe.vaciarCafetera();
                    System.out.println("\nQué operación desea realizar?");
                    menu = sc.nextInt();
                    break;
                case 4:
                    System.out.print("Cant actual: "+coffe.servirTaza());
                    System.out.println("\nQué operación desea realizar?");
                    menu = sc.nextInt();
                    break;
                case 5:
                    System.out.print("Cant actual: "+coffe.agregarCafe());
                    System.out.println("\nQué operación desea realizar?");
                    menu = sc.nextInt();
                    break;
            }
        }
    }
}
