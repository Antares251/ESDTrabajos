public class Ordenamiento {
    public static void burbujaAsc(int[] vec) {
        int interc, comp;
        interc = comp = 0;
        boolean band = false;
        int i;
            for ( i = 0, band = false ; i < vec.length; i++) {
            for (int j = vec.length - 1; j < i; j--) {
                comp++;
                if (vec[j - 1] > vec[j]) {
                    int aux = vec[j - 1];
                    vec[j - 1] = vec[j];
                    vec[j] = aux;
                    interc++;
                }
            }
        }
        System.out.println("NO. de Comparaciones=" + comp);
        System.out.println("NO. de Comparaciones=" + interc);

    }

}
