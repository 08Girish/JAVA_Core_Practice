package practice_question;

import java.util.Scanner;

public class sumandavg {
    public static void main(String args[])
    {
        int limit,sum=0,i,a,avg=1;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the no.of limits: ");
        limit=in.nextInt();
        for(i=1;i<=limit;i++){
            System.out.println("Enter the no "+i+" : ");
            a=in.nextInt();
            sum+=a;
            avg=sum/limit;
        }
        System.out.println("Sum of the numbers     : "+sum);
        System.out.println("average of the numbers : "+avg);
    }
}
