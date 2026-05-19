/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appsenos;

/**
 *
 * @author antares
 */
public class AppVectorNombre {
    public static void main (String [] args){
                String nombre = "Alejandro";
        CVector letras = new CVector(nombre.length());

        for (int i = 0; i< nombre.length(); i++){
            letras.asignar(nombre.charAt(i),i);
            System.out.println((char)letras.leer(i)+"=" +letras.leer(i));
        }
    }
}
