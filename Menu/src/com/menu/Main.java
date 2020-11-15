package com.menu;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("4. Draw the right triangle");
            System.out.println("5. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
//                    for (int i = 0; i < 3; i++) {
//                        for (int j = 0; j < 7 ; j++) {
//                            System.out.print("*");
//                        }
//                        System.out.print("\n");
//                    }
                    break;
                case 4:
                    System.out.println("Draw the right triangle");
                    // Square edge at the bottom-left
                    for (int i = 1; i < 6; i++) {
                        for (int j = 1; j <i ; j++) {
                            System.out.print("*");
                        }
                        System.out.println("\n");
                    }
                    // Square edge at the top-left
//                    for (int i = 5; i > 0; i--) {
//                        for (int j = 1; j <= i ; j++) {
//                            System.out.print("*");
//                        }
//                        System.out.println("\n");
//                    }
                    break;
                case 5:
                    System.out.println("Draw the isosceles triangle");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }

        } while (choice != 0);

    }
}
