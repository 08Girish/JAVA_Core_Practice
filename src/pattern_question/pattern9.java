package pattern_question;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int n= in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
