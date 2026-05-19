public class Pila {
  private Object[] datos;
  private int tope;

  public Pila(int n, int opc) {
    this.datos = opc == 1 ? new String[n] : new Integer[n];
    this.tope = -1;
  }

  public boolean push(Object valor) {
    if (tope >= datos.length - 1) {
      System.out.println("OVERFLOW");
      return false;
    } else {
      datos[++tope] = valor;
      return true;
    }
  }

  public Object pop() {
    if (tope == -1) {
      System.out.println("UNDERFLOW");
      return null;
    } else {
      return datos[tope--];
    }
  }

  public void mostrar() {
    for (int i = 0; i <= tope; i++) {
      System.out.println("\u001B[34m" + "Dato[" + i + "] -> " + datos[i]);
    }
  }
}
