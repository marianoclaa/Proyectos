/*1. Crear un programa que dado un número determine si es par o impar.
 */
package encuentro456;

import java.util.Scanner;

public class NumeroParOImpar {

    public static void main(String[] args) {
           int num;
           Scanner leer = new Scanner(System.in);
           System.out.println("Ingresa un número cualquiera");
           num = leer.nextInt();
           
           if (num % 2 == 0) {
           System.out.println("El número ingresado es par");
    } else {
            System.out.println("El número ingresado es impar");
    }
}
}
