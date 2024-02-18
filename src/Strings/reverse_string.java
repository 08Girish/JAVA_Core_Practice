package Strings;

public class reverse_string {
    public static void main(String[] args) {
        StringBuilder a= new StringBuilder("Girish is from Coimbatore");
        System.out.println(a);
        StringBuilder b= new StringBuilder();
        for(int i=a.length()-1;i>=0;i--){
            b.append(a.charAt(i));
        }
        System.out.println(b);
    }
}
