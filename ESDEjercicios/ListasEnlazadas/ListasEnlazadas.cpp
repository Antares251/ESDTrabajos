#include <iostream>
#include <stdlib.h>
#include <stdio.h>

using namespace std;

struct Nodo
{
    int info;
    Nodo *sig;
};
int main()
{
    int i;
    Nodo lista, *nodo;
    lista.info = 101;
    lista.sig = NULL; // Lista vacia
    nodo = &lista;
    // Apunta al inicio de la lista

    cout << "Direccion de lista: " << hex << &lista << endl;

    srand(time(NULL));

    for (i = 0; i < 5; i++)
    { // Asignar memoria dinamica
        nodo->sig = new Nodo;
        nodo = nodo->sig;
        nodo->info = rand() % 90 + 10;
        nodo->sig = NULL;
    }
    // Mostar la lista Nota: & = direccion
    // Le asigna a la & nodo la & de lista.sig 0
    // posiciona el nodo al inicio lista
    nodo = lista.sig;
    while (nodo) // Mientras no sea NULL
    {
        cout << "Cout   Dir= " << hex<<nodo<<dec <<"  Info: " << nodo->info <<" Sig: "<< nodo->sig << endl;
        nodo = nodo->sig;
    }

    // Liberar la memoria dinámica correctamente
    delete nodo;
    return 0;
}
