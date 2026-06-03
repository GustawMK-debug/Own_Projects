package fig;

class Triangle {
    private double a;

    public Triangle(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public double getArea() {
        return (a * a * Math.sqrt(3)) / 4.0;
    }

    public void showArea() {
        System.out.println("Pole powierzchni: " + getArea());
    }
}