#ifndef PilaH
#define PilaH
const int MAX = 5;
enum { tam = MAX };
class Pila {
  int datos[tam];
  int tope;

public:
  Pila();
  bool push(int valor);
  bool pop(int &valor);
  void mostrar();
};
#endif
