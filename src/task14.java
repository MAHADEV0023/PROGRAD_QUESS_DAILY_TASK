//Program to find all factors of the given number.
import java.util.Scanner;

public class task14 {
    public static void main(String args[]){

        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Factors of a given number are:");
        for(int i=1;i<=n;i++){
            if (n%i==0){
                System.out.print(i+" ");

        }

    }
}}
