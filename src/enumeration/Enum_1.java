package enumeration;

public class Enum_1 {
    public static void main(String[] args) {
       // cars car = new cars();
        for(cars c  : cars.values()){
            System.out.println(c);
        }
        System.out.println("Array value of Ford is :"+cars.valueOf("ford").ordinal());
    }
}
