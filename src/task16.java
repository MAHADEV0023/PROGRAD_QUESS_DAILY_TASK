//Program to find all prime factors of given number.
import java.util.Scanner;

public class task16
{
    public static void primeFactors(int number)
    {

        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {

            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
        if (number > 2)
            System.out.print(number+" ");
    }

    public static void main(String[] args)
    {
        System.out.println("enter the number");
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("the prime factor number are:");
        primeFactors(number);
    }
}
