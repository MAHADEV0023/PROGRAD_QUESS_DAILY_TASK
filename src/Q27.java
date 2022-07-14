//Find the table of given number using recursion
import java.util.Scanner;

public class Q27 {
    static void mul_table(int N, int i)
        {

            if (i > 10)
                return ;
            System.out.println(N + " * " + i + " = " + N * i);
            mul_table(N, i + 1);
        }

        public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        mul_table(N,1);
    }
}
