/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class Cuenta {

    /* Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo y número de cuenta.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
    private int numeroCuenta;
    private float DNI;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, float DNI, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public float getDNI() {
        return DNI;
    }

    public void setDNI(float DNI) {
        this.DNI = DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void crearCuenta() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su número de cuenta:");
        setNumeroCuenta(sc.nextInt());
        System.out.println("Ingrese su DNI:");
        setDNI(sc.nextFloat());
        System.out.println("Ingrese el saldo de su cuenta:");
        setSaldo(sc.nextDouble());
    }

    public double ingreso() {
        Scanner sc = new Scanner(System.in);
        double ingreso;
        System.out.println("Ingrese el dinero que desea depositar:");
        ingreso = sc.nextDouble();

        setSaldo(saldo + ingreso);

        return saldo;
    }

    public double retiro() {
        Scanner sc = new Scanner(System.in);
        double egreso, nuevoSaldo2;
        System.out.println("Ingrese el dinero que desea extraer:");
        egreso = sc.nextDouble();

        if (saldo >= egreso) {
            setSaldo(saldo - egreso);
        } else {
            //setSaldo(0);
            System.out.println("Fondos Insuficientes.");
        }
        return saldo;
    }
    
    public double extraccionRapida(){
        Scanner sc = new Scanner(System.in);
        double egreso;
        System.out.println("Ingrese el dinero que desea extraer:");
        egreso = sc.nextDouble();

        if ((saldo*20/100) >= egreso) {
            setSaldo(saldo - egreso);
        } else {
            //setSaldo(0);
            System.out.println("Debe ingresar un monto inferior.");
        }
        return saldo;
    }
    
    public double consultarSaldo() {
    return saldo;
}
    public String consultarDatos(){
        return "DATOS DE LA CUENTA:\n" + "Nro Cuenta=" + numeroCuenta + ", DNI=" + DNI + ", saldo=" + saldo ;
    }

}
