/*Java Program to Find the Largest Among Three Numbers*/
package Programiz_Java_practice;

import java.util.Scanner;

public class Largest_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the three Numbers to find : ");
        int n1= in.nextInt();
        int n2= in.nextInt();
        int n3= in.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println(n1+" is the largest number.");
        }
        if(n2>n1 && n2>n3){
            System.out.println(n2+" is the largest number.");
        }
        else {
            System.out.println(n3+" is the largest number.");
        }
    }
}
