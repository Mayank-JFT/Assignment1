

//6. Define a class which has a main method, It creates an integer array of 10 elements and initializes it by values from 1 to 10.
// Replace a random element value by 0. Your method should identify and display the missing element ( which is replaced by zero).
import java.util.Random;
public class Randomele {

    public static void main(String args[])
    {
        int a[]={1,4,2,3,6,5,10,9,8,7};
        int r=new Random().nextInt(a.length);
        System.out.println("The array after replacing random element with 0:");
        for(int k=0;k<10;k++)
        {
            if(r==a[k])
                a[k]=0;
            System.out.print(a[k]+" ");
        }
        System.out.println("\nThe missing element is :"+r);
    }
}
