
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author antares
 */
public class ListaEnlazadaOrdenada {
    Nodo primero;
    Nodo actual;
    
    public ListaEnlazadaOrdenada(){
        
    }
    
    public void insertar(int v){
        Nodo anterior;
        if (listaVacia() || primero.valor > v){
            primero = new Nodo(v,primero);
        }
        else{
            anterior = primero;
            while(anterior.sig != null && anterior.sig.valor <= v){
                anterior = anterior.sig;
            }
            anterior.sig = new Nodo(v, anterior.sig);
        }
    }
    
    public boolean listaVacia(){
        return primero == null ? true : false;
    }
    
    public void mostrar() {
        Nodo aux = primero;
        while (aux != null) {
            System.out.print(aux.valor + " -> ");
            aux = aux.sig;
        }
        System.out.println("null");
    }

    public void eliminar(int v) {
        if (listaVacia()) return;
        
        if (primero.valor == v) {
            primero = primero.sig;
            return;
        }
        
        Nodo anterior = primero;
        while (anterior.sig != null && anterior.sig.valor != v) {
            anterior = anterior.sig;
        }
        
        if (anterior.sig != null) {
            anterior.sig = anterior.sig.sig;
        }
    }
    
    public void borrar (int valor){
        Nodo anterior, nodoAux;
        
        nodoAux = primero;
        
        anterior = null;
        
        while(nodoAux != null && nodoAux.valor < valor){
            anterior = nodoAux;
            nodoAux = nodoAux.sig;
        }
        if(nodoAux == null || nodoAux.valor != valor){
            JOptionPane.showMessageDialog(null, "Nodo no encontrado: "+nodoAux);
            return;
        }
        else{
            if (anterior == null){
                primero = nodoAux.sig;
            }
            else{
                anterior.sig = nodoAux.sig;
            }
        }
    }
    
}
