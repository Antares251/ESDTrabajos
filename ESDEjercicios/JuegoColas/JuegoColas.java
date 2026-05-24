import java.util.Random;

public class JuegoColas {

    public static void main(String[] args) {
        int MAX = 5;
        int[] Datos = new int[MAX];
        int[] P = { -1 };
        int[] U = { -1 };
        int[] datoExtraido = { 0 };

        int numJugadores = 5;

        System.out.println("Papa caliente con " + numJugadores + " jugadores\n");

        for (int i = 1; i <= numJugadores; i++) {
            insertarEnColaCirc(Datos, MAX, P, U, i);
        }

        Random rand = new Random();

        while (numJugadores > 1) {
            int pases = rand.nextInt(5) + 1;
            System.out.println("LLA papa se pasa " + pases + " veces:");

            for (int i = 0; i < pases; i++) {
                eliminarDeColaCirc(Datos, MAX, P, U, datoExtraido);
                int jugadorQuePasa = datoExtraido[0];
                
                insertarEnColaCirc(Datos, MAX, P, U, jugadorQuePasa);
                
                int jugadorQueRecibe = Datos[P[0]];
                
                System.out.println("   -> El jugador " + jugadorQuePasa + " le pasa la papa al jugador " + jugadorQueRecibe);
            }

            eliminarDeColaCirc(Datos, MAX, P, U, datoExtraido);
            System.out.println("Ya trono:  El jugador " + datoExtraido[0] + " se quemó y sale del juego.\n");

            numJugadores--;
        }

        eliminarDeColaCirc(Datos, MAX, P, U, datoExtraido);
        System.out.println("¡EL JUGADOR " + datoExtraido[0] + " ES EL GANADOR!");
    }

    public static void insertarEnColaCirc(int[] datos, int max, int[] p, int[] u, int dato) {
        if ((u[0] == max - 1 && p[0] == 0) || (u[0] + 1 == p[0])) {
            System.out.println("Desbordamiento");
        } else {
            if (u[0] == max - 1) {
                u[0] = 0;
            } else {
                u[0] = u[0] + 1;
            }
            datos[u[0]] = dato;
            if (p[0] == -1) {
                p[0] = 0;
            }
        }
    }

    public static void eliminarDeColaCirc(int[] datos, int max, int[] p, int[] u, int[] dato) {
        if (p[0] == -1) {
            System.out.println("Subdesbordamiento");
        } else {
            dato[0] = datos[p[0]];
            if (p[0] == u[0]) {
                p[0] = -1;
                u[0] = -1;
            } else {
                if (p[0] == max - 1) {
                    p[0] = 0;
                } else {
                    p[0] = p[0] + 1;
                }
            }
        }
    }
}