package abstracts;
abstract class bike{
    abstract void performance();
    void start(){
        System.out.println("Engine Starts");
    }
}
class dominar extends bike{
    void performance(){
        System.out.println("Give Throttle");
    }
}
public class abs1 {
    public static void main(String[] args) {
        dominar d= new dominar();
        d.start();
        d.performance();
    }
}
