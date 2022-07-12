//Program to find count of all factors of given number.
import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        int fact=1,count=0;
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Factors of a given number are:");
        for(int i=1;i<=n;i++){
            if (n%i==0){
                System.out.print(i+" ");
                count++;


            }
    }
        System.out.println("");
        System.out.println("total count factors of a given number is :"+" "+count);
}}
