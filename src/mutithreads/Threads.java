package mutithreads;

import java.sql.SQLOutput;

public class Threads {
    public static void main(String[] args) {
        Runnable thread1 = new rulethread();
        Thread threadnew = new Thread(thread1);
        threadnew.start();
        System.out.println(Thread.activeCount());

    }
}
