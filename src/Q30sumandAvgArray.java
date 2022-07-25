import java.util.Scanner;

public class Q30sumandAvgArray
{
    public static void main(String[] args) {
        float sum=0;
        float avg;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Number Of Array Element");
        int n=sc.nextInt();
        System.out.println("Enter The Array Element");
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for (int j=0;j<arr.length;j++){
            sum+=arr[j];
        }
        avg=sum/arr.length;
        System.out.println("The sum of Array elements is :"+ sum);
        System.out.println("The Average of Array elements is :"+ avg);
    }
}
