    import java.util.Scanner;

    public class Cadenas {
        public static void main(String[] args){
    //        String cad1 = "Tec Laguna";
    //        System.out.println("Cad1 = "+cad1);
    //        System.out.println("Cad 1".concat(cad1));
    //
    //        char [] cadChar = cad1.toCharArray();
    //        System.out.println("ChadChar = "+ String.valueOf(cadChar));
    //
    //        for (int i = 0; i < cad1.length(); i++) {
    //            System.out.print(cadChar[i]);
    //        }
    //
    //        System.out.println();
    //        for(int i = cad1.length()-1; i >= 0; i--){
    //            System.out.print(cad1.charAt(i));
    //        }

            // Implemente un metodo que cuente cuantas letras mayusculas hay en un texto proporcionado por el usuario
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese el texto");
            String txt = sc.nextLine();

            int cantMayusculas =0, cantMinusculas=0,cantDigitos=0;

    //        System.out.println("Cantidad de mayusculas: "+mayus(txt));

            for (int i = 0; i < txt.length(); i++) {
                if (Caracter.esMayuscula(txt.charAt(i))==true)
                    cantMayusculas++;
            }

            for (int i = 0; i < txt.length(); i++) {
                if (Caracter.esDigito(txt.charAt(i))==true){
                    cantDigitos++;
                }
            }
            for (int i = 0; i < txt.length(); i++) {
                if (Caracter.esMinuscula(txt.charAt(i))==true){
                    cantMinusculas++;
                }
            }
            System.out.println();

            char[] cadenaChar = txt.toCharArray();

            for (int i = 0; i < txt.length(); i++) {
                cadenaChar[i] = Caracter.convertirMinuscula(txt.charAt(i));
            }
            System.out.println("Cadena Modificada: "+String.valueOf(cadenaChar));

            for (int i = 0; i < txt.length(); i++) {
                System.out.print(Caracter.convertirMayuscula(txt.charAt(i)));
            }
            System.out.println();
            System.out.println("Cantidad de mayusculas: "+cantMayusculas+"\nCantidad de minusculas: "+cantMinusculas+"\nCantidad de digitos: "+cantDigitos);

    //        Implemente los metodoa
    //                a) Para convertir una letra minuscula en mayuscula
    //                    b) si es minuscula es mayuscula

    //        Agregar un metodo para determinar minusculas
        }

    //    public static int mayus(String cad){
    //        int cont = 0;
    //        for (int i = 0; i < cad.length(); i++) {
    //            if (Character.isUpperCase(cad.charAt(i))) {
    //                cont++;
    //            }
    //        }
    //            return cont;
    //    }
    //
    //    public static boolean esMayuscula(char c){
    //        return c >= 'A' && c <= 'Z';
    //    }
    //
    //    public static boolean esDigito(char c){
    //        return c >= 48 && c <= 57;
    //    }
    //
    //    public static boolean esMinuscula(char c){
    //        return c >= 'a' && c <= 'z';
    //    }

    //Determinar letras vocales con minusculas y mayusculas con y sin acento
    }
