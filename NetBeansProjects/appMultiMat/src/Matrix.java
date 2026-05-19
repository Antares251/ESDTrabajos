
import java.util.Random;
import javax.swing.table.DefaultTableModel;

class Matrix {

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

    public Matrix multi(Matrix B) {
        Matrix C = new Matrix(this.nRen(), B.nCol());

        if (this.nCol() != B.nRen()) {
            throw new IllegalArgumentException("Columnas de A: " + this.nCol() + " no coinciden con Renglones de B: " + B.nRen());
        }

        if (this.nCol() == B.nRen()) {
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

    public void asignarRdm() {
        Random rd = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(10, 100);
            }
        }
    }
    
        public static void capturar(DefaultTableModel model, Matrix mat) {
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                Object valor = model.getValueAt(i, j);

                if (valor != null) {
                    try {
                        int n = Integer.parseInt(valor.toString());
                        mat.asignar(i, j, n);
                    } catch (NumberFormatException e) {
                        mat.asignar(i, j, 0);
                    }
                } else {
                    mat.asignar(i, j, 0);
                }
            }
        }
    }

}
