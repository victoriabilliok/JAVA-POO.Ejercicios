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
public class Cadena {

    /*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
    private String frase;
    private int longFrase;

    public Cadena() {
    }

    public Cadena(String frase, int longFrase) {
        this.frase = frase;
        this.longFrase = longFrase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongFrase() {
        return longFrase;
    }

    public void setLongFrase(int longFrase) {
        this.longFrase = longFrase;
    }

    public void crearFrase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        setFrase(sc.nextLine());

        int longitud = getFrase().length();
        setLongFrase(longitud);
    }

    public void mostrarVocales() {
        int vocales = 0;
        for (int i = 0; i < longFrase; i++) {
            if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'e') || (frase.charAt(i) == 'i') || (frase.charAt(i) == 'o') || (frase.charAt(i) == 'u')) {
                vocales++;
            }
        }
        System.out.println("La cantidad de vocales en la frase es: " + vocales + ".");

    }

    public void invertirFrase() {
        String nuevaFrase;
        StringBuilder strb = new StringBuilder(frase);
        nuevaFrase = strb.reverse().toString();
        System.out.println(nuevaFrase);
    }

    public void vecesRepetido(char letra) {
        int repetido = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                repetido++;
            }
        }
        System.out.println("La letra '" + letra + "' se encuentra repetida " + repetido + " veces.");
    }

    public void compararLongitud(String frase) {
        int longitud2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese otra frase:");
        String frase2 = sc.nextLine();

        longitud2 = frase2.length();

        if (longFrase == longitud2) {
            System.out.println("Las frases son iguales");
        } else if (longFrase > longitud2) {
            System.out.println("La primera frase es mas larga");
        } else {
            System.out.println("La primera frase es mas corta");
        }
    }

    public void unirFrases(String frase) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese otra frase:");
        String frase3 = sc.nextLine();

        System.out.println(frase + " " + frase3);
    }

    public void reemplazar() {
        /*deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.*/
        Scanner sc = new Scanner(System.in);
        int i, n;
        n = frase.length();
        String vector[] = new String[n];

        for (i = 0; i < n; i++) {
                vector[i] = frase.substring(i, i+1);
            }
        
        System.out.println("Ingrese un caracter cualquiera:");
        String caracter = sc.next();
        for (i = 0; i < n; i++) {
            if (vector[i].equals("a")) {
                vector[i] = caracter;       
            }
        }
        for (i = 0; i < n; i++){
            System.out.print(vector[i]);
        }
        System.out.println("");
    }
    
    public boolean contiene(){
        Scanner sc = new Scanner(System.in);
        int i, n;
         int contador=0;
        boolean log;
        n = frase.length();
        String vector[] = new String[n];

        for (i = 0; i < n; i++) {
                vector[i] = frase.substring(i, i+1);
            }
        
        System.out.println("Ingrese un caracter cualquiera a buscar:");
        String caracter = sc.next();
        for (i = 0; i < n; i++) {
            if (vector[i].equals(caracter)) {
                contador++;  
            }
            }
        System.out.println("Está presente?");
        return contador !=0;
    }
}
    

