package practice_question;

import java.util.Scanner;

public class tables {
    public static void main(String args[]){
        int num,i,tab,limit;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the table No :");
        num=in.nextInt();
        System.out.println("Enter the Limit    :");
        limit=in.nextInt();
        for(i=1;i<=limit;i++){
            tab=num*i;
            System.out.println(num+"*"+i+"="+tab);
        }
    }
}
