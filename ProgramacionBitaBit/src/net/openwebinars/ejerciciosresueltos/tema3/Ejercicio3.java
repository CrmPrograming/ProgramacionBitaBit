/*    Explicación
 * =================
 * 
 * Primero pedimos el número a buscar
 * en el vector. Seguidamente recorremos
 * el vector sumando los valores distintos
 * al valor encontrado.
 * 
 * Finalmente si existe el número en el vector
 * restamos su posición al resultado de la suma
 * anterior y mostramos el resultado por pantalla.
 * 
 */

package net.openwebinars.ejerciciosresueltos.tema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {

  public static void main(String[] args) throws NumberFormatException, IOException{    
    
    int[] vector = {1, 3, 2, 5, 7, 9};
    final int TAM_VECTOR = vector.length;
    BufferedReader bLectura = new BufferedReader(new InputStreamReader(System.in));
    int numero = 0;
    int result = 0;
    int indice = 0;
    boolean encontrado = false;
    System.out.print("> Introduzca el número a buscar en el vector: ");
    numero = Integer.parseInt(bLectura.readLine());
    
    // Sumamos primero todos los números menos el buscado
    
    for (int i = 0; i < TAM_VECTOR; i++) {
      if ((!encontrado) && (vector[i] == numero)) {
        encontrado = true;
        indice = i;
      } else {
        result += vector[i];
      }
    }
    if (encontrado) {
      result -= indice;
      System.out.println("> El número se encontró en el vector");
    }
    System.out.println("> El resultado es " + result);
  }

}
