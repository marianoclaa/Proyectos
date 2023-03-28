/* 2. Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.
 */
package encuentro456;

import java.util.Scanner;

public class Eureka {

    public static void main(String[] args) {
           String palabra;
           Scanner leer = new Scanner(System.in);
           System.out.println("Ingresa un frase");
           palabra = leer.nextLine();
           
           if (palabra.equals("eureka")) {
           System.out.println("La frase es correcta");
    } else {
            System.out.println("La frase es incorrecta");
    }
}
}
    
