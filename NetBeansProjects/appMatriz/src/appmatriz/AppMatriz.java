/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appmatriz;

import java.util.Random;

/**
 *
 * @author antares
 */
public class AppMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random rd = new Random();
        int[][] matriz1 = new int[rd.nextInt(3, 6)][rd.nextInt(3, 10)];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = rd.nextInt(10, 100);
                System.out.print(matriz1[i][j] + "|");
            }
            System.out.println();
        }
        
        int suma2 = 0;

        for (int i = 0; i < matriz1.length; i++) 
            suma2 += matriz1[i][i];
        

        if (matriz1.length == matriz1[0].length) {
            int sum = 0;
            for (int r = matriz1.length - 1, c = 0; r >= 0; r--, c++) {
                sum += matriz1[c][r];
            }
            System.out.println(sum);
            System.out.println("El promedio de la diagonal inversa es: " + sum / matriz1.length);
        }

        //  int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //asignar valores aleatorios a las dimensiones de la matriz
        //  3 < = ren, col <= 5
        /*
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print(matriz1[i][j] + "|");
            }
            System.out.println();
        }

        System.out.println(" ");

        //Funcioa solo con matrices cuadradas
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print(matriz1[j][i] + "|");
            }
            System.out.println();
        }

        int[][] matriz2;
        //Asignar una matriz a otra le asigna la direccion de memoria de una aotra
        //Por lo que un cambio de ellas afecta a la otra

        matriz2 = matriz1;
        matriz2[1][1] = 227;

        System.out.println("---------Matriz 1---------");

        for (int ren = 0; ren < matriz1.length; ren++) {
            for (int col = 0; col < matriz1[0].length; col++) {
                System.out.print(matriz1[ren][col] + "|");
            }
            System.out.println();
        }

        //Calcule el promedio de la diagonal principal de matriz 1
        int s= 0;
        /*
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print(matriz1[j][i] + "|");
                if (i == j) {
                    suma += matriz1[j][i];
                }
            }
            System.out.println();
        }
         */
 /* 
        for (int i = 0; i < matriz1.length; i++) 
            suma += matriz1[i][i];
         */
 /*
        int rev = 0;
        for (int i = matriz1.length-1; i >= 0; i--) {
            s += matriz1[rev][i];
            rev++;
        }
        
        System.out.println(s/matriz1[0].length);
         */
    }

}
