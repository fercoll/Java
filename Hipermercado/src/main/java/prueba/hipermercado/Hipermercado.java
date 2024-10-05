

package prueba.hipermercado;

import java.util.Scanner;

public class Hipermercado {

    public static void main(String[] args) {
      
        Productos producto1 = new Productos(1, "Leche", 28, 2500);
        Productos producto2 = new Productos(2, "Frijol", 40, 2300);
        Productos producto3 = new Productos(3, "Galletas", 5, 1800);
        Productos producto4 = new Productos(4, "Papas", 80, 1500);
        Productos producto5 = new Productos(5, "Chocolate", 34, 2000);
        
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println(" Selecciona un producto para ver su información: ");
            System.out.println("1. Leche");
            System.out.println("2. Frijol");
            System.out.println("3. Galletas");
            System.out.println("4. Papas");
            System.out.println("5. Chocolate");
            System.out.println("0. Salir");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> producto1.datos();
                case 2 -> producto2.datos();
                case 3 -> producto3.datos();
                case 4 -> producto4.datos();
                case 5 -> producto5.datos();
                case 0 -> System.out.println(" Adios ");
                default -> System.out.println("Opción no válida");
            }

        } while (opcion != 0); 
        scanner.close();
    }
}

