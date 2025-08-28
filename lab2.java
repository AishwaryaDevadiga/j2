import java.io.*;

public class lab2 
{
    public static void main(String[] args) throws IOException 
    {
        int num = 1, fact=1;
        while(num <= 10) 
        {
          fact *=num;            
            System.out.println("Factorial of " + num + " = " + fact);
            num++;
        }
    }
} 
