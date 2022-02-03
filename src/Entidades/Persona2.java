/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class Persona2 {

    /*Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos*/

    private String nombre;
    private Date fechaNac;

    public Persona2() {
    }

    public Persona2(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    /*Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.*/
    public void crearPersona() {
        Scanner sc = new Scanner(System.in);

        int dia, mes, anio;
        System.out.println("Ingrese su nombre:");
        setNombre(sc.next());
        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.println("DIA:");
        dia = sc.nextInt();
        System.out.println("MES:");
        mes = sc.nextInt();
        System.out.println("AÑO:");
        anio = sc.nextInt();

        Date fecha = new Date(anio-1900, mes-1, dia);
        this.fechaNac = fecha;
    }
/*Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior*/
    public void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Nacimiento: ");
        System.out.println("Dia:" + fechaNac.getDate() // Mostramos el dia con getDate, no con getDay
                + " Mes:" + (fechaNac.getMonth()+1) // Mostramos el mes 
                + " Año:" + fechaNac.getYear()); // Mostramos el año
    }

    /*Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual*/
    public int calcularEdad() {

        Date fechaActual = new Date();
        System.out.println("Fecha actual: " + fechaActual);
        int edad, difMes, difDia;
        edad = fechaActual.getYear() - (fechaNac.getYear());
        difMes = fechaActual.getMonth() - fechaNac.getMonth();
        difDia = fechaActual.getDate() - fechaNac.getDate();
        // Si está en ese año pero todavía no los ha cumplido
        if (difMes < 0 || (difMes == 0 && difDia < 0)) {
            edad = edad - 1;
        }
        return edad;
    }
/*Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario*/
    public boolean menorQue(int edad2) {
        Date fechaActual = new Date();
        int edad, difMes, difDia;
        edad = fechaActual.getYear() - (fechaNac.getYear());
        difMes = fechaActual.getMonth() - fechaNac.getMonth();
        difDia = fechaActual.getDate() - fechaNac.getDate();
        // Si está en ese año pero todavía no los ha cumplido
        if (difMes < 0 || (difMes == 0 && difDia < 0)) {
            edad = edad - 1;
        }

        return edad < edad2;
    }
}
