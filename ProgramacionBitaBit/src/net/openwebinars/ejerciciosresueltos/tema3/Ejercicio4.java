/*    Explicación
 * =================
 * 
 * La idea de este programa es
 * ir almacenando en dos vectores a modo de lista
 * los índices por los cuales vamos pasando.
 * 
 * Una vez se termina de recorrer la tabla, se
 * recorren los vectores y se imprimen los índices
 * desde el último hasta la posición [0, 0] 
 * 
 */

package net.openwebinars.ejerciciosresueltos.tema3;

public class Ejercicio4 {

  public static void main(String[] args) {
    
    int[][] tabla = {{0, 0, 1, 0, 1},
                     {1, 0, 0, 1, 1},
                     {0, 1, 1, 0, 0},
                     {0, 1, 1, 1, 0}};
    int i = 0;
    int j = 0;
    int k = 0;
    int cantidadUnos = 0;
    int cantidadCeros = 0;    
    final int NUMERO_FILAS = tabla.length;
    final int NUMERO_COLUMNAS = tabla[0].length;
    int[] vectorI = new int[tabla.length * tabla.length];
    int[] vectorJ = new int[tabla[0].length * tabla[0].length];
    for (int w = 0; w < tabla.length; w++)
      vectorI[w] = -1;
    for (int z = 0; z < tabla[0].length; z++)
      vectorJ[z] = -1;    
    do {
      vectorI[k] = i;
      vectorJ[k] = j;
      k++;
      if (tabla[i][j] == 0){
        j++;
        cantidadCeros++;        
      } else {
        i++;
        cantidadUnos++;
      }        
    } while ((i < NUMERO_FILAS) && (j < NUMERO_COLUMNAS));
    k--;
    while (k > 0) {
      System.out.print("[" + vectorI[k] + ", " + vectorJ[k] + "], ");
      k--;
    }
    System.out.println("[" + vectorI[0] + ", " + vectorJ[0] + "]");    
    System.out.println("> La cantidad de unos es: " + cantidadUnos + ", cantidad de ceros: " + cantidadCeros);
  }

}
