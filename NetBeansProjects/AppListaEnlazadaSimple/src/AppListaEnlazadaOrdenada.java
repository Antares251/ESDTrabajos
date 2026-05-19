/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author antares
 */
public class AppListaEnlazadaOrdenada {

    public static void main(String[] argrs) {
        ListaEnlazadaOrdenada lista = new ListaEnlazadaOrdenada();

        lista.insertar(5);
        lista.insertar(10);
        lista.insertar(1);
        lista.insertar(12);
        lista.insertar(3);

        System.out.println("Lista inicial:");
        lista.mostrar();

        lista.borrar(3);
        System.out.println("Lista después de eliminar el 3:");
        lista.mostrar();
    }

}
//        lista.insertar(5);
//        lista.insertar(10);
//        lista.insertar(1);
//        lista.insertar(12);
//        lista.insertar(3);

//            lista.insertar(10);
//        lista.insertar(12);
//        lista.insertar(1);
//        lista.insertar(5);
//        lista.insertar(3);