package methods;
class methods{
    public void add(){
        int a=15;
        int b=10;
        System.out.println("Addition : "+(a+b));
    }

    public void sub()
    {
        int a=15;
        int b=10;
        System.out.println("Subtraction : "+(a-b));
    }
    public void mul(){
        int a=15;
        int b=10;
        System.out.println("Multiplication : "+(a*b));
    }
    public void div(){
        int a=15;
        int b=10;
        System.out.println("Division : "+(a/b));
    }
}
public class method1 {
    public static void main(String[] args) {
        methods s=new methods();  
        s.add();
        s.sub();
        s.mul();
        s.div();
    }
}