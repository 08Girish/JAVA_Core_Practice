/*Java Program to Multiply two Floating Point Numbers*/

package Programiz_Java_practice;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two float numbers : ");
        float x = in.nextFloat();
        float y = in.nextFloat();
        System.out.println("Multiplication of two number are : "+(x*y));
    }
}
