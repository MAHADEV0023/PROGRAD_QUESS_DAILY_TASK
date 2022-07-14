import java.util.Scanner;

// Find the sum of 1 to n numbers using recursion.
public class Q28 {
    public static int addNumbers(int num) {
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }
    public static void main(String[] args) {
        System.out.println("eneter the number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum = addNumbers(number);
        System.out.println("Sum of numbers between 1 to "+number+" --> "+ sum);

    }
}
