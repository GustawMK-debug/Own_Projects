package fig;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getArea() {
        return a * b;
    }

    public void showArea() {
        System.out.println("Pole powierzchni: " + getArea());
    }
}
