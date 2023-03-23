

//6. Define a class which has a main method, It creates an integer array of 10 elements and initializes it by values from 1 to 10.
// Replace a random element value by 0. Your method should identify and display the missing element ( which is replaced by zero).
import java.util.*;
public class Randomele {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]={1,4,2,3,5,8,6,7,9,10};
        int r=6;
        int min=55;//(n*(n+1))/2
        System.out.println("The array after replacing random element with 0:");
        for(int k=0;k<10;k++)
        {
            if(r==a[k])
                a[k]=0;
            min=min-a[k];
            System.out.print(a[k]+" ");
        }

                System.out.println("\nMissing element is:"+min);

            }
        }


