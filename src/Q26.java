//Write a program to input electricity unit charge and calculate the total electricity bill according to the given condition:
  //      For first 50 units Rs. 0.50/unit
    //    For next 100 units Rs. 0.75/unit
      //  For next 100 units Rs. 1.20/unit
        //For unit above 250 Rs. 1.50/unit
        //An additional surcharge of 20% is added to the bill.
import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        int unit;
        double amount, total_amount, surcharge ;
        System.out.println("enter the number of Units consumed :");
        Scanner sc=new Scanner(System.in);
        unit=sc.nextInt();
        if(unit <= 50)
        {
            amount = unit * 0.50;
        }
        else if(unit <= 150)
        {
            amount = (100 * 0.50) + ((unit-50) * 0.75);
        }
        else if(unit <= 250)
        {
            amount = (100 * 0.50) + (100*0.75)+ ((unit-150) * 1.20);
        }
        else
        {
            amount =(100 * 0.50) + (100*0.75)+(100*1.20) + ((unit-250) * 1.50);
        }



        surcharge  = amount * 0.20;
        total_amount = amount + surcharge ;

        System.out.println("Electricity Bill = "+ total_amount+" Rs.");


    }
}
