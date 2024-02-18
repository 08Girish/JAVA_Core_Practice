package Strings;

public class string1 {
    public static void main(String args[]){
        String clg="The Collage is located at pachapalayam";
        String clg2=" near Perur";
        System.out.println(clg.hashCode());
        System.out.println(clg2.hashCode());
        System.out.println(clg.charAt(2));
        System.out.println(clg.length());
        System.out.println(clg.toUpperCase());
        System.out.println(clg.toLowerCase());
        System.out.println(clg.indexOf("is"));
        System.out.println(clg.concat(clg2));
        System.out.println(clg.replace("located","builed"));

    }
}
