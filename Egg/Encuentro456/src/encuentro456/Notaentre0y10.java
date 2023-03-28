/*Escriba un programa que valide si una nota está entre 0 y 10, sino está 
entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package encuentro456;
import java.util.Scanner;
public class Notaentre0y10 {


    public static void main(String[] args) {
        int nota;
        Scanner leer = new Scanner(System.in);
        System.out.println("Indica la nota obtenida: ");
        nota = leer.nextInt();
        
        while (nota>=10){
            System.out.println("La nota no es válida, favor ingrese una nota válida ");
            nota = leer.nextInt();
    }
}
}