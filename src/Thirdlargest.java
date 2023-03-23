//4. Define a class which has a main method, it initializes an integer array and finds the 3rd largest element without sorting the array.
import java.util.*;
public class Thirdlargest {
    public static int tmax(int a[]) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for (int num : a) {
            if ((num==max1) || (num==max2) || (num==max3))
                continue;
            if (max1 == Integer.MIN_VALUE || max1 < num) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max2 == Integer.MIN_VALUE || max2 < num) {
                max3 = max2;
                max2 = num;
            } else if (max3 == Integer.MIN_VALUE || max3 < num) {
                max3 = num;
            }
        }
            if (max3 == Integer.MIN_VALUE)
                return max1;

        return max3;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.println("Enter the elements of the array:");
        for (int j = 0; j < s; j++) {
            a[j] = sc.nextInt();
        }
        int max = Thirdlargest.tmax(a);
        System.out.println(max);
    }
}




