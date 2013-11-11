package net.openwebinars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ControlFlujo {

  public static void main(String[] args) throws NumberFormatException, IOException {
    
    int cantidad = 0;
    int[][] tabla;
    boolean seguir = true;
    Random aleatorio = new Random();
    final int VALOR_MAXIMO = 20;
    final int VALOR_MINIMO = 5;
    BufferedReader bLectura = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("[PC]: ¡Hola programador!");
    try {
      System.out.println("[Programador]: " + bLectura.readLine());
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    System.out.print("- Introduzca un número: ");
    try {
      cantidad = Integer.parseInt(bLectura.readLine());
    } catch (NumberFormatException e) {
      System.err.println("El valor dado no es un número. Mostrando el error: ");
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    if (cantidad > 0) {
      
      // Bucle simple
      
      for (int i = 0; i < cantidad; i++)
        System.out.println("Imprimo el valor de i: " + i);
      
      tabla = new int[cantidad][cantidad];
      
      // Rellenamos la tabla conociendo sus dimensiones
      // usando bucles for anidados
      
      for (int i = 0; i < cantidad; i++)
        for (int j = 0; j < cantidad; j++)
          tabla[i][j] = aleatorio.nextInt((VALOR_MAXIMO - VALOR_MINIMO) + 1) + VALOR_MINIMO;
      
      // Recorremos la tabla sin conocer sus dimensiones
      // y mostramos su contenido por pantalla
      
      for (int[] i: tabla) {
        for (int j: i) {
          System.out.print(j + " ");
        }
        System.out.println();
      }      
      
    } else if (cantidad == 0){
      System.out.println("El valor dado fue un 0");
    }
    
    System.out.println("- Bucle while 1");
    int valor = 0;
    while (valor != 0) {
      System.out.println("Valor: " + valor);
      valor++;
      if (valor == 5)
        valor = 0;
    }
    System.out.println("- Bucle while 2");
    valor = 0;
    do {
      System.out.println("Valor: " + valor);
      valor++;
      if (valor == 5)
        valor = 0;
    } while (valor != 0);
    
    do {    
      System.out.print("Dame un número que esté dentro del rango [0, 10]: ");
      valor = Integer.parseInt(bLectura.readLine());
      System.out.println();      
      if ((valor < 0) || (valor > 10)) {
        System.err.println("Tiene que ser un número que esté dentro del rango dicho");
        continue;
      }
      switch (valor) {
        case 0:
        case 2:
        case 4:
        case 6:
        case 8:
        case 10:
          seguir = false;
          System.out.println("El número dado era par");
          break;
        case 1:
        case 3:
        case 5:
        case 7:
        case 9:
          seguir = false;
          System.out.println("El número dado era impar");
          break;
      }    
    } while (seguir);

  }

}
