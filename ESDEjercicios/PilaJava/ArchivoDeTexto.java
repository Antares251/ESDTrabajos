import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ArchivoDeTexto {

    public static int contarPalabrasEnArchivo(String nomArch){
    int cont = 0;
    try{
        Scanner sc = new Scanner(new File(nomArch));
        while(sc.hasNext()){
            sc.nextLine();
            cont++;
        }
        sc.close();
    }catch(IOException e){
        e.printStackTrace();
    }

    return cont;

}

    public static void leerArchivo(String nomArch, String[]productos){
        File file = new File(nomArch);
        String cadena;
        int i = 0;
         Scanner sc = null;
         try{
            sc = new Scanner(file);
            System.out.println("CONTENIDO DEL ARCHIVO");
            while(sc.hasNext()){
                cadena = sc.nextLine();
                productos[i++] = cadena;
                System.out.println(cadena);
            }
        }catch(FileNotFoundException e){
                System.out.println("Excepcion del compilador");
            }finally{
                sc.close();
            }
        
         
    }
}
