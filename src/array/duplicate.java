package array;

import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the Array value : ");
        int num= in.nextInt();
        int a[]=new int[num];
        for(int i=0;i<num;i++){
            System.out.print("a "+i+":");
            a[i]= in.nextInt();
        }
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]&&(i!=j)){
                    System.out.println("Duplicate numbers are : "+a[j]);
                }
            }
        }
    }
}
