package com.display20prime;

import java.util.Scanner;

public class Main {
    public boolean isPrime(int number) {
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
        } return true;
    }

    public void display() {
        Scanner sc = new Scanner(System.in);
        int amount;
        int count = 0, number = 2;
        System.out.println("Enter amount primes: ");
        amount = sc.nextInt();
        while (count < amount) {
            if (isPrime(number)) {
                System.out.print(number + ", ");
                count++;
            }
            number++;
        }
    }

    public static void main(String[] args) {
        // write your code here
        Main number = new Main();
        number.display();
        


    }
}
