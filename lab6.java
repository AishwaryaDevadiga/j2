import java.io.*;

interface Rectangle {
    double areaRectangle(double l, double b);
}

interface Triangle {
    double areaTriangle(double b, double h);
}

public class lab6 implements Rectangle, Triangle {
    public double areaRectangle(double l, double b) {
        return l * b;
    }
    public double areaTriangle(double b, double h) {
        return 0.5 * b * h;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        lab6 obj = new lab6();

        System.out.print("Enter length and breadth of rectangle: ");
        double l = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());

        System.out.print("Enter base and height of triangle: ");
        double b = Double.parseDouble(br.readLine());
        double h = Double.parseDouble(br.readLine());

        System.out.println("Area of Rectangle = " + obj.areaRectangle(l, b));
        System.out.println("Area of Triangle = " + obj.areaTriangle(bt, h));
    }
}
