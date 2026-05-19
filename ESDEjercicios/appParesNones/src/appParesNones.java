import java.util.Random;

public class appParesNones {
    public static void main (String[] args){

        Random rd = new Random();
        int [][] mat = new int[rd.nextInt(3,11)][rd.nextInt(3,11)];

        int []nones = new int [mat.length];
        int []pares = new int [mat[0].length];

        for (int r =  0; r<mat.length;r++){
            for (int c = 0; c<mat[0].length;c++){
                if(mat[r][c] % 2 != 0){
                    nones[r]++;
                }
                else{
                    pares[c]++;
                }
            }
        }
        System.out.println("\n\t\tPares y Nones");
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++ ){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.printf(" | Non: %d",nones[i]);
            System.out.println();
        }
        System.out.println("Pares");

        for(int par : pares){
            System.out.print(" "+par+"\t");
        }
        System.out.println();
    }
}