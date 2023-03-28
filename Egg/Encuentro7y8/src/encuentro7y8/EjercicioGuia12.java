/*Crea un procedimiento EsMultiplo que reciba los dos números pasados por 
el usuario, validando que el primer número múltiplo del segundo e imprima 
si el primer número es múltiplo del segundo, sino informe que no lo son.
 */
package encuentro7y8;

import java.util.Scanner;

public class EjercicioGuia12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar dos números enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        EsMultiplo(num1, num2);
    }

    public static void EsMultiplo(int num1, int num2) {
        if (num1 < num2) {
            if (num2 % num1 == 0) {
                System.out.println("El número " + num1 + " es múltiplo de " + num2);
            } else {
                System.out.println("El número " + num1 + " NO es múltiplo de " + num2);    
        }
       } else if (num1 == num2) {
                System.out.println("Los números son los mismos, con lo cual son múltiplos "); 
        } else {
            if (num1 % num2 == 0) {
                System.out.println("El número " + num2 + " es múltiplo de " + num1);
            } else {
                System.out.println("El número " + num2 + " NO es múltiplo de " + num1);
            }
        }
}
}