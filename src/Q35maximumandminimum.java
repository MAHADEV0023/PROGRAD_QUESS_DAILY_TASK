import java.util.Scanner;

public class Q35maximumandminimum
{
    public static void max(int arr[]){
        int max=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("the Maximum element in an given array is: "+ max);
    }
    public static void min(int arr[]){
        int min=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("the Minimum element in an given array is: "+ min);
    }

    public static void main(String[] args) {
        int n,count=0;
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
        Q35maximumandminimum.max(arr);
        Q35maximumandminimum.min(arr);
    }
}
