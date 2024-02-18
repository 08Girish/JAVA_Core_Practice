package practice_question;

import java.util.Scanner;

public class perfectno {
    public static void main(String args[]){
        int i,num,sum=0,mod;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        num=in.nextInt();
        for(i=1;i<num;i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
            if(num==sum){
                System.out.println("The number is a Perfect number");
            }
            else
                System.out.println("The number is Not a Perfect number");
        }
    }

