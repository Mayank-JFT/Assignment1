//2. Define a class which has a main method, it initializes an integer array, displays its elements and their sum.

import java.util.*;
public class Arraysum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int sum=0;
        System.out.println("Enter the elements of array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("THe elements of array are:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
            sum=sum+arr[i];
        }
        System.out.println("\nThe sum of elements is:"+sum);
    }

}
