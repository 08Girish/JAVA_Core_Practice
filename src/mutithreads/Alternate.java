package mutithreads;
class Hi extends Thread{
    public void run(){
        for(int i=0;i<=50;i++){
        System.out.println("Hi...");
    }
    }
}
class Hello extends Thread{
    public void run(){
        for(int i=0;i<=50;i++){
            System.out.println("Hello...");
        }
    }
}
public class Alternate {
    public static void main(String[] args) {
        Hi h1 = new Hi();
        Hello h2 = new Hello();
        h1.start();
        try {
            Thread.sleep(2);
        }
        catch (Exception e)
        {
            System.out.println(e);

        }        h2.start();
        h1.setPriority(7);
        h2.setPriority(6);
        }
    }
