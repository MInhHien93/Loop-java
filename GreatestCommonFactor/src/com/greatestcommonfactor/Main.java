package com.greatestcommonfactor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int firstNumber, secondNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter  a first number:");
        firstNumber = sc.nextInt();
        System.out.println(" Enter  a second number:");
        secondNumber = sc.nextInt();
        firstNumber = Math.abs(firstNumber);
        secondNumber = Math.abs(secondNumber);
        if (firstNumber == 0 || secondNumber == 0) {
            System.out.println("No greatest common factor!");
        }
         while (firstNumber != secondNumber) {
             if (firstNumber > secondNumber) {
                 firstNumber = firstNumber - secondNumber;
             } else {
                 secondNumber = secondNumber - firstNumber;
             }
         }
        System.out.println(firstNumber);
    }
}
