package Exception_Handling;

import java.util.Scanner;

public class Exhand3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a<10) {
            throw new ArithmeticException("please enter a number above 10");
        }
        try
        {
            int m=30/a;
            System.out.println("output : "+m);
        }

        catch (ArithmeticException a1)
        {
            System.out.println(a1);
        }

        System.out.println("System process finish..");
    }
}
