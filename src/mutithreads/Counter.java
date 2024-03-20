package mutithreads;
class counters {
   int quanity = 0;

    public synchronized void increment() {
        quanity++;
    }
}
class Members implements Runnable{
    counters count;
    Members(counters count){
        this.count = count;
    }
    counters counter;
    @Override
    public void run() {
        for (int i=0;i<500;i++){
            counter.increment();
        }
    }
}
public class Counter {
    public static void main(String[] args) {
        counters count = new counters();

        Thread mem1 = new Thread(new Members(count));
        Thread mem2 = new Thread(new Members(count));
        mem1.start();
        mem2.start();
        try {
            mem1.join();
            mem2.join();
        }
        catch (Exception m1){
            System.out.println(m1);
        }
        System.out.println("Final count : "+count.quanity);
    }
}
