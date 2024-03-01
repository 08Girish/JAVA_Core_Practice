package java_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<String>();
        str.add("Bajaj");
        str.add("Yamaha");
        str.add("TVS");
        str.add("KTM");
        System.out.println(str);
        Iterator bike = str.iterator();
        while(bike.hasNext()){
            System.out.println(bike.next());
        }
        str.remove("TVS");
        System.out.println(str);
    }
}
