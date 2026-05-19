public class AppVectorLetras {
    public static void main(String[] args){
        String nombre = "Alejandro";
        CVector letras = new CVector(nombre.length());

        for (int i = 0; i< nombre.length(); i++){
            letras.asignar(nombre.charAt(i),i);
            System.out.println((char)letras.leer(i)+"=" +letras.leer(i));
        }
    }
}
