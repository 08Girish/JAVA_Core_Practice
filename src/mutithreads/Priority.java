package mutithreads;
class Setpriority extends Thread
{
    @Override
    public void run() {
        System.out.println("run the thread...");
    }
}
public class Priority {
    public static void main(String[] args) {
        Setpriority t1 = new Setpriority();
        Setpriority t2 = new Setpriority();
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.setPriority(1);
        t2.setPriority(6);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println(Thread.currentThread().getPriority());
    }
}
