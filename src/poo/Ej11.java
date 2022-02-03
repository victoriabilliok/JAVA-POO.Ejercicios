/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío*/
        int dia, mes, anio;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una fecha en formato dia-mes-año:");
        System.out.println("DIA:");dia=sc.nextInt();
        System.out.println("MES:");mes=sc.nextInt();
        System.out.println("AÑO:");anio=sc.nextInt();
        
        Date fecha = new Date (anio, mes-1, dia);
        System.out.println("Fecha: "+fecha);
        System.out.println("Año: "+ (fecha.getYear()+1900) );
        
        Date fechaActual = new Date();
        System.out.println("Fecha actual: "+fechaActual);
        System.out.println("Año: "+ (fechaActual.getYear()+1900) );
        
        System.out.println("La diferencia entre fechas es de: "+ (fechaActual.getYear()-fecha.getYear())+ "años.");
        
    }
    
}
