public class Matrix {
    int [][]matriz;

    public Matrix(int nr,int nc){
        matriz = new int[nr][nc];
        for (int r = 0; r < nr ; r++)
            for (int c = 0; c < nc ; c++)
                matriz[r][c] = 0;
    }

    public Matrix(int [][]m){
        matriz = new int[m.length][m[0].length];
        for (int r = 0; r < m.length ; r++)
            for (int c = 0; c < m[0].length ; c++)
                matriz[r][c] = m[r][c];
    }

    public Matrix(Matrix m){
//        matriz = new int[m.matriz.length][m.matriz[0].length];
//        for (int r = 0; r < m.matriz.length ; r++)
//            for (int c = 0; c < m.matriz[0].length ; c++)
//                matriz[r][c] = 0;
        matriz = new int[m.nRen()][m.nCol()];
        for (int r = 0; r < m.nRen() ; r++)
            for (int c = 0; c < m.nCol(); c++)
                matriz[r][c] = m.matriz[r][c];
    }

    public int nRen(){
        return matriz.length;
    }

    public int nCol(){
        return matriz[0].length;
    }

//    INCLUIR LOS METODOS IMPLEMENTADOS EN LAS OTRAS APPS
//    PARA EL MANEJO DE ARREGLOS BIDIMENCIONALES
//    NONES POR RENGLON, PARES POR COLUMNA
//    PROM. DIAG. PRIN PROM. DIAG. SEC.

    public static Matrix multi(Matrix A, Matrix B){
        Matrix C = new Matrix(A.nRen(), B.nCol());
        if (A.nCol() == B.nRen()){
            for (int i = 0; i < A.nRen(); i++) {
                for (int j = 0; j < B.nCol(); j++) {
                    C.matriz[i][j] = 0;
                    for (int k = 0; k < A.nCol(); k++) {
                        C.matriz[i][j] += A.matriz[i][k] * B.matriz[k][j];
                    }
                }
            }
        }
        return C;
    }

    public void asignar(int ren, int col, int val){
        matriz[ren][col] = val;
    }


    public static int [] pares (Matrix mat){
        int[] pares = new int[mat.nCol()];
        for (int j = 0; j < mat.nCol(); j++) {
            for (int i = 0; i < mat.nRen(); i++) {
                if (mat.matriz[i][j] % 2 == 0){
                    pares[j]++;
                }
            }
        }
        return pares;
    }

    public static int [] pares (int [][] mat){
        int[] pares = new int[mat[0].length];
        for (int j = 0; j < mat[0].length; j++) {
            for (int i = 0; i < mat.length; i++) {
                if (mat[i][j] % 2 == 0){
                    pares[j]++;
                }
            }
        }
        return pares;
    }

    public static int [] nones (Matrix mat){
        int[] nones = new int[mat.nRen()];
        for (int i = 0; i < mat.nRen(); i++) {
            for (int j = 0; j < mat.nCol(); j++) {
                if (mat.matriz[i][j] % 2 != 0){
                    nones[i]++;
                }
            }
        }
        return nones;
    }

    public static int [] nones (int [][] mat){
        int[] nones = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] % 2 != 0){
                    nones[i]++;
                }
            }
        }
        return nones;
    }

    public Matrix multiplica (Matrix B){
        Matrix C = new Matrix(this.nRen(), B.nCol());

        if (this.nCol() == B.nRen()){
            for (int i = 0; i < this.nRen(); i++) {
                for (int j = 0; j < B.nCol(); j++) {
                    for (int k = 0; k < this.nCol(); k++) {
                        C.matriz[i][j] += this.matriz[i][k] * B.matriz[k][j];
                    }
                }
            }
        }
        return C;
    }
    public static int [][] multip(int [][] matA, int [][] matB){
        int [][] matC = new int[matA.length][matB[0].length];

        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matB[0].length; j++) {
                for (int k = 0; k < matA[0].length; k++) {
                    matC[i][j] += matA[i][k] * matB[k][j];
                }
            }
        }
        return matC;
    }

    public static void impMat(int [][] mat, int[] pares, int[] nones){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.printf("%4d | ", mat[i][j]);
            }
            System.out.printf("%4d", nones[i]);
            System.out.println();
        }
        System.out.println("-------------------------------");
        for (int i = 0; i < mat[0].length; i++) {
            System.out.printf("%4d   ", pares[i]);
        }
        System.out.println();
    }

}
