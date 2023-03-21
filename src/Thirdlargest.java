//4. Define a class which has a main method, it initializes an integer array and finds the 3rd largest element without sorting the array.
import java.util.*;
public class Thirdlargest {
    public int tmax(int a[]) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer num : a) {
            if (num.equals(max1) || num.equals(max2) || num.equals(max3))
                continue;
            if (max1 == null || max1 < num) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max2 == null || max2 < num) {
                max3 = max2;
                max2 = num;
            } else if (max3 == null || max3 < num) {
                max3 = num;
            }
        }
            if (max3 == null)
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
//        List<Integer> list =new ArrayList<>();
//        for(int i=0;i<s;i++)
//            list.add(a[i]);
//        list.remove(Collections.max(list));
//        list.remove(Collections.max(list));
//        System.out.println(Collections.max(list));
        Thirdlargest tl=new Thirdlargest();
        int max = tl.tmax(a);
        System.out.println(max);
    }
}




