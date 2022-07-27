import java.util.Scanner;

import static java.lang.System.exit;

public class Q36menudrivenprogramforarray
{
    public static void  search(int arr[], int n)
    {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element to search:");
        x = sc.nextInt();
        int flag=0;

            for (int j=0;j<n;j++)
            {
                if (arr[j]==x){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                System.out.println("Element Found In An Array");
            }
            else {
                System.out.println("Element Not Found In An Array");
            }
        }


    public static int insert(int arr[], int n)
    {
        int j=arr.length;
        int insert_ele, position_ele;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element to insert:");
        insert_ele = sc.nextInt();
        System.out.println("enter the position to insert element");
        position_ele = sc.nextInt();
        int idx = position_ele - 1;
        if(position_ele>0 && position_ele<=n+1){
        for (int i = n - 1; i >= idx; i--)
        {
            arr[i + 1] = arr[i];
        }

        arr[idx] = insert_ele;
        }
        else{
            System.out.println("Invalied Position");
        }
        return n + 1;
    }
public static void rotate(int arr[],int n)
{

    int s=arr[0];

        for (int j=0;j<n;j++)
        {
            arr[j]=arr[j+1];
        }
        arr[n-1]=s;

    }

    public static int delete(int arr[], int n)
    {
        int x,flag = 1, loc = 0;
        Scanner s = new Scanner(System.in);
        if(n==0){
            System.out.println("no elements to delete in an array");
        }
        else {
            System.out.print("Enter the element you want to delete:");
            x = s.nextInt();
            for (int i = 0; i < n; i++) {
                if (arr[i] == x) {
                    flag = 1;
                    loc = i;
                    break;
                } else {
                    flag = 0;
                }
            }
            if (flag == 1) {
                for (int i = loc + 1; i < n; i++) {
                    arr[i - 1] = arr[i];
                }

            } else {
                System.out.println("Element not found");
            }
        }
        return n - 1;
    }
    public static void reverse(int arr[], int n)
    {
        int low = 0, temp;
        int high = n - 1;
        while (low < high) {
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void Sort(int[] arr,int n) {

        int temp = 0;
        for(int i=0; i < n; i++)
        {
            for(int j=1; j < (n-i); j++)
            {
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter The Size Of Array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int j=10;
        int[] arr = new int[j];
        if(n>0&&n<=j) {
            System.out.println("Enter The Array Elements");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println();
            int choice;
            do {
                System.out.println("|-----------------------------------------------------------------------|");
                System.out.println("|                  MENUE TO PERFORM ARRAY OPERATIONS                    |");
                System.out.println("|-----------------------------------------------------------------------|");
                System.out.println("| 1.Insert                                                              |");
                System.out.println("| 2.Delete                                                              |");
                System.out.println("| 3.Search                                                              |");
                System.out.println("| 4.Display                                                             |");
                System.out.println("| 5.Reverse                                                             |");
                System.out.println("| 6.Rotate                                                              |");
                System.out.println("| 7.Sort                                                                |");
                System.out.println("| 8.Exit                                                                |");
                System.out.println("|-----------------------------------------------------------------------|");
                System.out.println("Enter Your Choice");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        n = insert(arr, n);
                        System.out.println();
                        break;
                    case 2:
                        if (n == 0) {
                            System.out.println("!! No Element Are Their To  delete");
                            System.out.println("!! Please Insert An Element !!");
                        } else {
                            n = delete(arr, n);

                        }
                        System.out.println();
                        break;

                    case 3:
                        if (n == 0) {
                            System.out.println("!! No Element Are Their To Search");
                            System.out.println("!! Please Insert An Element To Search!!");
                        } else {
                            search(arr, n);
                        }

                        System.out.println();
                        break;

                    case 4:
                        if (n == 0) {
                            System.out.println("!!  No Element Are Their To  Display");
                            System.out.println("!! Please Insert An Element To Display !!");
                        } else {

                            System.out.println("Array Elements Are");
                            for (int i = 0; i < n; i++)
                                if (arr[i] != 0) {
                                    {
                                        System.out.print(arr[i] + " ");
                                    }
                                }
                        }
                        System.out.println();
                        break;
                    case 5:
                        if (n == 0) {
                            System.out.println("!!  No Element Are Their To  Reverse");
                            System.out.println("!! Please Insert An Element To Reverse Array !!");
                        } else {
                            reverse(arr, n);
                        }
                        System.out.println();
                        System.out.println(" Successfully Reversed Array Element !!!");
                        System.out.println();
                        break;
                    case 6:
                        if (n == 0) {
                            System.out.println("!!  No Element Are Their To  Rotate");
                            System.out.println("!! Please Insert An Element To Rotate Array Element !!");
                        } else {
                            int d;
                            System.out.println("Enter how many numbers you want to rotate");
                            d = sc.nextInt();
                            if (d > 0 && d <= n) {
                                for (int i = 1; i <= d; i++) {

                                    rotate(arr, n);
                                }
                            } else {
                                System.out.println("Invalied Input");
                            }
                        }

                        System.out.println();
                        break;
                    case 7:
                        if (n == 0) {
                            System.out.println("!! No Element Are Their To Sort");
                            System.out.println("!! Please Insert An Element To Perform Sort!!");
                        } else {
                            Sort(arr, n);
                            System.out.println("Elements After Sorting Is");
                            for (int i = 0; i < n; i++) {
                                System.out.print(arr[i] + " ");
                            }
                        }
                        System.out.println();
                        System.out.println(" Successfully Sorted Array Element !!!");
                        System.out.println();
                        break;


                    case 8:

                        exit(0);
                        break;
                    default: {
                        System.out.println("Invalied Choice");
                        System.out.println("The Choice Are");
                        System.out.println();
                        break;
                    }
                }
            }
            while (choice != 0);
        }
        else {
            System.out.println("Invalied Array Size");
        }
    }
}
