package ksiazka.rozdzial4;

public class VehConsDemo {
    public static void main(String[] args) {

        //tworzy obiekty Vehicle
        Vehicle minivan = new Vehicle(7, 65, 9.1);
        Vehicle sportscar = new Vehicle(2, 55, 12.5);
        double litres;
        int dist = 252;

        litres = minivan.fuelneeded(dist);
        System.out.println("Aby przejechać " + dist + " kilometrów, minivan potrzebuje " +
                litres + " litrów paliwa.");

        litres = sportscar.fuelneeded(dist);
        System.out.println("Aby przejechać " + dist + " kilometrów, auto sportowe potrzebuje " +
                litres + " litrów paliwa.");
    }
}
