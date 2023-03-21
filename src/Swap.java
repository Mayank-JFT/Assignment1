//5. Define a class which has a main method, it initializes two integers, displays their values,
// swaps them without using a third variable and again displays their values.
import java.util.Scanner;

public class Swap {
    void swap(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a is: "+a+" value of b is: "+b);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Value of a is: "+num1+" value of b is: "+num2);
        System.out.println("After swapping:");
        Swap s=new Swap();
        s.swap(num1,num2);

    }

}
