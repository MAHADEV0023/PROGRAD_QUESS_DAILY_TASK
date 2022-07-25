import java.util.Arrays;
import java.util.Scanner;

public class Q33secondlargest
{
    public static void main(String[] args) {
        int n;
        System.out.println("enter the size of array");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the array elements");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("array elements are");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > highest) {

                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i] > secondHighest && arr[i]!=highest)

                secondHighest = arr[i];
        }
        System.out.println("The SecondHighest number in an given array:"+" "+ secondHighest);

    }
}
