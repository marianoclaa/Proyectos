
package javaintroej01;
import java.util.Scanner;

public class SumadedosNumeros {


    public static void main(String[] args) {
        int num1, num2;
    Scanner leer = new Scanner(System.in);
           System.out.println("Ingresa un numero entero");
            num1 = leer.nextInt();
            System.out.println("Ingresa otro numero entero");
            num2 = leer.nextInt();
            
    int suma = num1 + num2;
   
    System.out.println("La suma de " + num1 + " mas " + num2 + " es: " + suma);
    }
    
}
