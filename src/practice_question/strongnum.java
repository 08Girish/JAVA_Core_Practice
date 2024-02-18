package practice_question;

import java.util.Scanner;

public class strongnum {
    public static void main(String args[]) {
        int num, i, sum = 0, fac, mod, o_num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        num = in.nextInt();
        o_num = num;
        while (num > 0) {
            mod = num % 10;
            fac=1;
            for (i = 1; i <= mod; i++) {
                fac *= i;
            }
            sum += fac;
            num = num / 10;
        }
        if (sum == o_num) {
            System.out.println("This is a Strong number!!!");
        }
        else {
            System.out.println("This is a not Strong number!!!");
        }
    }
}

