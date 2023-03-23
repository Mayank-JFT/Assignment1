
//1.2 Define a class which has a main method, it receives a string as input and reverses it using our own reverse method.
import java.util.*;
public class Rev2 {

    static String reverse(String s)
    {
        char ch[]=s.toCharArray();
        char temp;
        for(int i=0;i<s.length()/2;i++)
        {
            temp=ch[i];
            ch[i]=ch[s.length()-i-1];
            ch[s.length()-1-i]=temp;
        }
        return String.valueOf(ch);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        System.out.println("Reversed string is:");
        String s2=reverse(s);
        System.out.println(s2);
    }
}
