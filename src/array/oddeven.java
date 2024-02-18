package array;

import java.util.Scanner;

public class oddeven {
    public static void main(String args[]){
        int E=0;
        int O=0;
        System.out.println("Enter the limit:");
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int a[]=new int[num];
        for(int i = 0; i<num; i++){
        System.out.println("Enter a number a"+i+":");
        a[i]= in.nextInt();
        }
        for(int element : a){
        if(element%2==0){
            E++;
            }
        else{
            O++;
        }
        }
        System.out.println("No of Odd Numbers : "+O);
        System.out.println("No of Even Numbers: "+E);
    }
}
