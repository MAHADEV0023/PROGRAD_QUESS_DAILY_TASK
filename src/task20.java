//JAVA Program to Display Armstrong Number between Two Intervals.
import java.util.Scanner;

public class task20
{
    public static void main(String[] args) {
        int  low,high,count=0;
        System.out.println("enter the lowrange");
        Scanner sc=new Scanner(System.in);
        low=sc.nextInt();
        System.out.println("enter the highrange");
        high=sc.nextInt();
        System.out.println("the amstrong numbers are:");
        for(int number = low + 1; number < high; ++number) {
            int digits = 0;
            int result = 0;
            int originalNumber = number;

            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }

            originalNumber = number;

            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }

            if (result == number) {
                count++;
                System.out.print(number + " ");
            }
        }
        System.out.println();
        System.out.println("the total amstrong number between range is:"+" "+count);
    }
}
