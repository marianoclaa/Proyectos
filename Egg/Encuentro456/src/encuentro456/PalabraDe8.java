/*
Realizar un programa que solo permita introducir frases o palabras de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá 
imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package encuentro456;

import java.util.Scanner;

public class PalabraDe8 {

    public static void main(String[] args) {
           String palabra;
           Scanner leer = new Scanner(System.in);
           System.out.println("Ingresa un frase");
           palabra = leer.nextLine();
           int longitud = palabra.length();
           
           if (longitud == 8) {
           System.out.println("La frase es correcta");
    } else {
            System.out.println("La frase es incorrecta");
    }
}
}
