public class AppPilaConArchivo {
    public static void main (String[] args){
        System.out.println("ARCHIVOS DE TEXTO");

        String nomArch = "/home/antares/Escritorio/Productos.txt";

        int ndatos = ArchivoDeTexto.contarPalabrasEnArchivo(nomArch);
        String[] productos = new String[ndatos];
        System.out.println("Numero de Productos en el Archivo: "+ndatos);
        System.out.println();
        ArchivoDeTexto.leerArchivo(nomArch, productos);
        
        PilaT <String> pilaProductosT = new PilaT (productos.length);

        int index = 0;

        while(!pilaProductosT.estaLlena()){
            System.out.println("Nombre: "+productos[index]);
            pilaProductosT.push(productos[index++]);
        }

        System.out.println("\n \u001B[34m" + "ETRAYENDO DATOS DE LA PILA");

        while(!pilaProductosT.estaVacia()){
            System.out.println("Nombre: "+pilaProductosT.pop());
        }
    }
}
