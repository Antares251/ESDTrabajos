
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author antares
 */
public class Matrix {

    int[][] matriz;

    public Matrix(int nr, int nc) {
        matriz = new int[nr][nc];
        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                matriz[r][c] = 0;
            }
        }
    }

    public Matrix(int[][] m) {
        matriz = new int[m.length][m[0].length];
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[0].length; c++) {
                matriz[r][c] = m[r][c];
            }
        }
    }

    public Matrix(Matrix m) {
        matriz = new int[m.nRen()][m.nCol()];
        for (int r = 0; r < m.nRen(); r++) {
            for (int c = 0; c < m.nCol(); c++) {
                matriz[r][c] = m.matriz[r][c];
            }
        }
    }

    public int nRen() {
        return matriz.length;
    }

    public int nCol() {
        return matriz[0].length;
    }

    public Matrix multi(Matrix A, Matrix B) {
        Matrix C = new Matrix(A.nRen(), B.nCol());
        if (A.nCol() == B.nRen()) {
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

    public void asignar(int ren, int col, int val) {
        matriz[ren][col] = val;
    }
    
    public int leer(int ren, int col) {
        return matriz[ren][col];
    }
    

    public static void llenar(DefaultTableModel model, Matrix mat) {
        model.setRowCount(0);
        model.setColumnCount(mat.nCol());

        for (int i = 0; i < mat.nRen(); i++) {
            Object[] fila = new Object[mat.nCol()];
            for (int j = 0; j < mat.nCol(); j++) {
                fila[j] = mat.leer(i, j);
            }
            model.addRow(fila);
        }
    }

}
