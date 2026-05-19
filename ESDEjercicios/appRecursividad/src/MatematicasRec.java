public class MatematicasRec {
    public static double factorial(double n) {
        double f = 1;
        if (n == 0 || n == 1)
            return f;
        else
            f = n * factorial(n - 1);
        return f;
    }

    public static int sumatoria (int n){
        int s = 0;
        if (n == 1)
            return 1;
        else
            s = n + sumatoria(n - 1);
        return s;
    }
    public static void invertirNum(int num) {
        System.out.printf("%d ", num % 10);
        if (num >= 10) {
            invertirNum(num / 10);
        }
    }

    public static int sFibonacci(int n){
        int fibo = 1;

        if (n == 1 || n == 2)
            return fibo;
        else
            fibo = sFibonacci(n - 1) + sFibonacci(n - 2);
        return fibo;
    }

    public static double combFactorial(int n, int r){
        if(r > n || r == 0 || r == n) return 1;
        else return factorial(n) / (factorial(n-r) * factorial(r));
    }


    public static int combiStiefel(int n, int r){
        int resul =0;

        if(n==1 || r == 0 || r == n) return 1;
        else resul = combiStiefel(n-1, r) + combiStiefel(n - 1, r-1);
        return resul;
    }



}
