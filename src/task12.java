//Prog to print all prime numbers between given range
import java.util.Scanner;

public class task12 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int low, high, i, j, flag;
        int count = 0;
        System.out.println("Enter lower bound of the interval: ");
        low = sc.nextInt();
        System.out.println("Enter upper bound of the interval: ");
        high = sc.nextInt();
        System.out.println("Prime numbers between range are: " + low + " " + high);
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
            }

        }


