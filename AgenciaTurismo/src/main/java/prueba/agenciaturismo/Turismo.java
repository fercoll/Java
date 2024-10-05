

package prueba.agenciaturismo;


public class Turismo {
    int Id;
    String Destino;
    int Precio;
    int duracion;

    public Turismo(int Id, String Destino, int Precio, int duracion) {
        this.Id = Id;
        this.Destino = Destino;
        this.Precio = Precio;
        this.duracion = duracion;
    }
    
    public void datos(){
        System.out.println(" El id es: " + Id);
        System.out.println(" Tiene a destino a " + Destino);
        System.out.println(" Tiene un precio de : $" + Precio);
        System.out.println(" El viaje tiene una duracion de: " + duracion + " Horas ");
    }
    
}
