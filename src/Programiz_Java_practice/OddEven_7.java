package Programiz_Java_practice;

import java.util.Scanner;

public class OddEven_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check even or odd : ");
        int num = in.nextInt();
        if(num%2==0){
            System.out.println(num+ " is a EVEN Number");
        }
        else {
            System.out.println(num+" is a ODD number");
        }
    }
}
