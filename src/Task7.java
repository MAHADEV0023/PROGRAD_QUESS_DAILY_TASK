import java.util.Scanner;

public class Task7
{
    public static void palin()
    {
        int num,t,s,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the currency number ");
        num=sc.nextInt();
        System.out.println("Enter the currency amount");
        int currency=sc.nextInt();
        t=num;
        for(s=0;num>0;num/=10)
        {
            rem=num%10;
            s=(s*10)+rem;
        }
        if(s==t)
            System.out.println(t+" YOUR currency is  palindrome  "+currency*3);

        else
            System.out.println(t+" your currency is  not a palindrome number "+ currency);
    }




    public static void main(String[] args) {
        palin();




    }
}

