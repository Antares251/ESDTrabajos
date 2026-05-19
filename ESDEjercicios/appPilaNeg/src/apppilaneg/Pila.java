/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apppilaneg;

/**
 *
 * @author loren
 */


public class Pila {
    String []datos;
    int tope;

    public Pila(int tam) {
        datos = new String[tam];
        tope = -1;
    }

    public boolean push(String valor) {
        if (tope == datos.length - 1) {
            return false;
        } else {
            datos[++tope] = valor;
            return true;
        }
    }

    public boolean pop(Dato num) {
        if (tope == -1) {
            return false;
        } else {
            num.nombreProducto = datos[tope--];
            return true;
        }
    }

    public void mostrar() {
        System.out.println("\n--- Contenido actual de la Pila ---");
        for (int i = 0; i <= tope; i++) {
            System.out.println("Producto [" + i + "] -> " + datos[i]);
        }
    }
}
    

