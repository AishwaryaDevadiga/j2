import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Score of student " + (i + 1) + ": ");
            scores[i] = sc.nextInt();

            if (scores[i] >= 90) {
                grades[i] = 'A';
            } else if (scores[i] >= 75) {
                grades[i] = 'B';
            } else if (scores[i] >= 50) {
                grades[i] = 'C';
            } else if (scores[i] >= 35) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        System.out.println("\n--- Student Grades ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " Scored " + scores[i] + " Grade= " + grades[i]);
        }

        sc.close(); // good practice
    }
}
