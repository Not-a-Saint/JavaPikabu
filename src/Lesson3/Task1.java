package Lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = scanner.nextInt();

        System.out.println("Enter second number");
        int b = scanner.nextInt();

        scanner.close();

        if (a == b) {
            System.out.println("Numbers are equals");
        } else if (a % 2 == 0) {
            System.out.println("Result of multiplication: " + (a * b));
        } else {

            if (b == 0) {
                System.out.println("Cannot be divided by 0");
            } else {
                System.out.println("Result of  division: " + (double)(a / b));
            }
        }
    }
}
