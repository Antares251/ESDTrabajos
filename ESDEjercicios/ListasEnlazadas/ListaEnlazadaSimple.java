import java.util.Random;


public class ListaEnlazadaSimple {
    

    public static void main(String[] args) {
        Random rd = new Random();
        NodoLista inicioLista = new NodoLista(5);
        NodoLista nodo = inicioLista; 

        for (int i = 0; i <= 10; i++) {
            NodoLista nodoAux = new NodoLista(rd.nextInt(10,100));
            nodo.insertarNodo(nodoAux);
            nodo = nodoAux;
        }
        inicioLista.muestra();
        nodo.muestra();
    }
}