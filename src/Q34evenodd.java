import java.util.Scanner;

public class Q34evenodd {
    public static void main(String[] args) {
        int n;
        System.out.println("enter the size of array");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        int []arr=new int[n];
        int []arr_even =new int[n];
        int []arr_odd =new int[n];
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
        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]%2==0)
            {
                arr_even[i]=arr[i];
            }
            else
            {
                arr_odd[i]=arr[i];
            }
        }
        System.out.println();
        System.out.println("The even array elements are");
        for (int i=0;i<arr.length;i++)
        {
            if(arr_even[i]!=0)
            {
            System.out.print(arr_even[i]+ " ");
            }
        }
        System.out.println();
        System.out.println("The odd array elements are");
        for (int i=0;i<arr.length;i++)
        {
            if(arr_odd[i]!=0)
        {
            System.out.print(arr_odd[i]+ " ");
        }
        }

    }
}
