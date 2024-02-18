package pattern_question;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int n= in.nextInt();
        for(int i=0;i<2*n;i++){
            int col=i>n?2*n-i:i;
            int space=n-col;
            for(int s=0;s<space;s++){
                System.out.print(" ");
            }
            for(int j=0;j<col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
