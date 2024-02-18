package practice_question;

import java.util.Scanner;

public class factorial {
    public static void main(String args[]){
        int num,mul=1,i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no for factorial : ");
        num=in.nextInt();
        for(i=1;i<=num;i++){
            mul*=i;
        }
        System.out.println("The factorial of number is : "+mul);
    }
}
