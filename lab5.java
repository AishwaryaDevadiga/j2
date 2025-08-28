import java.io.*;  

class lab5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;

        // Menu runs until user chooses 3
        while (choice != 3) 
        {
            // Display menu
            System.out.println("\n--- MENU ---");
            System.out.println("1. Find Area and Circumference of Circle");
            System.out.println("2. Check Prime Number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            choice = Integer.parseInt(br.readLine()); // read user choice

            if (choice == 1) 
            {
                // Circle area and circumference
                System.out.print("Enter radius of circle: ");
                double radius = Double.parseDouble(br.readLine());
                double area = Math.PI * radius * radius;
                double circumference = 2 * Math.PI * radius;
                System.out.println("Area of Circle = " + area);
                System.out.println("Circumference of Circle = " + circumference);

            } 
            else if (choice == 2) 
            {
                // Prime number check
                System.out.print("Enter a number: ");
                int num = Integer.parseInt(br.readLine());
                boolean isPrime = true;

                if (num <= 1) 
                {
                    isPrime = false;
                } 
                else 
                {
                    for (int i = 2; i <= num / 2; i++) 
                    {
                        if (num % i == 0) 
                        {
                            isPrime = false;
                            break;
                        }
                    }
                }

                if (isPrime)
                    System.out.println(num + " is a Prime Number.");
                else
                    System.out.println(num + " is NOT a Prime Number.");

            } 
            else if (choice == 3) 
            {
                System.out.println("Exiting Program...");

            } 
            else 
            {
                System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
 