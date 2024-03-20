package mutithreads;
class Makepizza extends Thread{
    public  void run(){
        preparation();
        toppings();
        bake();
        cut();
    }

    private void preparation() {
        System.out.println(Makepizza.currentThread().threadId());
        System.out.println("Mix the dough in correct proportion");
    }

    private void toppings() {
        System.out.println(Makepizza.currentThread().threadId());
        System.out.println("Add the toppings as per the need...");
    }

    private void bake() {
        System.out.println(Makepizza.currentThread().threadId());
        System.out.println("Bake for 240c for 20 minutes");
    }

    private void cut() {
        System.out.println(Makepizza.currentThread().threadId());
        System.out.println("Cut as per the size Ordered..");
    }
}
public class Pizza {
    public static void main(String[] args) {
        int pizzacount=5;
        for(int i=1;i<=pizzacount;i++) {
            Makepizza makepizza = new Makepizza();
            makepizza.start();
        }
    }
}
