package variables;
class Dog{
    String bread;
    static int count=4;
    public void Kennel(String bread){
        this.bread=bread;
        Dog.count=3;
        System.out.println("Bread name : " +bread);
        System.out.println("Count of puppies : "+count);
    }
}
public class Static_1 {
    public static void main(String[] args) {
        System.out.println("initial static value : "+Dog.count);
        ++Dog.count;
        System.out.println("initial static value : "+Dog.count);
        Dog k = new Dog();
        Dog k2 = new Dog();
        k.Kennel("Labradour");
        k2.Kennel("Pug");
        //System.out.println("Bread name = "+);
    }
}
