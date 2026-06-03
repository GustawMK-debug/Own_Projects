package fig;

class Pyramid extends Triangle {
    private double h;

    public Pyramid(double a, double h) {
        super(a);
        this.h = h;
    }

    public Pyramid(Triangle t, double h) {
        super(t.getA());
        this.h = h;
    }

    public double getSurfaceArea() {
        double r = (getA() * Math.sqrt(3)) / 6.0;
        double slantHeight = Math.sqrt(h * h + r * r);
        double sideArea = (getA() * slantHeight) / 2.0;
        return getArea() + 3 * sideArea;
    }

    public double getVolume() {
        return (getArea() * h) / 3.0;
    }

    public void showArea() {
        System.out.println("Pole powierzchni całkowitej: " + getSurfaceArea());
    }

    public void showVolume() {
        System.out.println("Objętość: " + getVolume());
    }
}