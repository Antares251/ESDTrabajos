/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author lore
 */
class Producto{
     int clave; // Llave primaria
     String nombreProducto;
     //Agregar descripcion del producto
     double precio;
     //Agregar cantidad en el almacen
}
public class Nodo {
    
    //public int valor;
    Producto producto = new Producto();
    
    public Nodo sig;
    
    public Nodo(Producto prod, Nodo nodo){
        producto.clave = prod.clave;
        producto.nombreProducto = prod.nombreProducto;
        producto.precio = prod.precio;
        sig = nodo;
    }
}
