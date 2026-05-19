public class multiplicacionMatrices {
    public static void main(String[] args) {

        int[][] matrizA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 2, 3}};
        int[][] matrizB = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matiC = Matrix.multip(matrizA, matrizB);
        Matrix.impMat(matiC, Matrix.pares(matiC), Matrix.nones(matiC));

        System.out.println();

        System.out.println("----------------------------------------------------");

        Matrix matA = new Matrix(matrizA);
        Matrix matB = new Matrix(matrizB);

        Matrix matC = matA.multiplica(matB);

        Matrix.impMat(matC.matriz, Matrix.pares(matC), Matrix.nones(matC));

        System.out.println("------------------------------------------------------");

        Matrix.impMat(matA.matriz, Matrix.pares(matA), Matrix.nones(matA));

        System.out.println("------------------------------------------------------");

        Matrix.impMat(matB.matriz, Matrix.pares(matB), Matrix.nones(matB));

    }
}


