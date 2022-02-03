/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Matematicas;
import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Matematicas math = new Matematicas();
        
        math.setNum1(Math.random());
        math.setNum2(Math.random());
        
        System.out.println(math.getNum1());
        System.out.println(math.getNum2());
        
        System.out.println(math.devolverMayor());
        System.out.println(math.calcularPotencia());
        System.out.println(math.calculaRaiz());
                
    }
    
    
}
