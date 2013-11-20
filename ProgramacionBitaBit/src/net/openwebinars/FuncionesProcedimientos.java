
package net.openwebinars;

public class FuncionesProcedimientos {
  
  // Función
  static int sumar(int x, int y) {
    int resultado = 0;
    resultado = x + y;
    return (resultado);
  }
  
  // Procedimiento
  static void multiplicar(int x, int y) {
    x *= y;
    System.out.println("> Dentro del procedimiento la x vale " + x);
  }
  
  static int potencia(int x, int y) {
    int result = 0;
    // Caso Base
    if (y == 0) {
      result = 1;
    } else {
      // Caso general
      result = x * potencia(x, y - 1);
    }
    return (result);
  }
  
  // Suma los elementos de dos vectores
  // y guarda el resultado en un tercero
  static int[] sumarVectores(int[] a, int[] b) {
    final int TAM_VECTOR = a.length;
    int[] resultado = new int[TAM_VECTOR];
    if (TAM_VECTOR != b.length) {
      for (int i = 0; i < TAM_VECTOR; i++)
        resultado[i] = -1;
    } else {
      for (int i = 0; i < TAM_VECTOR; i++)
        resultado[i] = sumar(a[i], b[i]);
    }    
    return (resultado);
  }
  
  // Suma los elementos de dos vectores
  // y guarda el resultado en un tercero
  // pasado por argumento
  static void sumarVectores(int[] a, int[] b, int[] resultado) {
    final int TAM_VECTOR = a.length;
    resultado = new int[TAM_VECTOR];
    if (TAM_VECTOR != b.length) {
      resultado = reiniciarVector(resultado);
    } else {
      for (int i = 0; i < TAM_VECTOR; i++)
        resultado[i] = sumar(a[i], b[i]);
    }    
  }
  
  // Método general para mostrar 
  // el contenido de un vector por pantalla
  static void mostrarVector(int[] vector) {
    final int TAM_VECTOR = vector.length;
    System.out.print("[");
    for (int i = 0; i < (TAM_VECTOR - 1); i++)
      System.out.print(vector[i] + ", ");
    System.out.println(vector[TAM_VECTOR - 1] + "]");
  }
  
  // Método general para inicializar
  // un vector con valor -1
  static int[] reiniciarVector(int[] vector) {
    final int TAM_VECTOR = vector.length;
    int[] resultado = new int[TAM_VECTOR];
    for (int i = 0; i < TAM_VECTOR; i++)
      resultado[i] = -1;
    return (resultado);
  }
  
  // Método encargado de sumar
  // todos los números indicados
  // como parámetro
  static int sumatorio(int ... n) {
    int resultado = 0;
    for (int i: n)
      resultado += i;
    return (resultado);
  }
  
  public static void main(String[] args) {
    int x = 2, y = 5, z = -3;
    int[] vectorA = {1, 8, 10, 20};
    int[] vectorB = {2, 4, 5, 7};
    int[] resultados;
    System.out.println("> Suma de x + y = " + sumar(x, y));
    multiplicar(x, y);
    System.out.println("> Fuera de multiplicar la x vale " + x);
    System.out.println("> Potencia de x elevado a y = " + potencia(x, y));
    System.out.println("> z + (x^y) = " + sumar(z, potencia(x, y)));
    // Suma de vectores 1
    resultados = sumarVectores(vectorA, vectorB);
    System.out.println("> Suma de vectores 1: ");
    mostrarVector(resultados);
    // Suma de vectores 2
    resultados = reiniciarVector(resultados);
    sumarVectores(vectorA, vectorB, resultados);
    System.out.println("> Suma de vectores 2: ");
    mostrarVector(resultados);
    System.out.println("> Sumatorio 1: " + sumatorio(3, 2, 8, 10, 22, 13));
    System.out.println("> Sumatorio 2: " + sumatorio(3, 2, 8));
    System.out.println("> Sumatorio 3: " + sumatorio(3, 2, 8, 10, 22, 13, 90, -20, -40));
  }

}
