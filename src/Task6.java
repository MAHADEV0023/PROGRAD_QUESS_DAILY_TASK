import java.util.Scanner;
import java.util.*;
public class Task6 {


        public static String digit_replacement(String number) {
            return number.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
        }


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the string");
            String number=sc.next();
            System.out.println(digit_replacement(number));

        }


    }


