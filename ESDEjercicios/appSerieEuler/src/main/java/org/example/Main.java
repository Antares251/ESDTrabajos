package org.example;
import org.apache.commons.lang3.tuple.Pair;

public class Main {
    public static double factorial(int n){
        double fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    public static Pair<Double,Integer> serie(){
        double serie = 1;
        int i = 1;
        do {
            serie += 1 / factorial(i);
            i++;
        }while(serie<=Math.E);
        return Pair.of(serie,i);
    }

    public static void main(String[] args){
        System.out.printf("Valor de la serie e = %.2f \n", serie().getLeft());
        System.out.println(serie().getLeft());
        System.out.println(Math.E);
        System.out.println("Tamano del factorial "+serie().getRight());
    }
}