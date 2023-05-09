package Lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your lastname:");
        String lastname = scanner.nextLine();

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your patronymic :");
        String patronymic = scanner.nextLine();

        scanner.close();

        System.out.println(lastname + " " + name + " " + patronymic);
        System.out.printf("%s %s %s", lastname, name, patronymic);

    }
}
