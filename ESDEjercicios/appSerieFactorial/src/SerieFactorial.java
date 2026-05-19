public class SerieFactorial {

    public static double factorial(int n){
        double fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    public static double serie(){
        double serie = 1;
        int i = 1;
        do {
            serie += 1 / factorial(i);
            i++;
        }while(serie<=Math.E);
        return serie;
    }

    public static void main(String[] args){
        System.out.printf("Valor de la serie e = %.2f \n", serie());
        System.out.println(serie());
        System.out.println(Math.E);
    }
}
