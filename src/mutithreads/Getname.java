package mutithreads;
class Name implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread 1 is running...");
    }
}
public class Getname {
    public static void main(String[] args) {
        Name n1 = new Name();
        Thread t1 = new Thread(n1,"Execute thread 1");
        String str = t1.getName();
        System.out.println(str);
        t1.start();
    }
}
