import java.util.Scanner;

class Lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            // Display menu
            System.out.println("\n--- MENU ---");
            System.out.println("1. Find Area and Circumference of Circle");
            System.out.println("2. Check Prime Number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Circle calculations
                    System.out.print("Enter radius of circle: ");
                    double radius = sc.nextDouble();
                    double area = Math.PI * radius * radius;
                    double circumference = 2 * Math.PI * radius;
                    System.out.println("Area of Circle = " + area);
                    System.out.println("Circumference of Circle = " + circumference);
                    break;

                case 2:
                    // Prime number check
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    boolean isPrime = true;

                    if (num <= 1) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= num / 2; i++) {
                            if (num % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }

                    if (isPrime)
                        System.out.println(num + " is a Prime Number.");
                    else
                        System.out.println(num + " is NOT a Prime Number.");
                    break;

                case 3:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}
