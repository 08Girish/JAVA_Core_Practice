package practice_question;

import java.util.Scanner;

public class fibonacci {
    public static void main(String args[]){
        int num,i,a=-1,b=1,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the range:");
        num=in.nextInt();
        for(i=0;i<=num;i++){
            c=a+b;
            System.out.println(+c);
            a=b;
            b=c;
        }
    }
}
