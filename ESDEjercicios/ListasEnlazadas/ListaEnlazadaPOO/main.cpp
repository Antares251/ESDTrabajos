#include "nodo_lista.cpp"

int main(int argc, char **argv)
{
    nodo_lista *p = new nodo_lista(5);
    nodo_lista *n = p;
    for (int i = 0; i < 5; i++)
    {
        nodo_lista *o = new nodo_lista(i * i);
        n->inserta_s(o);
        n = o;
    }
    p->muestra();
    n->muestra();
    return 0;
}