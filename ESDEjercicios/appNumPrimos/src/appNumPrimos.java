import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class appNumPrimos {
    public static void main(String[] args) {
        int[] serie = new int[100];
        
        for (int i = 0; i < serie.length; i++) {
            serie[i] = i+1;
        }

        List<Integer> primos = Arrays.stream(serie).filter(appNumPrimos::esPrimo).boxed().collect(Collectors.toList());

        System.out.println("Los numeros primos son: " + primos);
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
