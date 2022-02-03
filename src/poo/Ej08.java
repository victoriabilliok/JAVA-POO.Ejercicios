/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cadena texto = new Cadena();
        int menu;
        Scanner sc = new Scanner(System.in);

        texto.crearFrase();

        System.out.println("Qué operación desea realizar?\n 1.VER DATOS\n 2.Mostrar vocales\n 3.Invertir frase\n 4.Contar letra\n 5.Comparar longitud\n 6.Unir frase\n 7.Reemplazar\n 8.Buscar caracter\n 9.SALIR");
        menu = sc.nextInt();

        while (menu != 9) {
            switch (menu) {
                case 1:
                    System.out.println("Frase: " + texto.getFrase());
                    System.out.println("Longitud: " + texto.getLongFrase());
                    System.out.println("\nQué desea hacer?");
                    menu = sc.nextInt();
                    break;
                case 2:
                    texto.mostrarVocales();
                    System.out.println("\nQué desea hacer?");
                    menu = sc.nextInt();
                    break;
                case 3:
                    texto.invertirFrase();
                    System.out.println("\nQué desea hacer?");
                    menu = sc.nextInt();
                    break;
                case 4:
                    System.out.println("Ingrese una letra para contabilizar:");
                    char letra = sc.next().charAt(0);
                    texto.vecesRepetido(letra);
                    System.out.println("\nQué desea hacerr?");
                    menu = sc.nextInt();
                    break;
                case 5:
                    texto.compararLongitud(texto.getFrase());
                    System.out.println("\nQué desea hacer?");
                    menu = sc.nextInt();
                    break;
                case 6:
                    texto.unirFrases(texto.getFrase());
                    System.out.println("\nQué desea hacer?");
                    menu = sc.nextInt();
                    break;
                case 7:
                    texto.reemplazar();
                    System.out.println("\nQué desea hacer?");
                    menu = sc.nextInt();
                    break;
                case 8:
                    boolean presente = texto.contiene();
                    if (presente) {
                        System.out.println("VERDADERO");
                    } else {
                        System.out.println("FALSO");
                    }
                    System.out.println("\nQué desea hacer?");
                    menu = sc.nextInt();
                    break;
            }
        }

        System.out.println("Finalizado.");
    }

}
