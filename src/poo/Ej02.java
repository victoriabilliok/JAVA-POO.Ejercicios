/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).*/
        
        Scanner sc = new Scanner (System.in);
        //creo un objeto
        Circunferencia circ = new Circunferencia();
    
        System.out.println("Calculo de AREA y PERIMETRO de una circunferencia.");
        circ.crearCircunferencia();
        circ.area();
        circ.perimetro();
        System.out.print(circ.toString());
    
} 
}
