/*
 * * * *
 * * *
 * *
 *
 */
package pattern_question;

import java.util.Scanner;

public class pattern3 {
    public static void main(String args[]){
        int n;
        System.out.println("Enter the lines:");
        Scanner in=new Scanner(System.in);
        n= in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
