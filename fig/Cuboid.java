package fig;

class Cuboid extends Rectangle {
    private double h;

    public Cuboid(double a, double b, double h) {
        super(a, b);
        this.h = h;
    }

    public Cuboid(Rectangle r, double h) {
        super(r.getA(), r.getB());
        this.h = h;
    }

    public double getSurfaceArea() {
        return 2 * getArea() + 2 * getA() * h + 2 * getB() * h;
    }

    public double getVolume() {
        return getArea() * h;
    }

    public void showArea() {
        System.out.println("Pole powierzchni całkowitej: " + getSurfaceArea());
    }

    public void showVolume() {
        System.out.println("Objętość: " + getVolume());
    }
}