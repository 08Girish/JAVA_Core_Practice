/*
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 */
package pattern_question;

import java.util.Scanner;

public class pattern2 {
    public static void main(String args[]){
        int n;
        System.out.println("Enter the lines:");
        Scanner in=new Scanner(System.in);
        n= in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
