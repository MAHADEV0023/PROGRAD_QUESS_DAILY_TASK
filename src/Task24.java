//Write a Java program for Company Insurance Policy. A company insure its driver under the following conditions
//If driver is married
//If driver is unmarried male and age above 30
//If driver is unmarried female and age above 25
import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        char m_status , gender;
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Are you married ?[Y/N] : ");
        m_status=sc.next().charAt(0);

        if(m_status == 'Y' || m_status == 'y')
        {
            System.out.println("A company insure you , Thankyou.");
        }
        else
        {
            System.out.println("gender [M/F] : ");
            gender=sc.next().charAt(0);
            System.out.println("Enter Your Age");
            age=sc.nextInt();

            if(gender == 'M' || gender == 'm')
            {
                if(age > 30)
                {
                    System.out.println("A company insure you , Thankyou.");
                }
                else
                {
                    System.out.println("A company not insure you , Thankyou.");
                }
            }
            else if(gender == 'F' || gender == 'f')
            {
                if(age > 25)
                {
                    System.out.println("A company insure you , Thankyou.");
                }
                else
                    System.out.println("A company not insure you , Thankyou.");
            }
            else
                System.out.println("A company not insure you , Thankyou");
        }

    }
}
