import java.util.Random;

public class AppPila {
    public static void main (String[] args){
        Pila pila1 = new Pila(5);
        Random rd = new Random();

        System.out.println("Introduciendo datos en la pila");

        while (!pila1.estaLlena()){
            int n = rd.nextInt(10,100);
            System.out.println("Dato ingresado: "+n);
            pila1.push(n);
        }
        System.out.println("Extrayendo datos de la pila");

        while (!pila1.estaVacia()){
            Dato miDato = new Dato();
            pila1.pop(miDato);
            System.out.println("Dato eliminado: "+miDato);
        }
    }
}
