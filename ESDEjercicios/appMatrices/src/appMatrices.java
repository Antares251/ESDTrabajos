import java.util.Random;

public class appMatrices {
    public static void main(String[] args){
        int [][] matriz1 = {{1,2,3},{4,5,6},{7,8,9}};
        Random rd = new Random();

        for (int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[0].length; j++){
                System.out.print(matriz1[i][j] + "|");
            }
            System.out.println();
        }

        System.out.println(" ");

        //Funcioa solo con matrices cuadradas
        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[0].length; j++){
                System.out.print(matriz1[j][i] + "|");
            }
            System.out.println();
        }
        
        int [][] matriz2;
        //Asignar una matriz a otra le asigna la direccion de memoria de una aotra
        //Por lo que un cambio de ellas afecta a la otra

        matriz2 = matriz1;
        matriz2[1][1] = 225;

        System.out.println("---------Matriz 1---------");

        for (int ren = 0; ren < matriz1.length; ren++){
            for(int col = 0; col < matriz1[0].length; col++){
                System.out.print(matriz1[ren][col] + "|");
            }
            System.out.println();
        }

        //Calcule el promedio de la diagonal principal de matriz 1

        int suma = 0;
        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[0].length; j++){
                System.out.print(matriz1[j][i] + "|");
                if(i == j){
                    suma += matriz1[j][i];
                }
            }
            System.out.println();
        }
        System.out.println(suma/matriz1.length);
    }
}
