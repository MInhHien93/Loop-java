package com.interest;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        double money = 1.0, interest_rate = 1.0, total_interest = 0;
        int month = 1;
        System.out.println("Enter investment amount:");
        money = sc.nextDouble();
        System.out.println("Enter a number of month:");
        month = sc.nextInt();
        System.out.println("Enter annual interest rate in percentage:");
        interest_rate = sc.nextDouble();
        for (int i = 0; i < month; i++) {
            total_interest += money * ((interest_rate / 100) / 12) * month;
        }
        System.out.println("Enter investment amount: " + total_interest);

    }
}
