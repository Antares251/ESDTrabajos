
public class AppExamenCadenas {

    public static void main(String[] args) {
        String palabra = "Amor a roma";

        char[] car = new char[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            car[i] = palabra.charAt(i);
            car[i] = convertirMayuscula(car[i]);
        }

        String check = esPalindromo(eliminarEspacios(car)) == true ? "Es palindromo" : "No es palindromo";

        System.out.println("La palabra es: " + palabra + " y es: " + check);

    }

    public static char[] eliminarEspacios(char[] cadenaEntrada) {
        int aux = 0;
        for (char c : cadenaEntrada) {
            if (c != ' ') {
                aux++;
            }
        }

        char[] cadenaAux = new char[aux];
        int j = 0;
        for (int i = 0; i < cadenaEntrada.length; i++) {
            if (cadenaEntrada[i] != ' ') {
                cadenaAux[j++] = cadenaEntrada[i];
            }
        }
        return cadenaAux;
    }

    public static boolean esPalindromo(char[] cadena) {
        int i = 0, j = cadena.length - 1;
        while (i < j) {
            if (cadena[i++] != cadena[j--]) {
                return false;
            }
        }
        return true;
    }

    public static boolean esMinuscula(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static char convertirMayuscula(char c) {
        if (esMinuscula(c)) {
            c = (char) (c - 32);
        }
        return c;
    }

}
