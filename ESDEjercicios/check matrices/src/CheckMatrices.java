public class CheckMatrices {
    public static void main(String[] args){
        int[][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};



        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0, k = matriz[0].length - 1; k > 0; j++, k--) {
                matriz[i][j] = matriz[i][k];
            }
        }

        for (int[] fila : matriz) {
            for (int num : fila) {
                System.out.printf("%3d ", num);
            }
            System.out.println();
        }
    }
}
