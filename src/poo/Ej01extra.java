/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class Ej01extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String titulo, autor;
        
        Cancion song = new Cancion();
        song.setTitulo("");
        song.setAutor("");
        System.out.println("Título: "+song.getTitulo());
        System.out.println("Autor: "+song.getAutor());
        
        System.out.println("Ingrese el nombre de la canción:");
        titulo=sc.nextLine();
        System.out.println("Ingrese el autor de la canción:");
        autor= sc.nextLine();
        
        Cancion song2 = new Cancion (titulo, autor);
        System.out.println("Título: "+ titulo);
        System.out.println("Autor: " + autor);
    }
    
}
