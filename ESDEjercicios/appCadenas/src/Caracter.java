public class Caracter {
    public static int mayus(String cad){
        int cont = 0;
        for (int i = 0; i < cad.length(); i++) {
            if (Character.isUpperCase(cad.charAt(i))) {
                cont++;
            }
        }
        return cont;
    }

    public static boolean esMayuscula(char c){
        return c >= 'A' && c <= 'Z';
    }

    public static boolean esDigito(char c){
        return c >= 48 && c <= 57;
    }

    public static boolean esMinuscula(char c){
        return c >= 'a' && c <= 'z';
    }

    public static boolean esLetra(char c){
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static boolean esVocal(char c){
        return esLetra(c) && (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

    public static boolean esVocalMinuscula(char c){
        return esLetra(c) && esMinuscula(c) && (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'|| c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú');
    }

    public static boolean esVocalMayuscula(char c){
        return esLetra(c) && esMayuscula(c) && (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'|| c == 'Á' || c == 'É' || c == 'Í' || c == 'Ó' || c == 'Ú');
    }

    public static char convertirMayuscula(char c){
        if (esMinuscula(c)) {
            c = (char) (c - 32);
        }
        return c;
    }

    public static char convertirMinuscula(char c){
        if (esMayuscula(c)) {
            c = (char) (c + 32);
        }
        return c;
    }
}
