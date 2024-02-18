package practice_question;

import java.util.Scanner;

public class reverse {
    public static void main(String args[])
    {
        int mod,rev=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to Reverse:");
        int num=in.nextInt();
        while(num!=0){
            mod=num%10;
            rev=(rev*10)+mod;
            num/=10;
        }
        System.out.println("The reverse of the number is:" +rev);
    }
}
