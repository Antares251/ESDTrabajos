#include <iostream>
using namespace std;

class nodo_lista
{
    int dato;
    nodo_lista *sig;

public:
    nodo_lista(int d);
    void inserta_s(nodo_lista *nodo);
    void muestra();
};
nodo_lista::nodo_lista(int d)
{
    dato = d;
    sig = NULL;
}
void nodo_lista::inserta_s(nodo_lista *nodo)
{
    if (sig == NULL) // 0
    {
        sig = nodo;
        nodo->sig = NULL; // 0
    }
    /*else {
    nodo->sig = sig;
    sig = nodo;
    }*/
}
void nodo_lista::muestra()
{
    nodo_lista *p1;
    p1 = this;
    while (p1 != 0)
    {
        cout << p1->dato << " ";
        p1 = p1->sig;
    }
    cout << '\n';
}