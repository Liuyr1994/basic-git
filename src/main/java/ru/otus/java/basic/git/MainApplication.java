package ru.otus.java.basic.git;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int b = scanner.nextInt();
            System.out.println("Введите номер операции: 1 +, 2 -, 3 *");
            int operation = scanner.nextInt();
            int result = 0;
            if (operation == 1) {
                result = a + b;
                System.out.println(a + " + " + b + " = " + result);
            } else if (operation == 2) {
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
            } else if (operation == 3) {
                result = a * b;
                System.out.println(a + " * " + b + " = " + result);
                System.out.println("Хотите ли вы выполнить ещё одну операцию?");
                String answer = scanner.next();
                if (!answer.equalsIgnoreCase("y")) {
                    break;
                }
            }
            System.out.println("Работа калькулятора завершена!");
            scanner.close();
        }
    }
}
