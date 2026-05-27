public class Ordenamiento {
    public static void burbujaAsc(int[] vec) {
        int interc, comp;
        interc = comp = 0;
        boolean band = false;
        int i;
        for (i = 0, band = false; i < vec.length; i++) {
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


    //Tarea prueba de escritorio para mañana

    public static void shellAsc(int[] vec) {
        int i, aux;
        boolean band;
        int comp, interec;
        comp = interec = 0;
        int inc = vec.length;

        while (inc > 1) {
            inc /= 2;
            band = true;

            while (band) {
                band = false;
                i = 0;

                while ((i + inc) < vec.length) {
                    comp++;
                    if (vec[i] > vec[i + inc]) {
                        aux = vec[i];
                        vec[i] = vec[i + inc];
                        vec[i + inc] = aux;
                        interec++;
                        band = true;
                    }
                    i++;
                }
            }
        }
        System.out.println("NO. de Comparaciones=" + comp);
        System.out.println("NO. de Intercambios=" + interec);
    }

}
