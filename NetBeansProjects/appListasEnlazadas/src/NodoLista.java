/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author antares
 */
public class NodoLista {

    int dato;
    NodoLista sig;

    NodoLista(int d) {
        dato = d;
        sig = null;
    }

    void insertarNodo(NodoLista nodo) {
        if (sig == null) {
            this.sig = nodo;
            nodo.sig = null;
        }
    }

    void muestra() {
        NodoLista p1;
        p1 = this;

        while (p1 != null) {
            System.out.print("| " + p1.dato + " -> ");
            p1 = p1.sig;
        }
        System.out.println("null");
        System.out.println();
    }
}
