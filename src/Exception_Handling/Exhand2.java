package Exception_Handling;

import java.util.Scanner;

public class Exhand2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        try {
            int a = 20 / s;
            System.out.println("The division of a : " + a);
            try {
                int b = 120 / (s - 1);
                System.out.println("The operation of b : " + b);

                try {
                    int c[] = {1, 2};
                    c[5] = 30;
                    System.out.println("The array value is assigned");
                    for(int i :c){
                        System.out.println(i);
                    }
                } catch (ArrayIndexOutOfBoundsException e2) {
                    System.out.println(e2);
                }
            }

            catch (ArithmeticException e){
                System.out.println("ArithmeticException ERROR..");
            }
        }
        catch (Exception m){
            System.out.println("Some Undefined ERROR....");
        }
        System.out.println("Process Completed");
    }
}
