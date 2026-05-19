
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class ListaEnlazadaOrdenada {

    Nodo primero;
    Nodo actual;

    public ListaEnlazadaOrdenada() {

    }

    /*public void insertar(int v){
        Nodo anterior;
        if(listaVacia()||primero.valor>v){
            primero = new Nodo(v,primero);
        }else{
            anterior = primero;
            while(anterior.sig != null && anterior.sig.valor <= v){
                anterior = anterior.sig;
            }
            anterior.sig = new Nodo(v,anterior.sig);
        }
    }*/
    public void insertar(Producto p) {
        Nodo anterior;
        if (listaVacia() || primero.producto.clave > p.clave) {
            primero = new Nodo(p, primero);
        } else {
            anterior = primero;
            while (anterior.sig != null && anterior.sig.producto.clave <= p.clave) {
                anterior = anterior.sig;
            }
            anterior.sig = new Nodo(p, anterior.sig);
        }
    }

    public boolean listaVacia() {
        if (primero == null) {
            return true;
        }
        return false;
    }

//    realizar los cambios para que se puedan borrar productos
//   public void borrar(int v){
//       Nodo actual = primero;
//       Nodo anterior = null;
//       
//       while(actual != null && actual.valor != v){
//           anterior = actual;
//           actual = actual.sig;
//       }
//       if(actual == null){
//        System.out.println("Dato no encontrado");
//        return;
//    }
//       if(anterior == null){
//           primero = actual.sig;
//       }else{
//           anterior.sig = actual.sig;
//       }
//   }
    //Prueba de escritorio con los 5 datos de ejemplo borrar el valor 5 y mostrar el antes y despues de borrar graficamente 
//    public void mostrar() {
//        Nodo aux = primero;
//
//        while (aux != null) {
//            System.out.print(aux.clave.valor.precio + " -> ");
//            aux = aux.sig;
//        }
//        System.out.println("null");
//        System.out.println();
//    }
//    Agregar los campos de la clase del producto
    public void mostrar(DefaultTableModel tabla) {
        Nodo aux;
        aux = this.primero;

        while (aux != null) {
            tabla.insertRow(tabla.getRowCount(), new Object[]{aux.producto});
            aux = aux.sig;
        }
    }

    public void eliminar(int v) {
        if (listaVacia()) {
            return;
        }

        if (primero.producto.clave == v) {
            primero = primero.sig;
            return;
        }

        Nodo anterior = primero;
        while (anterior.sig != null && anterior.sig.producto.clave != v) {
            anterior = anterior.sig;
        }

        if (anterior.sig != null) {
            anterior.sig = anterior.sig.sig;
        }
    }
}
