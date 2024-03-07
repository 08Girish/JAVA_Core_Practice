package java_collection;
import java.util.TreeSet;

class student implements Comparable<student>{
    String name;
    int mark;
    int roll;
    public student(String name,int roll,int mark){
        this.name=name;
        this.roll=roll;
        this.mark=mark;
    }

    @Override
    public int compareTo(student i) {
        if(roll>i.roll){
            return 1;
        } else if (roll<i.roll){
            return -1;
        }else{
            return 0;
        }
    }
}
public class Treeset {
    public static void main(String[] args) {
        TreeSet<student> c = new TreeSet<student>();
        student s = new student("girish",14,99);
        student s1 = new student("sanjith",42,77);
        student s2 = new student("Kowchik",35,66);
        c.add(s);
        c.add(s1);
        c.add(s2);
        for(student i: c){
            System.out.println("Name :"+i.name+" "+ "RollNo : " +i.roll+" " +"Marks : " +i.mark);
        }
    }
}
