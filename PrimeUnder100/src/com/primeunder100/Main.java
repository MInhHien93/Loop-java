package com.primeunder100;

import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    public static void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = Integer.parseInt(sc.nextLine());
//        int count = 0;
        int num = 2;
        for (int i = 2; i < number; i++) {
            boolean check = isPrime(num);
            if (check) {
                System.out.print(num + ", ");
//                count++;
            }
            num++;
        }
    }

    public static void main(String[] args) {
        // write your code here
        Main.display();
    }
}
