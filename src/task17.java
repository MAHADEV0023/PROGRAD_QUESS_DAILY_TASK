//JAVA program to print sum of digits.
import java.util.Scanner;

public class task17
{
    public static void main(String[] args) {
        int sum=0;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int temp=number;
        while(number>0)
        {
            temp=number%10;
            sum+=temp;
            number=(number/10);
        }
        System.out.println("the sum of all digits is equal to"+" "+sum);
    }
}

