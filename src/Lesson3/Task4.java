package Lesson3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        scanner.close();

        if (a % 2 == 0 || b % 3 == 0) {
            System.out.println(a == b);
        }

        if (a % 2 == 0 && a % 3 == 0) {
            double result = Math.pow(a, b);
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                System.out.println("Результат выражения слишком большой!");
            } else {
                System.out.println((int) result);
            }
        }

    }
}
