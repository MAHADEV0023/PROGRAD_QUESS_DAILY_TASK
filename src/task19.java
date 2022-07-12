//JAVA program to check given number is Armstrong or not.
import java.util.Scanner;

public class task19
{
    public static void main(String[] args) {
        int originalNumber, remainder, result = 0,digits=0;
        System.out.println("enter the number");
        Scanner sc =new Scanner(System.in);
        int number =sc.nextInt();
        int temp=number;
        originalNumber = number;
        while (temp != 0) {
            temp /= 10;
            ++digits;
        }

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
