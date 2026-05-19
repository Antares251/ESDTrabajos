import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class appSerieRaices {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("APP. Serie Raices");
        System.out.println("-----------------");
        char check;

        for (check = 's'; check == 's'|| check == 'S'; System.out.println("Quiere continuar? s/n"), check = sc.next().charAt(0)){

            double raiz = 0;
            int count = 0;
            System.out.println("Dame el valor de t");
            int t = sc.nextInt();
            System.out.println("Dame el valor de N");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++){
                count++;
                raiz = ((t > 0.0) && (t < 10)) ? Math.sqrt(t+ raiz) : 0.0;
                if(count == n && raiz == 0.0) break;
            }
            System.out.println(n + " " + raiz);
        }
    }




}
