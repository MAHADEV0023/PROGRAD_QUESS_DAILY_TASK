//Program to count all prime numbers upto given number
import java.util.Scanner;

public class task13
{

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int low, high, i, j, flag;
            int count = 0;
            System.out.println("Enter lower bound of the interval: ");
            low = sc.nextInt();
            System.out.println("Enter upper bound of the interval: ");
            high = sc.nextInt();
            System.out.println("Prime numbers between %d and %d are: " + low + " " + high);
            for (i = low; i <= high; i++) {
                if (i == 1 || i == 0)

                    continue;
                flag = 1;

                for (j = 2; j <= i / 2; ++j) {
                    if (i % j == 0) {
                        flag = 0;

                        break;
                    }
                }
                if (flag == 1) {
                    count++;
                    System.out.print(i+"\t");

                }

            }
            System.out.println();
            System.out.println("total number of a given range is:"+count);
        }
    }


