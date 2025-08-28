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

    // Method to display details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Overloaded method to display with message
    void display(String msg) {
        System.out.println(msg + ": Name = " + name + ", Age = " + age);
    }
}

public class Lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Student 1 using default constructor
        System.out.print("Enter name for Student 1: ");
        String name1 = sc.nextLine();
        System.out.print("Enter age for Student 1: ");
        int age1 = sc.nextInt();
        sc.nextLine(); // consume newline

        Student s1 = new Student();
        s1.name = name1;
        s1.age = age1;

        // Student 2 using parameterized constructor
        System.out.print("Enter name for Student 2: ");
        String name2 = sc.nextLine();
        System.out.print("Enter age for Student 2: ");
        int age2 = sc.nextInt();

        Student s2 = new Student(name2, age2);

        // Display both students
        System.out.println("\n--- Student Details ---");
        s1.display("Student 1");
        s2.display("Student 2");

        sc.close();
    }
}
