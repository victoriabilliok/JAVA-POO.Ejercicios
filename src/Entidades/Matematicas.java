/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Vicky
 */
public class Matematicas {

    /*Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número*/
    private double num1;
    private double num2;

    public Matematicas() {
    }

    public Matematicas(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    // Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor

    public double devolverMayor() {
        System.out.println("Cuál es mayor?");
        return Math.max(num1, num2);
    }

    public double calcularPotencia() {
        double mayor, menor;
        mayor = Math.max(num1, num2);
        menor = Math.min(num1, num2);
        System.out.println("POTENCIA:");
        return Math.pow(Math.abs(mayor), Math.abs(menor));

    }

    public double calculaRaiz() {
        double menor;
        menor = Math.abs(Math.min(num1, num2));
        System.out.println("RAIZ:");
        return Math.sqrt(menor);
    }

}
