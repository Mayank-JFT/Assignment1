//5. Define a class which has a main method, it initializes two integers, displays their values,
// swaps them without using a third variable and again displays their values.
import java.util.Scanner;

public class Swap {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Value of a is: "+a+" value of b is: "+b);
        a=a*b;
        b=a/b;
        a=a/b;

        System.out.println("After swapping:");
        System.out.println("Value of a is: "+a+" value of b is: "+b);

    }

}
