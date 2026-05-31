package auta;

class WheeledVehicle extends Vechicle {
    private int numberOfAxles;

    public WheeledVehicle(String color, int numberOfAxles) {
        super(color);
        this.numberOfAxles = numberOfAxles;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }
}