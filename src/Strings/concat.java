package Strings;

public class concat {
    public static void main(String[] args) {
        String str1 = "Girish ";
        int num = 123;
        //System.out.println(str1.concat(num));
        System.out.println(str1.concat(String.valueOf(num)));
        System.out.println(str1 + num);
        System.out.println(str1 + "JAVA");

    }
}
