import java.util.Random;

public class AppOrdenamientos {

    public static void main(String[] args) {
        // TODO code application logic here
        // int []v={60,70,50,30,100,80,90}; <-prueba de escritorio con estos valores

        Ordenamiento ord = new Ordenamiento();

        int[] valores = { 14,68,4,16,46,28,11,33,57,21,13,29,62,36,3,9};


        System.out.println("-----------------------------");

        ord.shellAsc(valores);

    }

}