#include "Menu.h"
#include "Pila.h"
#include <cstdlib>
#include <iostream>

using namespace std;

int Menu::opciones() {
  int op;
  cout << "\nTrabajando con una pila : " << endl;
  cout << "\n Que deseas hacer : ";
  cout << "\n 1) Insertar Dato : ";
  cout << "\n 2) Extraer Dato : ";
  cout << "\n 3) Salir : ";
  cout << "\n Opcion : ";
  cin >> op;
  return op;
}

int main(int argc, char *argv[]) {
  int d, op;
  Pila pila;
  Menu menu;
  bool band = true;

  while (band) {
    system("clear");
    op = menu.opciones();
    switch (op) {
    case 1:
      cout << " Dato : ";
      cin >> d;
      if (pila.push(d)) {
        cout << " OK ";
        pila.mostrar();
      } else {
        cout << " Desbordamiento (Overflow) ";
      }
      cin.ignore();
      cin.get();
      break;
    case 2:
      if (pila.pop(d)) {
        cout << "\n Dato eliminado : " << d;
        pila.mostrar();
      } else {
        cout << " Pila vacia (Underflow)";
      }
      cin.ignore();
      cin.get();
      break;
    case 3:
      band = false;
      break;
    }
  }
  return 0;
}
