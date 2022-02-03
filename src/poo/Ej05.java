/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int menu;
        Cuenta acc = new Cuenta();
        
        acc.crearCuenta();
        
     System.out.println("Qué operación desea realizar?\n 1.Consultar Datos\n 2.Consulta Saldo\n 3.Ingreso de dinero\n 4.Extracción\n 5.Extracción rápida\n 6.SALIR");
        menu = sc.nextInt();

        while (menu!=6) {
        switch (menu) {
            case 1: System.out.print(acc.consultarDatos());
            System.out.println("\nQué operación desea realizar?");
            menu = sc.nextInt();
            break;
            case 2: System.out.print("Saldo actual: "+ acc.consultarSaldo());
            System.out.println("\nQué operación desea realizar?");
            menu = sc.nextInt();
            break;
            case 3: System.out.print("Saldo actual: "+ acc.ingreso());
            System.out.println("\nQué operación desea realizar?");
            menu = sc.nextInt();
            break;
            case 4: System.out.print("Saldo actual: "+ acc.retiro());
            System.out.println("\nQué operación desea realizar?");
            menu = sc.nextInt();
            break;
            case 5: System.out.print("Saldo actual: "+ acc.extraccionRapida());
            System.out.println("\nQué operación desea realizar?");
            menu = sc.nextInt();
            break;
        }  
    }
        System.out.println("Operación finalizada.");
    }   

    }


