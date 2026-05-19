public class AppSBufferSBuilder {
    public static void main(String[] args) {
        String cadena = "Tecnologico de la laguna";

        System.out.println(cadena);

        System.out.println("Numero de palabras en la cadena: " + contarPalabras(cadena));

        char [] charCadena = cadena.toCharArray();

        eliminarEspacios(charCadena);

        System.out.println("Sin espacios: "+ String.valueOf(charCadena)+"//");

        cadena = String.valueOf(eliminarEspaciosPropuesta(cadena));

        System.out.println("Sin espacios(Propuesta): " + cadena+"//");


    }

    public static StringBuffer eliminarEspaciosPropuesta(String txt) {
        StringBuffer sb = new StringBuffer(txt);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                sb.deleteCharAt(i);
            }
        }
        return sb;
    }


    public static int contarPalabras(String txt) {
        String[] palabras = txt.split(" ");
        return palabras.length;
    }

    public static void eliminarEspacios(char[] cadenaEntrada) {
        int pos;
        int aux;
        for (int i = 0; i < cadenaEntrada.length; i++) {
            if (cadenaEntrada[i] == ' '){
                pos = i;
                aux = i;
                while (cadenaEntrada[aux] == ' ' && aux < cadenaEntrada.length - 1) {
                    aux++;
                }
                cadenaEntrada[pos] = cadenaEntrada[aux];
                cadenaEntrada[aux] = ' ';
            }
        }
    }



}
