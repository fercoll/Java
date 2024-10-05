
package prueba.agenciaturismo;


public class AgenciaTurismo {

    public static void main(String[] args) {
        Turismo viaje1 = new Turismo(1, " Paris - Francia", 5000, 12);
        Turismo viaje2 = new Turismo (2,"Barcelona - España", 8000, 15);
        Turismo viaje3 = new Turismo (3, "Cancun - Mexico", 3000, 5);
        Turismo viaje4 = new Turismo (4, "Roma - Italia", 9000, 10);
        Turismo viaje5 = new Turismo (5, "Tokio - Japon", 12000, 20);
        
        System.out.println(" Viajes disponibles ");
        viaje1.datos();
        viaje2.datos();
        viaje3.datos();
        viaje4.datos();
        viaje5.datos();
        
    }
}
