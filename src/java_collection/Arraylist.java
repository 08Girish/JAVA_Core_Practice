package java_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(2);
        num.add(7);
        num.add(25);
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        num1.add(13);
        num1.add(23);
        num1.add(67);
        num.addAll(num1);
        num.addFirst(0);
       // num.clear();
        System.out.println(num);
        Iterator itr = num.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        num.clear();
        System.out.println("LIST : "+num);
    }
}
