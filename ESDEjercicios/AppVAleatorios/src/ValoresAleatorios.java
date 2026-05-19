import java.util.Random;

public class ValoresAleatorios {
    public static void main (String[] args) {
        CVector vec1 = new CVector(10);

        for (int i =0; i < vec1.tam(); i++):
            

    }
}

        /*CVector arr2 = new CVector(arr1);


        for (int i = 0; i <  arr1.tam(); i++){
            arr1.asig(rd.nextInt(10,100),i);
        }

        System.out.println("Datos en el el arreglo: ");
        for (int i = 0; i < arr1.tam(); i++){
            System.out.println(arr1.leer(i) + " ");
        }

        System.out.println("Promedio: " + arr1.promedio());

        

        //

        /*System.out.println("Datos en el arreglo");
        for (int i =0 ; i < arr2.tam(); i++){
            System.out.print(arr2.leer(i) + " ");
        }

        //Diseñe e implemente un metodo para invertir los elementos del vector


        int [] serie = new int[5];
        for (int i = 0; i < serie.length; i++){
            serie[i] = rd.nextInt(10,99);
        }

        /*for (int i = 0; i < serie.length; i++){
            System.out.print(serie[i] + " ");
        }

    }

    public static int mayor (int v[]){
        int mayor = v[0];
        for (int i = 1; i < v.length; i++){
            if (v[i] > mayor){
                mayor = v[i];
            }
        }
        return mayor;
    }
    public static int  menor (int v[]){
        int menor = v[0];
        for (int i = 1; i < v.length; i++){
            if (v[i] < menor){
                menor = v[i];
            }
            }
        return menor;
    }
}
