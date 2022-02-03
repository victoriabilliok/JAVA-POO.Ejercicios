/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.Persona;

/**
 *
 * @author Vicky
 */
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int personas = 0, IMC, contIMCBajo = 0, contIdeal = 0, contMayor = 0, contMenor = 0, contIMCAlto = 0;
        boolean esMayor;
        double porcentajeBajo, porcentajeIdeal, porcentajeAlto, porcentajeMayor, porcentajeMenor;
        Persona human = new Persona();

        do {
            human.crearPersona();

            IMC = human.calcularIMC();
            esMayor = human.esMayor();

            switch (IMC) {
                case -1:
                    System.out.println("Está por debajo del peso ideal.");
                    contIMCBajo = contIMCBajo + 1;
                    break;
                case 0:
                    System.out.println("Está por debajo del peso ideal.");
                    contIdeal = contIdeal + 1;
                    break;
                case 1:
                    System.out.println("Está con sobrepeso.");
                    contIMCAlto = contIMCAlto + 1;
                    break;
            }

            if (esMayor) {
                System.out.println("Es mayor de edad.");
                contMayor = contMayor + 1;
            } else {
                System.out.println("Es menor de edad.");
                contMenor = contMenor + 1;
            }

            personas = personas + 1;

        } while (personas < 4);

        porcentajeBajo = contIMCBajo * 100 / 4;
        porcentajeIdeal = contIdeal * 100 / 4;
        porcentajeAlto = contIMCAlto * 100 / 4;

        porcentajeMayor = contMayor * 100 / 4;
        porcentajeMenor = contMenor * 100 / 4;
        
        System.out.println ("El porcentaje con bajo peso es: "+porcentajeBajo+"%");
        System.out.println ("El porcentaje con peso ideal es: "+porcentajeIdeal+"%");
        System.out.println ("El porcentaje con sobrepeso es: "+porcentajeAlto+"%");
        System.out.println ("El porcentaje de mayores es: "+porcentajeMayor+"%");
        System.out.println ("El porcentaje de menores es: "+porcentajeMenor+"%");

    }
}
