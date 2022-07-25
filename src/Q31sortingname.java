import java.util.Scanner;

public class Q31sortingname {
    public static void main(String[] args) {
        String temp;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Number Of Names ");
        int n=sc.nextInt();
        System.out.println("Enter The Array Element");
        String arr[]=new String[n];

        for (int i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        System.out.println("The sorted array based on name is:"+" ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i].compareTo(arr[j]) > 0) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+"  ");
        }
    }
}
