import java.util.Random;

public class AppOrdenamientos {

    public static void main(String[] args) {
        // TODO code application logic here
        // int []v={60,70,50,30,100,80,90}; <-prueba de escritorio con estos valores
        int[] v = new int[500];
        Random random = new Random();
        Ordenamiento ordenamiento = new Ordenamiento();

        System.out.println("datos desordenados ");
        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(1000);
            System.out.println(v[i]);
        }
        ordenamiento.burbujaAsc(v);

        System.out.println("---------------------------------------------------------");

        System.out.println("datos ordenados");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

    }

}