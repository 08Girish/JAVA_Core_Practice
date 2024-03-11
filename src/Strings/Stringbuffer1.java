package Strings;

public class Stringbuffer1 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Bajaj ");
        s1.append("Dominar");
        System.out.println(s1);
        s1.insert(1,"400");
        System.out.println(s1);
        s1.replace(3,7,"Green");
        System.out.println(s1);
        s1.delete(1,4);
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);
        //s1.capacity();
        System.out.println(s1.capacity());
    }
}
