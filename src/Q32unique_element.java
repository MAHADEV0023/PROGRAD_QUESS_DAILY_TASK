import java.util.Scanner;

public class Q32unique_element {
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

        for (int i = 0; i < n; i++)
        {
            int j = 0;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            if (i == j)
            {

                count++;
            }
        }
        System.out.println("total number of uniqe number are:"+ count);
    }
}
