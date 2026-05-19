public class Pila {
    private int[] pila;
    private int tope;
    private boolean vacia;
    private boolean llena;

    public Pila(int n) {
        pila = new int[n];
        tope = 0;
        vacia = true;
        llena = false;
    }

    public void push(int dato){
        pila[tope++] = dato;
        vacia = false;
        llena = tope == pila.length ? true:false;
    }

    // This shit is a reference
    public void pop (Dato valor){
        vacia = --tope == 0 ? true:false;
        llena = false;
        valor.dato = pila[tope];
    }

    public boolean estaVacia(){
        return vacia;
    }

    public boolean estaLlena(){
        return llena;
    }
}
