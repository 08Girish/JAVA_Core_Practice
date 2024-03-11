package java_collection;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<String>();
        str.add("Audi");
        str.add("BMW");
        str.add("Ford");
        System.out.println(str);
        str.remove("BMW");
        //str.size();
        System.out.println(str.size());

    }
}
