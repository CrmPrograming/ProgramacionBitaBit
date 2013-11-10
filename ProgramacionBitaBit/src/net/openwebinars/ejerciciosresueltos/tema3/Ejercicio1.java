/*     Explicación
 * ===================
 * 
 * El producto de dos números enteros
 * y positivos es equivalente a sumar
 * el primero por si mismo tantas veces
 * como valor tenga el segundo número.
 * 
 * Si por ejemplo tenemos que x es 2
 * e y es 5, el resultado sería:
 * 
 * x * y = x + x + x + x + x = 10
 * 
 * donde sumamos x a si mismo 5 veces
 * 
 */

package net.openwebinars.ejerciciosresueltos.tema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {

  public static void main(String[] args) {

    int x = 0;
    int y = 0;
    
    // Comprobamos si se han dado los números
    // como parámetros del programa
    
    if (args.length > 0) {
      try {
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
      } catch (NumberFormatException e) {
        // Mostramos un mensaje de error
        // si los argumentos no son números
        System.err.println("> Los argumentos del programa deben ser números");
      }
    } else {
      BufferedReader bLectura = new BufferedReader(new InputStreamReader(System.in));      
      try {
        System.out.print("> Introduzca el valor de x: ");
        x = Integer.parseInt(bLectura.readLine());
        System.out.println();
        System.out.print("> Introduzca el valor de y: ");
        y = Integer.parseInt(bLectura.readLine());
        System.out.println();
      } catch (NumberFormatException e) {
        System.out.println();
        System.err.println("> El valor introducido no es un número");
      } catch (IOException e) {
        // TODO Auto-generated catch block
        System.out.println();
        e.printStackTrace();
      }
    }
    int result = 0;
    for (int i = 0; i < y; i++)
      result += x;
    System.out.println("> El resultado de multiplicar x por y es " + result);
  }

}
