package Exception_Handling;

import java.util.Scanner;

class ExceptionPropogation{
    void a()
    {
        int x , y;
        Scanner in = new Scanner(System.in);
        x= in.nextInt();
        y= in.nextInt();
        if(x==0) {
            throw new ArithmeticException("You have entered the divisor as 0");
        }
        try{
            int d= x/y;
            System.out.println("Output : "+d);
        }
        catch (ArithmeticException m1){
            System.out.println(m1);
            m1.printStackTrace();
        }
    }
    void b(){
        a();
    }
    void c(){
        b();
    }
}

public class exhand4 {
    public static void main(String[] args) {
        ExceptionPropogation d1 = new ExceptionPropogation();
        d1.c();
        System.out.println("process Completed..");
    }
}
