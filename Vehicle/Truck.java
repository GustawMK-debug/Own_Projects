package auta;

class Truck extends WheeledVehicle {
    double mass;

    public Truck(String color, int numberOfAxles, double mass) {
        super(color, numberOfAxles);
        this.mass = mass;
    }

    public void startDriving() {
        double axleLoad = mass / getNumberOfAxles();

        if (axleLoad > 11.0) {
            System.out.println("Jazda niebezpieczna, odmowa uruchomienia silnika");
        } else {
            System.out.println("Silnik uruchomiony pomyślnie.");
        }
    }
}