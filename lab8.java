import java.util.Scanner;
class lab8 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int a = sc.nextInt();

        System.out.print("Enter denominator: ");
        int b = sc.nextInt();

        try 
        {
            int c = a / b;
            System.out.println("Result = " + c);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Divide by Zero not allowed!");
        }
        sc.close();
    }
}
