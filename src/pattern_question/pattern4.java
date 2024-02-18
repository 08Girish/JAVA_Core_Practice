package pattern_question;

import java.util.Scanner;

public class pattern4 {
    public static void main(String args[]){
        int n;
        System.out.println("Enter how many lines :");
        Scanner in=new Scanner(System.in);
        n= in.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }

}

