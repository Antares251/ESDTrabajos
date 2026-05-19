
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author antares
 */
public class ListaEnlazadaSimple {

    public static void main(String[] args) {
        Random rd = new Random();
        NodoLista inicioLista = new NodoLista(5);
        NodoLista nodo = inicioLista;

        for (int i = 0; i <= 10; i++) {
            NodoLista nodoAux = new NodoLista(rd.nextInt(10, 100));
            nodo.insertarNodo(nodoAux);
            nodo = nodoAux;
        }
        inicioLista.muestra();
        nodo.muestra();
    }
}
