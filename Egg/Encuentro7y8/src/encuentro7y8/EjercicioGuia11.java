/*Escribir un programa que procese una secuencia de caracteres ingresada por 
teclado y terminada en punto, y luego codifique la palabra o frase ingresada 
de la siguiente manera: cada vocal se reemplaza por el carácter que se indica 
en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas)
se mantienen sin cambios.
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para 
la transformación.
a = @ - e = # - i = $ - o = % - u = *
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package encuentro7y8;

import java.util.Scanner;

public class EjercicioGuia11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase(leer.nextLine());
    }
    public static void frase(String letra) {
        String letraCambiada = "";
        for (int i = 0; i < letra.length(); i++) {
        switch (letra.substring(i, i + 1)) {
            case "a":
            case "A":
                letraCambiada +="@";
                break;
            case "e":
            case "E":
                letraCambiada +="#";
                break;
            case "i":
            case "I":
                letraCambiada +="$";
                break;
            case "o":
            case "O":
                letraCambiada +="%";
                break;
            case "u":
            case "U":
                letraCambiada +="%";
                break;
            default:
                letraCambiada += letra.substring(i, i + 1);               
        }  
        }
                System.out.println("La frase cambiada es: " + letraCambiada);
    }
}