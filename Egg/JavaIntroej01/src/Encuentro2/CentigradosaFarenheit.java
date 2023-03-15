
package Encuentro2;

import java.util.Scanner;

public class CentigradosaFarenheit {

    public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);
           System.out.println("Ingresa la temperatura actual en grados centígrados");
           int grados = leer.nextInt();
           
           int fare = 32 + (9* grados / 5);
   
    System.out.println(" Los " + grados + " centígrados equivalen a " + fare + " grados Fahrenheit");
    }
    
}
