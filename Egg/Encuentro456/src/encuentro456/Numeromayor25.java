/*
Implementar un programa que le pida dos números enteros al usuario y determine 
si ambos o alguno de ellos es mayor a 25.
 */
package encuentro456;
import java.util.Scanner;

public class Numeromayor25 {

public static void main(String[] args) {
        int num1;
        int num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce dos números enteros: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

if (num1 > 25 && num2 > 25) {
System.out.println("Los dos números son mayores a 25");
} else {
if (num1 > 25 || num2 > 25) {
System.out.println("Solo uno de los números es mayor a 25");
}else {
  System.out.println("Ninguno de los números es mayor a 25");
}
}
}
}
    

