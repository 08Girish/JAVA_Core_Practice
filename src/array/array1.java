package array;

public class array1 {
    public static void main(String args[]){
        String[] bike={"yamaha","bajaj","tvs","honda"};
        bike[0]="Dominar";
        System.out.println("The array Elements are:" +bike.length);
        for(int i=0;i< bike.length-1;i++) {
            System.out.println("The array Elements are:" + bike[i]);
        }
    }
}
