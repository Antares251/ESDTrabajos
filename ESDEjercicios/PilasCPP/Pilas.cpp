//---------------------------------------------------------------------------
#include <iostream>
#pragma hdrstop
#include "Pila.h"
//---------------------------------------------------------------------------
#pragma package(smart_init)

Pila::Pila() {
  tope = -1;
  for (int i = 0; i < tam; i++)
    datos[i] = 0;
}
bool Pila::push(int valor) {
  if (tope == tam - 1)
    return false;
  else {
    datos[++tope] = valor;
    return true;
  }
}

bool Pila::pop(int &valor) {
  if (tope == -1)
    return false;
  else {
    valor = datos[tope--];
    return true;
  }
}
void Pila::mostrar() {
  std::cout << "\nDatos en la pila : \n";
  for (int i = 0; i <= tope; i++)
    std::cout << "\n Dato[ " << i << " ] -> " << datos[i];
}
