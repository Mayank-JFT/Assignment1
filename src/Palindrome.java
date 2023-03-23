//3. Define a class which has a main method, it receives an integer as input and displays whether it is palindrome or not?

import java.util.Scanner;

public class Palindrome {

    static boolean palin(int num)
    {
        int rev=0;
        int temp=num;
        while(temp>0)
        {
            int y=temp%10;
            rev=(rev*10)+y;
            temp=temp/10;
        }

        return rev == num;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        if(Palindrome.palin(num))
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
    }

}
