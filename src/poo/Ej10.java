/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Vectores;
import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Vectores arreglo = new Vectores();
        
        System.out.println("--------CREAR VECTOR A--------"); 
        arreglo.crearArreglo();
        
        System.out.println("\n--------ORDEN ASCENDENTE VECTOR A--------"); 
        arreglo.ordenar();
        
        System.out.println("\n--------CREAR VECTOR B--------");
        arreglo.crearArregloB();
        
    }
    
    
}
