/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
*/
package javaintroej01;

import java.util.Scanner;

public class FuncionMathsqrt {


    public static void main(String[] args) {
        int num1;
    Scanner leer = new Scanner(System.in);
           System.out.println("Ingresa un numero entero");
            num1 = leer.nextInt();
            
            int doble = num1 *2;
            int triple = num1 *3;
            double raiz = Math.sqrt(num1); 
            
            System.out.println("El doble de " + num1 + " es " + doble);
            System.out.println("El triple de " + num1 + " es " + triple);
            System.out.println("La raíz cuadrada de " + num1 + " es " + raiz);
    }
    
}
