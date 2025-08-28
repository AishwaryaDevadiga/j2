import java.util.Scanner;

interface Rectangle {
    double areaRectangle(double l, double br);
}

interface Triangle {
    double areaTriangle(double b, double h);
}

public class Lab6 implements Rectangle, Triangle {

    public double areaRectangle(double l, double br) {
        return l * br;
    }

    public double areaTriangle(double b, double h) {
        return 0.5 * b * h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lab6 obj = new Lab6();

        // Rectangle input
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();

        // Triangle input
        System.out.print("Enter base of triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double h = sc.nextDouble();

        // Display results
        System.out.println("Area of Rectangle = " + obj.areaRectangle(length, breadth));
        System.out.println("Area of Triangle = " + obj.areaTriangle(b, h));

        sc.close();
    }
}
