package array;

import java.util.Arrays;
import java.util.Scanner;

public class Ascending {
        public static void main(String args[]){
           // int n;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the  limit : ");
            int n= in.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter the number a"+i+": ");
                a[i]= in.nextInt();
            }
            System.out.print("Before sorting : "+Arrays.toString(a));
            System.out.println();
            for(int i=0;i<a.length;i++){
               for(int j=i+1;j<a.length;j++){
                   if(a[i]>a[j]){//Ascending order
                       //if(a[i]>a[j]){ //descending order
                       int res=a[i];
                       a[i]=a[j];
                       a[j]=res;
                   }
               }
            }
            System.out.print("After sorting : "+Arrays.toString(a));
        }
}
