// Analizar si una palabra o frase es palindromo o no.

public class AppExamenCadenas {
    public static void main(String[] args) {
        String palabra = "OSO";

        char[] car = new char [palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            car[i] = Caracter.convertirMinuscula(palabra.charAt(i));
        }

        String check = Caracter.esPalindromo(Caracter.eliminarEspacios(car)) ?  "Es palindromo":"No es palindromo";
        System.out.println("La palabra es: "+palabra+" y es: " + check);
    }
}
