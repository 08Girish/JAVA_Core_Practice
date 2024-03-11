package Programiz_Java_practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class QuoandRem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Divident : ");
        int div = in.nextInt();
        System.out.println("Enter the Divisor : ");
        int divs = in.nextInt();
        float res1 = div/divs;
        float res2 = div%divs;
        System.out.println("Enter 1 for Quotient and 2 for Remainder");
        int choice = in.nextInt();
        if(choice == 1){
            System.out.println("The Quotient of the number is : "+res1);
        }
        else {
            System.out.println("The Remainder of the number is : "+res2);
        }
    }
}
