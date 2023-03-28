/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encuentro7y8;

import java.util.Scanner;

/**
 *
 * @author marianoclaa
 */
public class Probando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
//        num1 = Math.abs(num1);
//&        num2 = Math.abs(num2);
        EsMultiplo(num1, num2);
    }

    public static void EsMultiplo(int num1, int num2) {
        if (num1 < num2) {
            if (num2 % num1 == 0) {
                System.out.println("El primer número es múltiplo");
            } else {
                System.out.println("El primer número NO es múltiplo");
            }
        } else if (num1 == num2) {
            System.out.println("Los números son iguales, por lo que si son múltiplos");
        } else {
            if (num1 % num2 == 0) {
                System.out.println("El segundo número es múltiplo");
            } else {
                System.out.println("El segundo número NO es múltiplo");
            }
        }
    }
}