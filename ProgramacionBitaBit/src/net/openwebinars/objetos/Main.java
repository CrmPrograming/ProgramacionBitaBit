package net.openwebinars.objetos;

public class Main {
  
  public static void main(String[] args) {
    Perro a = new Perro("Pablo", 5);
    System.out.println("El perro a se llama " + a.getNombre() + " y tiene " 
                      + a.getEdad() + " años");
    Perro b = new Perro();
    b.setNombre("Luis");
    b.setEdad(7);
    System.out.println(b);
  }

}
