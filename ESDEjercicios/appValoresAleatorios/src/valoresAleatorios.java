import java.util.Arrays;


public class valoresAleatorios {
    public static void main(String[] args){
         int[] serie = {90,70,60,50,55};
        System.out.println("El numero mayor es: "+maximo(serie)+" El numero menor es: "+ minimo(serie)+" El promedio es: "+promedio(serie));
    }

    public static int minimo ( int []v){
        int Menor = Arrays.stream(v).min().getAsInt();
        return Menor;
    }

    public static int maximo(int []v){
        int Mayor = Arrays.stream(v).max().getAsInt();
        return Mayor;
    }

    public static double promedio(int []v){
        double promedio = Arrays.stream(v).average().getAsDouble();
        return promedio;
    }
}
