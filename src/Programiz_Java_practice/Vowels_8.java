//Java Program to Check Whether an Alphabet is Vowel or Consonant
package Programiz_Java_practice;

import java.util.Scanner;

public class Vowels_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the alphabet : ");
        char v= in.next().charAt(0);
        if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u'||v=='A'||v=='E'||v=='I'||v=='O'||v=='U'){
            System.out.println("The Alphabet is a Vowel");
        }
        else {
            System.out.println("The character is not a Vowel");
        }
    }
}
