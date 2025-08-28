import java.util.Scanner;

class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Method Overloading: display without message
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Method Overloading: display with custom message
    void display(String msg) {
        System.out.println(msg + " -> Name: " + name + ", Age: " + age);
    }
}

public class lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Student 1 ---
        System.out.println("Enter details for Student 1:");
        System.out.print("Enter name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter age: ");
        int age1 = sc.nextInt();
        sc.nextLine(); // consume newline

        Student s1 = new Student(); // using default constructor
        s1.name = name1;
        s1.age = age1;

        // --- Student 2 ---
        System.out.println("\nEnter details for Student 2:");
        System.out.print("Enter name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter age: ");
        int age2 = sc.nextInt();

        Student s2 = new Student(name2, age2); // using parameterized constructor

        // --- Display Students ---
        System.out.println("\n--- Student Details ---");
        s1.display("Student 1");
        s2.display("Student 2");

        sc.close();
    }
}
