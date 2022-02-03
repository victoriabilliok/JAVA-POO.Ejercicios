/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Persona2;
import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       
        Persona2 human = new Persona2();
        
        human.crearPersona();
        
        System.out.println("Edad: "+human.calcularEdad()+ "años.");
        
        System.out.println("Ingrese una edad para comparar:");
        int edad2=sc.nextInt();
        System.out.println("Es menor?");
        boolean esMenor= human.menorQue(edad2);
        if (esMenor){
            System.out.println("VERDADERO");
        } else {
            System.out.println("FALSO");
        }
        
        human.mostrarPersona();
        
    }
    
   
    
    
}
