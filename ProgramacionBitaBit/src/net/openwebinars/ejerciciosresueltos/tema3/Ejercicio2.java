/*    Explicación
 * =================
 * 
 * Primero rellenamos un vector de char
 * de forma aleatoria usando la función
 * nextInt de la clase Random. 
 * 
 * Una vez que tenemos la clase llena
 * mediante un bucle for y un switch vamos
 * leyendo cada char y luego imprimimos
 * su equivalente en mayúsculas
 * 
 */

package net.openwebinars.ejerciciosresueltos.tema3;

import java.util.Random;

public class Ejercicio2 {

  public static void main(String[] args) {
        
    Random aleatorio = new Random();
    final int MAXIMO = 8;
    final int MINIMO = 1;
    final int TAM_VECTOR = aleatorio.nextInt(MAXIMO - MINIMO + 1) + MINIMO;
    final char[] VECTOR_LETRAS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
    char[] vector = new char[TAM_VECTOR];
    
    // Primero rellenamos el vector de letras aleatoriamente
    
    for (int i = 0; i < TAM_VECTOR; i++) {
      vector[i] = VECTOR_LETRAS[aleatorio.nextInt(MAXIMO - MINIMO + 1) + MINIMO];
    }
    
    // Luego recorremos el vector y mostramos las letras en mayúsculas

    for (int i = 0; i < TAM_VECTOR; i++) {
      switch (vector[i]) {
        case 'a':
          System.out.println("A");
          break;
        case 'b':
          System.out.println("B");
          break;
        case 'c':
          System.out.println("C");
          break;
        case 'd':
          System.out.println("D");
          break;
        case 'e':
          System.out.println("E");
          break;
        case 'f':
          System.out.println("F");
          break;
        case 'g':
          System.out.println("G");
          break;
        case 'h':
          System.out.println("H");
          break;
        case 'i':
          System.out.println("I");
          break;
      }
    }

  }

}
