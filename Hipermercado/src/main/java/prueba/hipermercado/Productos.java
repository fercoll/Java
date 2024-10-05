
package prueba.hipermercado;

public class Productos {
    int Id;
    String Producto;
    int Cantidad;
    int Precio;

    public Productos(int Id, String Producto, int Cantidad, int Precio) {
        this.Id = Id;
        this.Producto = Producto;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
    }
    
    public void datos(){
       System.out.println("El Id del producto es: " + Id + " El producto es " + Producto + " Hay en stock " + Cantidad + " Tiene un precio por unidad de: " + Precio);

    }
}
