package fig;

class Prism extends Triangle {
    private double h;

    public Prism(double a, double h) {
        super(a);
        this.h = h;
    }

    public Prism(Triangle t, double h) {
        super(t.getA());
        this.h = h;
    }

    public double getSurfaceArea() {
        return 2 * getArea() + 3 * getA() * h;
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