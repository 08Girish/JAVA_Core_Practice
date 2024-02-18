package array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class insert_element {
    public static void main(String args[]){
        System.out.println("Enter the array limit : ");
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Array elements a"+i+" : ");
            a[i]= in.nextInt();
        }
        System.out.println("Before Change : "+ Arrays.toString(a));
        System.out.println("Enter the array value : ");
        int val= in.nextInt();
        System.out.println("Enter the array position : ");
        int idx= in.nextInt();
        for(int i=a.length-1;i>idx;i--){
            a[i]=a[i-1];
        }
        a[idx]=val;
        System.out.println("After Change : "+ Arrays.toString(a));
    }
}
