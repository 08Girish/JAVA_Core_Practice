package pattern_question;

import java.util.Scanner;

public class pattern5 {
    public static void main(String args[]) {
        int n;
        System.out.println("Enter the limit:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = n; j >= 0; j--) {
                System.out.print("* " );
            }
            System.out.println();
        }
    }
}