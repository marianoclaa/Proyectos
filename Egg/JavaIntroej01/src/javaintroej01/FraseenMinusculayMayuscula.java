
package javaintroej01;
import java.util.Scanner;

public class FraseenMinusculayMayuscula {


    public static void main(String[] args) {
        System.out.println("Ingresa una frase cualquiera");
           Scanner leer = new Scanner(System.in);
           String frase = leer.nextLine();
           
           System.out.println(frase.toLowerCase());
           System.out.println(frase.toUpperCase());

    }
    
}
