public class PilaT<T> {
  private Object[] pila;
  private int tope;
  private boolean vacia;
  private boolean llena;

  public PilaT(int n) {
    pila = new Object[n];
    tope = 0;
    vacia = true;
    llena = false;
  }

  public void push(T dato) {
    vacia = false;
    pila[tope++] = dato;
    // tope = tope+1;
    if (tope == pila.length)
      llena = true;
  }

  // SE REQUIERE USAR REFERENCIA
  public T pop() // Dato valor) //int []dato)
  {
    if (--tope == 0)
      vacia = true;
    llena = false;
    // CONDICIONAR LA EXTRACCION DEL DATO
    return (T) pila[tope];
  }

  public boolean estaVacia() {
    return vacia;
  }

  public boolean estaLlena() {
    return llena;
  }

}
