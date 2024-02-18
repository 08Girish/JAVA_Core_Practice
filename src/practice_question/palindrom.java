package practice_question;

import java.util.Scanner;

public class palindrom {
    public static void main(String args[]){
        int mod,rev=0,num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        num= in.nextInt();
        int temp=num;
        while(num!=0){
            mod=num%10;
            rev=(rev*10)+mod;
            num/=10;
        }
        if(temp==rev){
            System.out.println("The number is palindrom!!");
        }
        else {
            System.out.println("The number is not palindrom!!");
        }
    }
}
