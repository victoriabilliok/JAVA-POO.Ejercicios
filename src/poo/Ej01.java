/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.*/
        
        Scanner sc = new Scanner (System.in);
        //creo un objeto
        Libro book = new Libro();
        
        System.out.println("Ingrese el código ISBN del libro:");
        book.setISBN(sc.nextInt());
        System.out.println("Ingrese el título del libro:");
        book.setTitulo(sc.next());
        System.out.println("Ingrese el código nombre del autor:");
        book.setAutor(sc.next());
        System.out.println("Ingrese el número de páginas:");
        book.setPaginas(sc.nextInt());
        
        System.out.println(book);
    }
    
}
