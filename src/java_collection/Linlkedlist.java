package java_collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linlkedlist {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<String>();
        name.add("Girish");
        name.add("Sanjith");
        name.add("Rithika");
        System.out.println(name);
        LinkedList<String> name2 = new LinkedList<String>();
        name2.add("Kowchik");
        name2.add("Dhilipan");
        name2.add("Nandha");
        name.addAll(name2);
        System.out.println("Adding two Linked List together : "+name);
        name.addFirst("Ram");
        name.addLast("Janu");
       // System.out.println("Adding first and last element : "+name);
        Iterator namelist = name.iterator();
        while (namelist.hasNext()){
            System.out.println(namelist.next());
        }
    }
}
