

//6. Define a class which has a main method, It creates an integer array of 10 elements and initializes it by values from 1 to 10.
// Replace a random element value by 0. Your method should identify and display the missing element ( which is replaced by zero).
import java.util.*;
public class Randomele {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values from 1 to 10:");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            try {
                a[i] = sc.nextInt();
            }catch(Exception e){
                System.out.println(e);
                System.exit(0);
        }
            if(a[i]>=1||a[i]<10)
            {
                continue;
            }
            else {
                System.out.println("Entered wrong number.");
                System.exit(0);
            }

        }
        int sum1=Arrays.stream(a).sum();
        int r=new Random().nextInt(a.length);

        System.out.println("The array after replacing random element with 0:");
        for(int k=0;k<10;k++)
        {
            if(r==a[k])
                a[k]=0;
            System.out.print(a[k]+" ");
        }
        int sum2=Arrays.stream(a).sum();
                System.out.println("\nMissing element is:"+(sum1-sum2));
            }
        }


