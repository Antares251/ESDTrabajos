import java.util.Scanner;

public class AppPilas {

  public static void menu(int opc) {
    Pila pila = new Pila(10, opc);
    Scanner sc = new Scanner(System.in);
    int op;

    do {
      System.out.println("\u001B[0m" + "------------------------------------------------------------\n");
      System.out.println("Menu acciones\n");
      System.out.println("1) Push\n2) Pop\n3) Salir");
      op = sc.nextInt();

      if (op == 1) {
        String Tecla = opc != 1 ? "Dato: " : "Nombre: ";
        System.out.print(Tecla);
        Object dato = opc == 1 ? sc.next() : sc.nextInt();
        pila.push(dato);
        pila.mostrar();
      } else if (op == 2) {
        Object d = pila.pop();
        if (d != null)
          System.out.println("\u001B[31m" + "Eliminado: " + d);
        pila.mostrar();
      }
    } while (op != 3);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opc;
    do {
      System.out.println("--------------------------------------------------------");
      System.out.println("\nMenu Tipo de valores");
      System.out.println("\nQue tipo de menu quiere?: \n1) Nombres \n2) Enteros \n3) Salir");
      opc = sc.nextInt();
      if (opc != 3) {
        menu(opc);
      }
    } while (opc != 3);

    System.out.println("\nSale pues :)");

    // USAR LA CLASE PLANTILLA
    //
    // DUARDAR NOMBRE DE PRODUCTOS EN UN ARCHIVO DE TEXTO EN UNA PLANTILLA
    // SE MUESTRAN EL CONTENIDO DE LA Pila
    // APLICACION QUE SIMULA UN NEGOCIO CON UNA Pila
  }

}
