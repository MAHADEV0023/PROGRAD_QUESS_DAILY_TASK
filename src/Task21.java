import java.util.*;
public class Task21 {
    public static void main(String[] args) {
        int  max;
        System.out.println("enter the four number");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int num4=sc.nextInt();

        // Largest among n1, n2, n3 and n4
        max = (num1 > num2 && num1 > num3 && num1 > num4) ?
                num1 : ((num2 > num3 && num2 > num4) ?
                num2 : (num3 > num4 ? num3 : num4));

        // Print the largest number
        System.out.println("Largest number among " +
                num1 + ", " + num2 + ", "+ num3 +
                " and " + num4 + " is " + max + ". " );
    }
}
