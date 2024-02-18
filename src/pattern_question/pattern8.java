/*          *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
*/
package pattern_question;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int n= in.nextInt();
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print("  ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
