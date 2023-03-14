
package javaintroej01;

import java.util.Scanner;

public class MostrarNombre {


    public static void main(String[] args) {

           System.out.println("Ingresa tú nombre");
           Scanner leer = new Scanner(System.in);
           String nombre = leer.nextLine();
           
           System.out.println(" Tú nombre es " + nombre);
           
    }
    
}
