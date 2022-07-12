//JAVA program to reverse the given number.
import java.util.Scanner;

public class task18
{
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int rev=0,rem;
        while(number>0)
        {
            rem=number%10;
            rev=rem+(rev*10);
            number=(number/10);
        }

            System.out.println("the reverse number is :"+" "+rev);
    }
}
