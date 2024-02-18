package practice_question;

import java.util.Scanner;

public class armstrong {
    public static void main(String args[]){
        int temp,num,num1,num2,num3;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        num=in.nextInt();
        temp=num;
        num3=temp%10;
        temp/=10;
        num2=temp%10;
        temp/=10;
        num1=temp%10;
        int result=(num1*num1*num1)+(num2*num2*num2)+(num3*num3*num3);
        if(result==num){
            System.out.println("The number is armstrong");
        }
        else{
            System.out.println("The number is not armstrong");
        }

    }
}
