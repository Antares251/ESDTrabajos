/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appsenos;

/**
 *
 * @author antares
 */
public class AppSenos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*CVectorT <Double> angulos = new CVectorT (5);
        double angulo = 45;
        
        for (int i = 0; i < angulos.tam(); i++) {
            angulos.asignar(Math.sin(angulo*Math.PI/180), i);
            angulo += 5;
        }
        
        for (int i = 0; i < angulos.vec.length; i++) {
            System.out.println("VecAngulos [ "+i+" ]"+" = "+ angulos.leer(i));
        }*/
        
        CVectorT <String> nombre = new CVectorT(10);
        
        String[] nombres = {"Alejandro","Luisa","Lorena","Yamil","Jesusa","Mariel","Roberto","Uriel","Jesus","Vanessa"};
        
        System.out.println("Nombres en el arreglo de nombres: ");
        
        for (int i = 0; i <nombres.length; i++) {
            nombre.asignar(nombres[i], i);
            System.out.println(nombre.leer(i));
        }
    }    
}
