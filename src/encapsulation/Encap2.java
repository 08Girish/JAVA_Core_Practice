package encapsulation;

public class Encap2 {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.setAge(12);
    s1.setName("ram");
        System.out.println(s1.getName()+" : "+ s1.getAge());
    }
}
