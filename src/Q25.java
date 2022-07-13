//Write a Java program for bonus calculation. Accept basic salary from user. Calculate TA = 10%, DA= 15%, HRA = 20%, PF= 12% of basic salary. If basic >= 20,000 then give 10% bonus otherwise give 20% bonus on basic salary. Calculate his gross (final) salary ( gross salary = Basic + DA + TA + HRA + Bonus – PF)
import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Basic Pay: ");
        double basic_pay = in.nextDouble();
        double bonus_amt;
        double da = 0.15 * basic_pay;
        double hra = 0.20 * basic_pay;
        double ta = 0.10 * basic_pay;
        double pf = 0.12 * basic_pay;

        if (basic_pay>=20000)
        {
            bonus_amt=basic_pay*0.10;
            basic_pay=bonus_amt+basic_pay + da + hra + ta - pf;
            System.out.println("bonus ammout got by the employe is "+bonus_amt);
        }
        else{
            bonus_amt=basic_pay*0.20;
            basic_pay=bonus_amt+basic_pay + da + hra + ta - pf;
            System.out.println("bonus ammout got by the employe is "+bonus_amt);
        }


        System.out.println("Gross Pay = " + basic_pay+" Rs");
    }
}
