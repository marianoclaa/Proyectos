/* Realizar un programa que lea 4 números (comprendidos entre 1 y 20  e imprima 
el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package encuentro456;

import java.util.Scanner;

public class NumerosAAsteriscos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num =0;

        System.out.println("Ingrese cuatro numeros entre el 1 y el 20 ");
            for (int i = 0; i <4; i++) {
            System.out.println("");
            num = leer.nextInt(); 
            for (int f=0; f<num; f++) {
            if (f == 0) {
                System.out.print(num + " ");
            }
            System.out.print("*");
        }
    }
    }
}

