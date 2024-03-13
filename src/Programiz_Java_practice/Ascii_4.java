/*Java Program to Find ASCII Value of a character*/
package Programiz_Java_practice;

import java.util.Scanner;

public class Ascii_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = in.next().charAt(0);
        int num = (int) ch;
        System.out.println("The ASCII value of The number is : " + num);
    }
}
