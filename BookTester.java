package lab00.triangle;

public class TriangleTester {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(15, 30, 25);
        Triangle t2;
        Triangle t3 = new Triangle();
        try {
            t1.resize(10, 30, 50);
        } catch (RuntimeException e) {
            System.out.println("t1 could not be resized for given sides");
        }
        t2 = new Triangle(30, 40, 50);
        try {
            t3 = new Triangle(10, 20, 50);
        } catch (RuntimeException e) {
            System.out.println("triangle for t3 could not be constructed for given sides");
        }
        // test area and perimeter
        System.out.println("Area of t1: " + t1.area());
        System.out.println("Perimeter of t1: " + t1.perimeter());
        System.out.println("Area of t2: " + t2.area());
        System.out.println("Perimeter of t2: " + t2.perimeter());
        System.out.println("Area of t3: " + t3.area());
        System.out.println("Perimeter of t3: " + t3.perimeter());
    }
}
