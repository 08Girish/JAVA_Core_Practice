package Programiz_Java_practice;

import java.util.Scanner;

public class Swap_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tem=0;
        System.out.println("Enter the two number for Swaping");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Before Swaping :"+a+" : "+b);
        tem=a;
        a=b;
        b=tem;
        System.out.println("After Swaping  :"+a+" : "+b);
    }
}
