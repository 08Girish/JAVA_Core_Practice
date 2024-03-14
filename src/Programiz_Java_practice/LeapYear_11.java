package Programiz_Java_practice;

import java.util.Scanner;

class LeapYear {
    public Object Leap() {
        boolean leap = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = in.nextInt();
        if (year % 400 == 0) {
            leap = true;
            if (year % 4 == 0 && year % 100 != 0) {
                leap = true;
            } else {
                leap = false;
            }
        } else {
            leap = false;
        }
        if (leap == true) {
            System.out.println("its leap year");
        } else {
            System.out.println("not a leap year ");
        }
        return year;
    }

    public class LeapYear_11 {
        public static void main(String[] args) {
            LeapYear y1 = new LeapYear();
            y1.Leap();
        }
    }
    }

