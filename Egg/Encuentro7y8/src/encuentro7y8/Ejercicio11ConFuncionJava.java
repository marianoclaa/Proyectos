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

public class Ejercicio11ConFuncionJava {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una secuencia de caracteres que termine en punto.");
        String frase = leer.nextLine();

        String fraseNueva = frase;

        fraseNueva = fraseNueva.replaceAll("a", "@");
        fraseNueva = fraseNueva.replaceAll("e", "#");
        fraseNueva = fraseNueva.replaceAll("i", "$");
        fraseNueva = fraseNueva.replaceAll("o", "%");
        fraseNueva = fraseNueva.replaceAll("u", "*");

        System.out.println(fraseNueva);

    }
}