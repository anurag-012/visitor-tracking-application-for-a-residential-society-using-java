package lab00.triangle;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        this.sideA = 0;
        this.sideB = 0;
        this.sideC = 0;
    }

    public Triangle(double a, double b, double c) throws RuntimeException {
        if (isValidTriangle(a, b, c)) {
            this.sideA = a;
            this.sideB = b;
            this.sideC = c;
        } else {
            throw new RuntimeException("Triangle cannot be formed for given sides.");
        }
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && b + c > a && c + a > b;
    }

    public void resize(double new_a, double new_b, double new_c) throws RuntimeException {
        if (isValidTriangle(new_a, new_b, new_c)) {
            this.sideA = new_a;
            this.sideB = new_b;
            this.sideC = new_c;
        } else {
            throw new RuntimeException("Triangle cannot be formed for given sides.");
        }
    }

    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }

    public double getA() {
        return sideA;
    }

    public double getB() {
        return sideB;
    }

    public double getC() {
        return sideC;
    }
}
