//1.1 Define a class which has a main method, it receives a string as input and reverses it using methods of string class.

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String st=sc.nextLine();
        StringBuffer sb=new StringBuffer(st);
        sb.reverse();
        System.out.println("Reversed string is:\n"+sb);
    }
}