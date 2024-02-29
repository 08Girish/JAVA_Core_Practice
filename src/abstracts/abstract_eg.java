package abstracts;
abstract class cars{
    abstract void price();
    abstract void safety();
    abstract void speed();
    void technology(){
        System.out.println("The Car has Navigation display");
    }
}
class Audi extends cars{

    @Override
    void price() {
        System.out.println("The car Stats  from 12 lac");
    }

    @Override
    void safety() {
        System.out.println("The car has 2 Air bags");
    }

    @Override
    void speed() {
        System.out.println("The car goes upto 200kmph");
    }
}
class BMW extends cars{

    @Override
    void price() {
        System.out.println("The car price starts from 15 lac");
    }

    @Override
    void safety() {
        System.out.println("The car has 4 Air bags");
    }

    @Override
    void speed() {
        System.out.println("The car goes upto 240kmph");
    }
}
class Ford extends cars{

    @Override
    void price() {
        System.out.println("The car price starts from 20 lac");
    }

    @Override
    void safety() {
        System.out.println("The car has 6 air bags");
    }

    @Override
    void speed() {
        System.out.println("The car goes upto 260kmph");
    }
}
public class abstract_eg {
    public static void main(String[] args) {
        Audi A = new Audi();
        BMW B = new BMW();
        Ford F = new Ford();
        A.price();
        A.safety();
        A.speed();
        A.technology();
        System.out.println("-------------------------------------------");
        B.price();
        B.safety();
        B.speed();
        B.technology();
        System.out.println("-------------------------------------------");
        F.price();
        F.safety();
        F.speed();
        F.technology();
    }
}
