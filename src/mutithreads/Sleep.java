package mutithreads;
class Runloop extends Thread{
    @Override
    public void run() {
        try {
            for(int i=0;i<10;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (InterruptedException e)
        {
            System.out.println(e);
           // throw new RuntimeException(e);
        }
    }
}
public class Sleep {
    public static void main(String[] args) {
        Runloop r1 = new Runloop();
        Thread t1 = new Thread(r1,"LOOP RUNNING...");
        String s1 = t1.getName();
        t1.start();
    }
}
