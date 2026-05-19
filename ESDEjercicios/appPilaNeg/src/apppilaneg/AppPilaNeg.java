/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apppilaneg;

import java.io.*;
import java.util.Scanner;

public class AppPilaNeg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pilaProds = new Pila(15);
        String archivo = "inventario.txt";

        try (PrintWriter pw = new PrintWriter(new FileWriter(archivo))) {
            System.out.println("---  Guardar productos ---");
            for (int i = 0; i < 15; i++) {
                System.out.print("Ingrese nombre del producto " + (i + 1) + ": ");
                pw.println(sc.nextLine());
            }
            System.out.println("Archivo guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir archivo.");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                pilaProds.push(linea);
            }
            pilaProds.mostrar();
        } catch (IOException e) {
            System.out.println("Error al leer archivo.");
        }

        System.out.println("\n--- Atendiendo Clientes ---");
        Dato extraido = new Dato(); 
        
        while (pilaProds.pop(extraido)) {
            System.out.println("Atendiendo cliente. Producto entregado: " + extraido.nombreProducto);
        }
        
        System.out.println("TODOS LOS CLIENTES HAN SIDO ATENDIDOS.");
    }
}
    
    

