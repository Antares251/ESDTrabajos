import java.util.Scanner;

public class appRecursiva {
    public static void main (String[] args){

//        int n = 3758;
////        double fac = MatematicasRec.factorial(n);
//        int sum = MatematicasRec.sumatoria(n);
////        System.out.println("El factorial de "+ n +" es: " + fac);
//        System.out.println("La sumatoria de "+ n +" es: " + sum);
//
//        MatematicasRec.invertirNum(n);
//
//        System.out.println();
//
//        int fibo = MatematicasRec.sFibonacci(5);
//        System.out.println("Fibonaccion: "+ fibo);

        Scanner sc = new Scanner(System.in);

        System.out.println("Valor de N: ");
        int n = sc.nextInt();
        System.out.println("Valor de R: ");
        int r = sc.nextInt();
        double comb = MatematicasRec.combiStiefel(n, r);
        System.out.printf("La combinacion es: %.2f%n", comb);
    }


}