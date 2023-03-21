
//1.2 Define a class which has a main method, it receives a string as input and reverses it using our own reverse method.
import java.util.*;
public class Rev2 {

    void reverse(String s)
    {
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        System.out.println("Reversed string is:");
        Rev2 obj=new Rev2();
        obj.reverse(s);
    }
}
