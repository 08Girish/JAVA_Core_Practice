package pattern_question;

import java.util.Scanner;

public class pattern6 {
    public static void main(String args[]){
        int n;
        Scanner in=new Scanner(System.in);
        n= in.nextInt();
        for(int i=1;i<=n;i++){
            for(int s=n;s>=n;s--){
                System.out.println(" ");
            }
            for(int j=n;j>=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
