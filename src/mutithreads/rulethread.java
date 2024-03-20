package mutithreads;

public class rulethread implements Runnable{
    @Override
    public void run() {
        go();
        fishing();
        dog();
        domore();
    }

    private void dog() {
        System.out.println("dog");
        System.out.println(Thread.currentThread());
    }

    private void fishing() {
        System.out.println(Thread.currentThread());
        System.out.println("The executor is fishing to catch threads");
    }

    public void go() {
        System.out.println("gooo");
        System.out.println(Thread.currentThread());
    }

    public void domore() {
        System.out.println("domore");
        Thread.dumpStack();
    }
}
